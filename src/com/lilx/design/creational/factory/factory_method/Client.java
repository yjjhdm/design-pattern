package com.lilx.design.creational.factory.factory_method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/10:27
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();
        USCoffeeFactory usCoffeeFactory = new USCoffeeFactory();
        coffeeStore.setFactory(usCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());

    }
}
