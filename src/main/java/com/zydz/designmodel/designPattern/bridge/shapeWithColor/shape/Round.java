package com.zydz.designmodel.designPattern.bridge.shapeWithColor.shape;

import com.zydz.designmodel.designPattern.bridge.shapeWithColor.Color.IColor;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 10:12
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class Round implements IShape {
    private IColor color;

    public void setColor(IColor color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("绘制"+color.getColor()+"圆形");
    }
}
