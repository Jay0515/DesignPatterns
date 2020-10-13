package com.zydz.designmodel.designPattern.builder;

import com.zydz.designmodel.designPattern.devorator.condimentDecorator.Milk;

/**
 * @Author:胡彦杰
 * @Date:2020/10/13 10:08
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class User {

    private void buyMilkTea(){
        MilkTea milkTea = new MilkTea.Builder("原味").build();
        showMilkTea(milkTea);

        MilkTea chocolateMilkTea = new MilkTea.Builder("巧克力味").ice(true).build();
        showMilkTea(chocolateMilkTea);

        MilkTea strawberry = new MilkTea.Builder("草莓味").size("大杯")
                .pearl(false).ice(true).build();
        showMilkTea(strawberry);
    }

    /**
     * 展示奶茶的状态
     * @param milkTea
     */
    private void showMilkTea(MilkTea milkTea){
        String pearl = null;
        if(milkTea.isPearl()){
            pearl = "加珍珠";
        }else{
            pearl = "不加珍珠";
        }
        String ice = null;
        if(milkTea.isIce()){
            ice = "加冰";
        }else{
            ice = "不加冰";
        }
        String res = "一份" + milkTea.getType() +"大小为"+milkTea.getType()
                + "," + pearl + "," +ice;
        System.out.println(res);
    }

    public static void main(String[] args){
        User user = new User();
        user.buyMilkTea();
    }
}
