package com.neal.HeadFirstPractise.state;

public class NoQuarterState extends State {

    public NoQuarterState(GumBallMachine gumBallMachine) {
        super(gumBallMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert one quarter");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("no quarter");
    }
}
