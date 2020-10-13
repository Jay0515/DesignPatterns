package com.zydz.designmodel.designPattern.prototype;

import javax.validation.constraints.NotNull;

/**
 * @Author:胡彦杰
 * @Date:2020/10/12 16:49
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class MilkTea implements Cloneable{
    private String type;
    private String size;
    private boolean pearl;
    private boolean ice;

    @NotNull
    @Override
    protected MilkTea clone() throws CloneNotSupportedException{
        return (MilkTea) super.clone();
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

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPearl(boolean pearl) {
        this.pearl = pearl;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
