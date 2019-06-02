package com.neal.HeadFirstPractise.state;

public class SoldState extends State {

    public SoldState(GumBallMachine gumBallMachine) {
        super(gumBallMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, it's giving you gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("please wait, it's giving you gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("already giving you gumball");
    }

    @Override
    public void dispense() {
        gumBallMachine.release();
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        } else {
            System.out.println("sold out");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }
}
