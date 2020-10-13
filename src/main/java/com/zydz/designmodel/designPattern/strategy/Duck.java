package com.zydz.designmodel.designPattern.strategy;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 9:51
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    /**
     * 展示鸭子
     */
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
