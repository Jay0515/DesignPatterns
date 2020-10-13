package com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor;


/**
 * @Author:胡彦杰
 * @Date:2020/10/9 14:07
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class NewGumballMachineTest {
    public static void main(String[] args){
        NewGumballMachine newGumballMachine = new NewGumballMachine("Seattle",112);

        GumbllMonitor gumbllMonitor = new GumbllMonitor(newGumballMachine);
        gumbllMonitor.report();
        newGumballMachine.insertQuarter();
        newGumballMachine.turnCrank();

        System.out.println(newGumballMachine.toString());
        gumbllMonitor.report();
        newGumballMachine.insertQuarter();
        newGumballMachine.turnCrank();
        newGumballMachine.insertQuarter();
        newGumballMachine.turnCrank();

        System.out.println(newGumballMachine.toString());
        gumbllMonitor.report();
    }
}
