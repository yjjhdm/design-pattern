package com.lilx.design.creational.factory.factory_method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/12:23
 * @Description:
 */
public class USCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee CreateCoffee() {
            return new USCoffee();
    }
}
