package com.zydz.designmodel.designPattern.observer;

import java.util.ArrayList;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:16
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class WeatherData implements Subject {

    private float temp;

    private float humidity;

    private float pressure;

    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.update(temp,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }
    /**
     * 设置
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
