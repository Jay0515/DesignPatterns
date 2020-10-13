package com.zydz.designmodel.designPattern.strategy.quackbehavior;

import com.zydz.designmodel.designPattern.strategy.QuackBehavior;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 9:58
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
