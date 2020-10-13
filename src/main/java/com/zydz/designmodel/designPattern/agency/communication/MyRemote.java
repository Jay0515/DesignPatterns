package com.zydz.designmodel.designPattern.agency.communication;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author:胡彦杰
 * @Date:2020/10/12 10:46
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
