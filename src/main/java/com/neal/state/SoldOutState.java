package com.neal.HeadFirstPractise.state;

public class SoldOutState extends State {

    public SoldOutState(GumBallMachine gumBallMachine) {
        super(gumBallMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sold out!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out!");
    }
}
