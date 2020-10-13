package com.zydz.designmodel.designPattern.observer;

import org.omg.CORBA.Object;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:23
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temp;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp +"F degrees and "+ humidity + "% humidity");
    }

    public CurrentConditionsDisplay(Subject weatherData){

        weatherData.registerObserver(this);
    }
}
