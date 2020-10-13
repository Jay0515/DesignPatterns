package com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor;

import com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor.StateMachine.*;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 10:21
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class NewGumballMachine {

    private State soldOutState;

    private State noQuarterState;

    private State hasQuarterState;

    private State soldState;

    private State winnerState;

    private State state = soldOutState;

    private int count = 0;

    private String location;

    public NewGumballMachine(String location,int count){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.location = location;
        if(count > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot ...");
        if(count != 0){
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String getLocation() {
        return location;
    }

    public String toString(){
        String machineState = "";
        if(state == soldOutState){
            machineState = "Machine is sold out";
        }else if(state == noQuarterState){
            machineState = "Machine is waiting for quarter";
        }else if(state == hasQuarterState){
            machineState = "Machine is waiting for turning crank";
        }else if(state == soldState){
            machineState = "Machine will provide a gumball for you";
        }
        String res ="\nMighty Gumball, Inc.\n Java-enabled Standing Gumball Model #2004" +
                "\nInventory: " + count +" gumballs" +
                "\n" + machineState + "\n";
        return res;
    }
}
