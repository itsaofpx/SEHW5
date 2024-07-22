package com.example.hw5;
//6510450691 Podjanin Wachirawittayakul

public class NoFlavorChosenState implements State {
    GumballMachine gumballMachine;

    public NoFlavorChosenState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You have to choose the flavor first");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("You have chosen the flavor " + flavor);
        gumballMachine.setFlavor(flavor);
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
}
