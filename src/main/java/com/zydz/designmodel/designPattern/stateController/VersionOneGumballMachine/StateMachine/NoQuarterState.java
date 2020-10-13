package com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.StateMachine;

import com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.NewGumballMachine;
import com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.State;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 11:34
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class NoQuarterState implements State {

    NewGumballMachine newGumballMachine;

    public NoQuarterState(NewGumballMachine newGumballMachine){
        this.newGumballMachine = newGumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You inserted a quarter");
        newGumballMachine.setState(newGumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
