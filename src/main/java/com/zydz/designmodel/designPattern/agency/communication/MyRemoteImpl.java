package com.zydz.designmodel.designPattern.agency.communication;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author:胡彦杰
 * @Date:2020/10/12 11:05
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /**
     * UnicastRemoteObject的构造器需要抛出RemoteException，因此通过该构造器声明RemoteException
     * @throws RemoteException
     */
    public MyRemoteImpl() throws RemoteException{}

    @Override
    public String sayHello() {
        return "Server says,'Hey'";
    }

    public static void main(String[] args){
        try{
            MyRemote service = new MyRemoteImpl();
            /**
             * 客户将使用所注册的名称咋子RMJ registry中寻找到它
             */
            Naming.rebind("RemoteHello",service);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
