package com.zydz.designmodel.designPattern.devorator;

import com.zydz.designmodel.designPattern.devorator.beverage.Espresso;
import com.zydz.designmodel.designPattern.devorator.condimentDecorator.Milk;
import com.zydz.designmodel.designPattern.devorator.condimentDecorator.Soy;
import com.zydz.designmodel.designPattern.devorator.condimentDecorator.Whip;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:58
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class StarbazzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println("添加配料后：");
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
