package com.neal.HeadFirstPractise.state;

public class GumballMachineMonitor {
    GumBallMachine gumBallMachine;

    public GumballMachineMonitor(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void report() {
        System.out.println("Current location " + gumBallMachine.getLocation());
        System.out.println("Current inventory " + gumBallMachine.getCount());
        System.out.println("Current state " + gumBallMachine.getState());

    }
}
