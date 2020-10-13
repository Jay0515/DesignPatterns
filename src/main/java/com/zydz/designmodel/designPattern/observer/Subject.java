package com.zydz.designmodel.designPattern.observer;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:11
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
