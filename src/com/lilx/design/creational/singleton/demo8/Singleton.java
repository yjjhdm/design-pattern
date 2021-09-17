package com.lilx.design.creational.singleton.demo8;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/15:13
 * @Description:
 */
public class Singleton {
    private static boolean flag = false;
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();

    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
