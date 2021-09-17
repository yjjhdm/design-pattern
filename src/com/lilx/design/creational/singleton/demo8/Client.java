package com.lilx.design.creational.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/15:13
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1.获取字节码对象
        Class clazz = Singleton.class;
        //2.获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        Singleton singleton1 = (Singleton) cons.newInstance();
        Singleton singleton2 = (Singleton) cons.newInstance();
        System.out.println(singleton1 == singleton2);

    }
}
