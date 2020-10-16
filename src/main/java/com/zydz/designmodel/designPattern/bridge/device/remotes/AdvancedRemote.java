package com.zydz.designmodel.designPattern.bridge.device.remotes;

import com.zydz.designmodel.designPattern.bridge.device.devices.Device;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 14:41
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
