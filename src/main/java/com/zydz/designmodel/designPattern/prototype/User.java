package com.zydz.designmodel.designPattern.prototype;


/**
 * @Author:胡彦杰
 * @Date:2020/10/13 10:08
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class User {

    private void order(){
        MilkTea milkTeaOfJay = new MilkTea();
        milkTeaOfJay.setType("原味");
        milkTeaOfJay.setSize("中杯");
        showMilkTea(milkTeaOfJay);
        try{
            MilkTea youMilkTea = milkTeaOfJay.clone();
            showMilkTea(youMilkTea);
        }catch (Exception e){
            e.printStackTrace();
        }


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
        user.order();
    }
}
