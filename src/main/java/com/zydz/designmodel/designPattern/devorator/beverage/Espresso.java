package com.zydz.designmodel.designPattern.devorator.beverage;

import com.zydz.designmodel.designPattern.devorator.Beverage;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:44
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
