package com.zydz.designmodel.designPattern.strategy;

import com.zydz.designmodel.designPattern.strategy.duck.WildDuck;
import com.zydz.designmodel.designPattern.strategy.flybehavior.FlyNoWay;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:08
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class DuckTestSimulator {

    public static void main(String[] args){
        Duck wildDuck = new WildDuck();
        FlyBehavior flyNoWay = new FlyNoWay();
        wildDuck.display();
        wildDuck.performFly();
        wildDuck.performQuack();
        System.out.println("A hunter shoot the wild duck wings,and then");
        wildDuck.setFlyBehavior(flyNoWay);
        wildDuck.performFly();
    }
}
