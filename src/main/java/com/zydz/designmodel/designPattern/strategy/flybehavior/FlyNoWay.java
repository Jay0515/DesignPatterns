package com.zydz.designmodel.designPattern.strategy.flybehavior;

import com.zydz.designmodel.designPattern.strategy.FlyBehavior;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 9:57
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
