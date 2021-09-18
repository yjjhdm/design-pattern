package com.lilx.design.creational.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liluxain
 * @Date: 2021/09/18/10:36
 * @Description:
 */
public class CoffeeFactory {
    //定义容器存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<String,Coffee>();
    //创建静态代码块
    static {
        //加载配置文件
        Properties p = new Properties();
        //调用p对象中的的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key,coffee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Coffee createCoffee(String name){
        Coffee coffee = map.get(name);
        return coffee;
    }
}
