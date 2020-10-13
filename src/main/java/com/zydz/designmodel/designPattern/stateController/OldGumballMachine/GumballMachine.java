package com.zydz.designmodel.designPattern.stateController.OldGumballMachine;

/**
 * @Author:胡彦杰
 * @Date:2020/10/9 10:21
 * @Company: 武汉中原电子信息有限公司
 * @Description:
 */
public class GumballMachine {

    private final static int SOLD_OUT = 0;

    private final static int NO_QUARTER = 1;

    private final static int HAS_QUARTER = 2;

    private final static int SOLD = 4;

    private int state = SOLD_OUT;

    private int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }
    /**
     * 插入硬币后的状态
     */
    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        } else if(state == SOLD_OUT){
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if(state == SOLD){
            System.out.println("Please wait, we're already giving you a gumball");
        }else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
    }

    /**
     * 退回硬币后的状态
     */
    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if(state == SOLD_OUT){
            System.out.println("You can't eject,you haven't inserted a quarter");
        } else if(state == SOLD){
            System.out.println("Sorry, you already turned the crank");
        }else if(state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        }
    }


    /**
     * 顾客试着转动曲柄
     */
    public void turnCrank(){
        if(state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        } else if(state == SOLD_OUT){
            System.out.println("You turned but there's no quarter");
        } else if(state == SOLD){
            System.out.println("Turning twice doesn't get you another gumball!");
        }else if(state == NO_QUARTER){
            System.out.println("You turned but there's no quarter");
        }
    }

    /**
     * 发放糖果
     */
    public void dispense(){
        if(state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        } else if(state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        } else if(state == SOLD){
            System.out.println("A gumball  comes rolling out the slot");
            count = count - 1;
            if(count == 0){
                System.out.println("Opps, out of gumballs!");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
        }else if(state == NO_QUARTER){
            System.out.println("You need to pay first");
        }
    }


    public String toString(){
        String machineState = "";
        if(state == SOLD_OUT){
            machineState = "Machine is sold out";
        }else if(state == NO_QUARTER){
            machineState = "Machine is waiting for quarter";
        }else if(state == HAS_QUARTER){
            machineState = "Machine is waiting for turning crank";
        }else if(state == SOLD){
            machineState = "Machine will provide a gumball for you";
        }
        String res ="\nMighty Gumball, Inc.\n Java-enabled Standing Gumball Model #2004" +
                "\nInventory: " + count +" gumballs" +
                "\n" + machineState + "\n";
        return res;
    }
}
