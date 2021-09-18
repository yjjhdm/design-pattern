package com.lilx.design.creational.Prototype.demo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/11:17
 * @Description:
 */
public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体的原型对象的创建");
    }

    /**
     * 实现clone接口
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体的原型对象的复制");
        return (Realizetype)super.clone();
    }
}
