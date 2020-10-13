package com.zydz.designmodel.designPattern.stateController.OldGumballMachine;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 10:47
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class GumballMachineTest {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.toString());
    }
}
