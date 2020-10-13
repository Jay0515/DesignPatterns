package com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.StateMachine;

import com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.NewGumballMachine;
import com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.State;

import java.util.Random;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 11:34
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class HasQuarterState implements State {

    NewGumballMachine newGumballMachine;

    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(NewGumballMachine newGumballMachine){
        this.newGumballMachine = newGumballMachine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        newGumballMachine.setState(newGumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (newGumballMachine.getCount() > 1)){
            newGumballMachine.setState(newGumballMachine.getWinnerState());
        }else{
            newGumballMachine.setState(newGumballMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
