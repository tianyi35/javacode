package com.hsp.javacode.chapter22.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-04-11 11:25
 * Version 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //传统方法  new 对象==>调用方法
        //1.使用Properties类，可以读取配置文件
        Properties properties = new Properties();

        properties.load(new FileInputStream("D:\\workspace\\javacode\\src\\main\\java\\com\\hsp" +
                "\\javacode\\chapter22\\reflection\\question\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");

        //2.创建对象，此时无法创建对象


        //3 使用反射机制来解决
        //(1)加载类，返回Class类型的对象cls
        Class<?> cls = Class.forName(classfullpath);
        //(2)通过cls得到你加载类 Cat类的对象实例
        Object o = cls.newInstance();
        System.out.println(o.getClass());
        //(3)通过cls得到你加载类 Cat类的methodName的方法的对象
        //在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);

        //(4)通过method1 调用方法：即通过方法对象来实现调用方法
        //传统方法 对象.方法() , 反射机制 方法.invoke(对象)
        method1.invoke(o);

    }
}
