package com.zydz.designmodel.designPattern.observer;

/**
 * @Author:胡彦杰
 * @Date:2020/9/30 10:28
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,56,30.5f);
        weatherData.setMeasurements(60,60,28.5f);
        weatherData.setMeasurements(78,90,35.5f);
    }
}
