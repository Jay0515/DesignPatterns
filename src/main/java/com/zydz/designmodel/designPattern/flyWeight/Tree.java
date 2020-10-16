package com.zydz.designmodel.designPattern.flyWeight;

import java.awt.*;

/**
 * @Author:胡彦杰
 * @Date:2020/10/14 16:15
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
