package com.example.hw5;
//6510450691 Podjanin Wachirawittayakul
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);


        System.out.println("-----1st-----");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}