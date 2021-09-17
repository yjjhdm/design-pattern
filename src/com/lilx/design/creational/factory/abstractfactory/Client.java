package com.lilx.design.creational.factory.abstractfactory;

import com.lilx.design.creational.factory.factory_method.USCoffeeFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/17:09
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        USFactory usFactory = new USFactory();
        Coffee coffee = usFactory.createCoffee();
        Dessert dessert = usFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

    }
}
