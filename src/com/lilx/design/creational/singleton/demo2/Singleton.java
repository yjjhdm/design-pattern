package com.lilx.design.creational.singleton.demo2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/14:09
 * @Description:饿汉式，静态代码块
 */
public class Singleton {
    //创建私有的构造方法
    private Singleton(){}
    //声明Singleton类型的变量但是不赋值
    private static Singleton instance;
    //静态代码块
    static {
        instance=new Singleton();
    }
    //一个对外的获取该类对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
