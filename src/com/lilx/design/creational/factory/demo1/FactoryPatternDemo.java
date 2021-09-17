package com.lilx.design.creational.factory.demo1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/07/16:00
 * @Description:
 */
public class FactoryPatternDemo {
        //当名称出现错误的话，我们的对象不会返回，返回为null，所以没有对这个判断。
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cricle = shapeFactory.getShape("CIRCLE");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        cricle.draw();
        rectangle.draw();
    }
}
