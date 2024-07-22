package com.example.hw5;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void chooseFlavor(String flavor);
}
