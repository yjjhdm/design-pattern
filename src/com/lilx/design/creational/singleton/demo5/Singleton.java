package com.lilx.design.creational.singleton.demo5;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/14:38
 * @Description:懒汉模式下的静态内部类
 *
 */
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();

    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
