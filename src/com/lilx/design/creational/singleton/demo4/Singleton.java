package com.lilx.design.creational.singleton.demo4;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/14:28
 * @Description:懒汉式双重检查锁方式
 */
public class Singleton {
    private Singleton(){}
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
