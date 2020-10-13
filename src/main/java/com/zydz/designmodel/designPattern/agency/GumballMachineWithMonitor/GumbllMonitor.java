package com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor;

/**
 * @Author:胡彦杰
 * @Date:2020/10/12 9:26
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class GumbllMonitor {

    NewGumballMachine gumballMachine;

    public GumbllMonitor(NewGumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState().description());
    }

}
