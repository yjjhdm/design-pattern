package com.lilx.design.creational.singleton.demo7;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/14/15:13
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        writeObject2File();
    }

    public static void writeObject2File() throws Exception {
        Singleton instance =  Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\admin\\Desktop\\a.txt"));
        oos.writeObject(instance);
        oos.close();
    }
}
