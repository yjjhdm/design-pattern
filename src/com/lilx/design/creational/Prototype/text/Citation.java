package com.lilx.design.creational.Prototype.text;

import javax.lang.model.type.ReferenceType;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/11:36
 * @Description:
 */
public class Citation implements Cloneable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(this.name+"被评为三好学生");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
