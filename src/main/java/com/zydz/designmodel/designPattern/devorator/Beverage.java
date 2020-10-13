package com.zydz.designmodel.designPattern.devorator;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:39
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
