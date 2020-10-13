package com.zydz.designmodel.designPattern.builder;

import com.zydz.designmodel.designPattern.devorator.condimentDecorator.Milk;

import java.io.BufferedReader;
import java.util.Map;

/**
 * @Author:胡彦杰
 * @Date:2020/10/12 16:49
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class MilkTea {
    private final String type;
    private final String size;
    private final boolean pearl;
    private final boolean ice;

    private MilkTea(Builder builder){
        this.type = builder.type;
        this.size = builder.size;
        this.pearl = builder.pearl;
        this.ice = builder.ice;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isPearl() {
        return pearl;
    }

    public boolean isIce() {
        return ice;
    }

    public static class Builder{

        private final String type;

        private String size = "中杯";
        private boolean pearl = true;
        private boolean ice = false;

        public Builder(String type){
            this.type = type;
        }

        public Builder size(String size){
            this.size = size;
            return this;
        }

        public Builder pearl(boolean pearl){
            this.pearl = pearl;
            return this;
        }

        public Builder ice(boolean ice){
            this.pearl = pearl;
            return this;
        }

        public MilkTea build(){
            return new MilkTea(this);
        }
    }
}
