package com.lilx.design.creational.factory.factory_method;



/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/17/10:16
 * @Description:
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory ;

    public void setFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory=coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffeee = coffeeFactory.CreateCoffee();
        coffeee.addmilk();
        coffeee.addsugar();
        return coffeee;

    }
}
