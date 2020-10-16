package com.zydz.designmodel.designPattern.flyWeight;

import java.awt.*;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 16:15
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
