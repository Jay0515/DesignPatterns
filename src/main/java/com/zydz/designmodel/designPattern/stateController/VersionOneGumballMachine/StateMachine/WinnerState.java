package com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.StateMachine;

import com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.NewGumballMachine;
import com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine.State;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 16:47
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class WinnerState implements State {

    NewGumballMachine newGumballMachine;

    public WinnerState(NewGumballMachine newGumballMachine){
        this.newGumballMachine = newGumballMachine;
    }

    public void insertQuarter(){
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");

    }

    @Override
    public void dispense() {
        System.out.println("You're a winner! You get two gumballs for your quarter");
        newGumballMachine.releaseBall();
        if(newGumballMachine.getCount() == 0){
            newGumballMachine.setState(newGumballMachine.getSoldOutState());
        }else{
            newGumballMachine.releaseBall();
            if(newGumballMachine.getCount()>0){
                newGumballMachine.setState(newGumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops, out of gumballs!");
                newGumballMachine.setState(newGumballMachine.getSoldOutState());
            }
        }
    }
}
