package com.example.hw5;
//6510450691 Podjanin Wachirawittayakul
public class WinnerState implements State {
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Give machine a second, we're already giving you a gumball");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have already turned the crank");
    }
    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        System.out.println("A " + gumballMachine.getFlavor() + " gumball comes rolling out the slot");

        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("A " + gumballMachine.getFlavor() + " gumball comes rolling out the slot");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("You can't choose a flavor after turning the crank");
    }
}