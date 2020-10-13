package com.zydz.designmodel.designPattern.agency.GumballMachineWithMonitor;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 11:17
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    String description();
}
