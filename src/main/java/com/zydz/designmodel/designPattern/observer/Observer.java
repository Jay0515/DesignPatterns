package com.zydz.designmodel.designPattern.observer;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:13
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
