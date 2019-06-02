package com.neal.HeadFirstPractise.state;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(5,"SH");
        GumballMachineMonitor monitor = new GumballMachineMonitor(gumBallMachine);
        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.ejectQuarter();
        gumBallMachine.turnCrank();
        System.out.println(gumBallMachine);
        monitor.report();

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.ejectQuarter();
        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        System.out.println(gumBallMachine);
    }
}
