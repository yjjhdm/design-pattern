package com.lilx.design.creational.factory.factory_method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/12:24
 * @Description:
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee CreateCoffee() {
           return new LatteCoffee();
    }
}
