package com.lilx.design.creational.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/10:18
 * @Description:
 */
public class CoffeeFactory {
    public Coffeee createCoffee(String name){
        Coffeee coffee = null;
        if ("USCoffee".equals(name)){
            return new USCoffee();
        }else if ("LatteCoffee".equals(name)){
            return new LatteCoffee();
        }else {
            throw new RuntimeException("没有这个咖啡");
        }
    }
}
