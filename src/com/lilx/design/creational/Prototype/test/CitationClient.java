package com.lilx.design.creational.Prototype.test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/11:38
 * @Description:
 */
public class CitationClient {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //创建原型对象
        Citation citation = new Citation();
        //创建学生对象
        Student student = new Student();
        student.setName("llx");
        citation.setStudent(student);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
        oos.writeObject(citation);
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();
        Student student1 = citation1.getStudent();
        student1.setName("xxx");
        citation.show();
        citation1.show();

    }
}










