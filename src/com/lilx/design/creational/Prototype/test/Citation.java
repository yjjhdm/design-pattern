package com.lilx.design.creational.Prototype.test;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/11:36
 * @Description:
 */
public class Citation implements Cloneable, Serializable {
    /*
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "student=" + student +
                '}';
    }

    public void show(){
        System.out.println(student.getName()+"被评为三好学生");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
