package com.zydz.designmodel.designPattern.stateController.VersionOneGumballMachine;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 11:17
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
