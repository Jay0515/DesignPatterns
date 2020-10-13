package com.zydz.designmodel.designPattern.strategy.duck;

import com.zydz.designmodel.designPattern.strategy.Duck;
import com.zydz.designmodel.designPattern.strategy.flybehavior.FlyNoWay;
import com.zydz.designmodel.designPattern.strategy.flybehavior.FlyWithWings;
import com.zydz.designmodel.designPattern.strategy.quackbehavior.Quack;
import com.zydz.designmodel.designPattern.strategy.quackbehavior.Speak;
import com.zydz.designmodel.designPattern.strategy.quackbehavior.Squeak;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:06
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class YellowRubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a wild duck");
    }

    public YellowRubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
