package com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor.StateMachine;

import com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor.NewGumballMachine;
import com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor.State;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 11:34
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class SoldOutState implements State {

    NewGumballMachine newGumballMachine;

    public SoldOutState(NewGumballMachine newGumballMachine){
        this.newGumballMachine = newGumballMachine;
    }

    @Override
    public String description() {
        return "Sold out State";
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject,you haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");

    }
}
