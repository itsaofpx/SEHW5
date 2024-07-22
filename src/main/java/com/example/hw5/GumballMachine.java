package com.example.hw5;
//6510450691 Podjanin Wachirawittayakul
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State noFlavorChosenState;

    State state = soldOutState;
    int count = 0;
    String flavor;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        noFlavorChosenState = new NoFlavorChosenState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        if (count != 0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getNoFlavorChosenState() {
        return noFlavorChosenState;
    }

    public void chooseFlavor(String flavor) {
        state.chooseFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Gumball Machine [state=" + state + " , count=" + count + "]";
    }
}