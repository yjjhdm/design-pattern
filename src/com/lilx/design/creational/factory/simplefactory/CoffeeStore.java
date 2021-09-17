package com.lilx.design.creational.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/10:16
 * @Description:
 */
public class CoffeeStore {

    public Coffeee orderCoffee(String name){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffeee coffee = coffeeFactory.createCoffee(name);
        return coffee;
    }

}
