package com.neal.HeadFirstPractise.state;

import java.util.Random;

public class HasQuarterState extends State {
    Random random = new Random();

    public HasQuarterState(GumBallMachine gumBallMachine) {
        super(gumBallMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already has one");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject quarter");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("turn crank");
        int winner = random.nextInt(10);
        if (winner == 0 && gumBallMachine.getCount() > 1) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("not a valid action");
    }
}
