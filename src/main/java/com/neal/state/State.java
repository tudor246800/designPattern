package com.neal.HeadFirstPractise.state;

public abstract class State {

    GumBallMachine gumBallMachine;

    public State(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();

}
