package com.lilx.design.creational.singleton.demo1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/12:00
 * @Description:饿汉式静态成员变量
 */
public class Singleton {
    //创建私有的构造方法，目的是为了不让外界创建
    private Singleton(){}
    //这本类中创建本类对象
    private static Singleton instance = new Singleton();
    //提供一个公共的访问方式
    public static Singleton getInstance(){
        return instance;
    }
}
