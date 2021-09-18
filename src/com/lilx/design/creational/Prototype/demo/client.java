package com.lilx.design.creational.Prototype.demo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/11:27
 * @Description:
 */
public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println("两次创建的原型是否一样" + (realizetype==clone));
    }
}
