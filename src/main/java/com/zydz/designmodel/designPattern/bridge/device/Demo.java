package com.zydz.designmodel.designPattern.bridge.device;

import com.zydz.designmodel.designPattern.bridge.device.devices.Device;
import com.zydz.designmodel.designPattern.bridge.device.devices.Radio;
import com.zydz.designmodel.designPattern.bridge.device.devices.TV;
import com.zydz.designmodel.designPattern.bridge.device.remotes.AdvancedRemote;
import com.zydz.designmodel.designPattern.bridge.device.remotes.BasicRemote;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 14:42
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
