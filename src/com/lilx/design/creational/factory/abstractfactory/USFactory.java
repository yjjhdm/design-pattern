package com.lilx.design.creational.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/14:58
 * @Description:
 */
public class USFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new USCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
