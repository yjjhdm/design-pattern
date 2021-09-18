package com.lilx.design.creational.Prototype.text;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/11:38
 * @Description:
 */
public class CitationClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation student1 = citation.clone();
        //student1.setName("llx");
        Citation student2 = citation.clone();
        //student2.setName("xxx");
        Citation student3 = citation.clone();

        student1.show();
        student2.show();
        student3.show();

    }
}
