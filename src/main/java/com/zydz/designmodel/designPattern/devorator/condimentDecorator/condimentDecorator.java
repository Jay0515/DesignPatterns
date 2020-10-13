package com.zydz.designmodel.designPattern.devorator.condimentDecorator;

import com.zydz.designmodel.designPattern.devorator.Beverage;
import org.springframework.context.annotation.Bean;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:42
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public abstract class condimentDecorator extends Beverage {
    public abstract String getDescription();
}
