package com.zydz.designmodel.designPattern.bridge.device.devices;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 14:35
 * @Company: 武汉中原电子信息有限公司
 * @Description: 设备父类
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
