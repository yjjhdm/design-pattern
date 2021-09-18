package com.lilx.design.creational.factory.config_factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/10:53
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        String name = "american";
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(name);
        System.out.println(coffee.getName());
    }
}
