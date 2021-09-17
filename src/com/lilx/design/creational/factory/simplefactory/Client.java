package com.lilx.design.creational.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/10:27
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        String name = "USCoffee";
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffeee coffeee = coffeeStore.orderCoffee(name);
        System.out.println(coffeee.getName());

    }
}
