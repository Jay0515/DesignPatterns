package com.zydz.designmodel.designPattern.strategy.duck;

import com.zydz.designmodel.designPattern.strategy.Duck;
import com.zydz.designmodel.designPattern.strategy.FlyBehavior;
import com.zydz.designmodel.designPattern.strategy.flybehavior.FlyWithWings;
import com.zydz.designmodel.designPattern.strategy.quackbehavior.Quack;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:02
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class WildDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a wild duck");
    }

    public WildDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
