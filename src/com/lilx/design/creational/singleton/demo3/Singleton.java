package com.lilx.design.creational.singleton.demo3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/14:20
 * @Description:懒汉式线程安全
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static synchronized Singleton getInstance(){

        if (instance==null){
            instance=new Singleton();
        }

        return instance;
    }
}
