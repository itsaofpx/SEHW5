package com.example.hw5;
//6510450691 Podjanin Wachirawittayakul
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);


        System.out.println("Test 1");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        System.out.println("-----------");

        System.out.println("Test 2");
        gumballMachine.insertQuarter();
        gumballMachine.chooseFlavor("Mango");
        gumballMachine.chooseFlavor("Orange");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}