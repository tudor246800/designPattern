package com.neal.HeadFirstPractise.state;

import lombok.Data;

@Data
public class GumBallMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    private State state;
    private String location;
    int count = 0;

    public GumBallMachine(int count, String location) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.location = location;
        if (count > 0)
            state = noQuarterState;
        else
            state = soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void release() {
        System.out.println("given a gumball");
        if (count != 0)
            count = count - 1;
    }


    @Override
    public String toString() {
        return "GumBallMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

}
