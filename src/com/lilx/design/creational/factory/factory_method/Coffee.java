package com.lilx.design.creational.factory.factory_method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/9:54
 * @Description:抽象咖啡类
 */
public abstract class Coffee {
    public abstract String getName();
    public void addsugar(){
        System.out.println("加糖");
    }
    public void addmilk(){
        System.out.println("加奶");
    }
}
