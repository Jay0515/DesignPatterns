package com.zydz.designmodel.designPattern.devorator.beverage;

import com.zydz.designmodel.designPattern.devorator.Beverage;

import java.util.Hashtable;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:45
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
