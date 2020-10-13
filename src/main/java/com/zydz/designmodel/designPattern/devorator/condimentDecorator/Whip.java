package com.zydz.designmodel.designPattern.devorator.condimentDecorator;

import com.zydz.designmodel.designPattern.devorator.Beverage;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:52
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class Whip extends condimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
