package com.zydz.designmodel.designPattern.flyWeight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 16:17
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    /**'
     * 存储享元类的状态
     * @param name
     * @param color
     * @param otherTreeData
     * @return
     */
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
