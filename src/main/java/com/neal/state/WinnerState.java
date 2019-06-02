package com.neal.HeadFirstPractise.state;

public class WinnerState extends State {

    public WinnerState(GumBallMachine gumBallMachine) {
        super(gumBallMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("not a valid action");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("not a valid action");
    }

    @Override
    public void turnCrank() {
        System.out.println("not a valid action");
    }

    @Override
    public void dispense() {
        System.out.println("winner !!");
        gumBallMachine.release();
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        } else {
            gumBallMachine.release();
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            } else {
                System.out.println("sorry, no gumball for you");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }
}
