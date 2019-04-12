package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestBook {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        Book book=new Book();
//        Book book=new Book(102,"斗破苍穹",36.5);
        //获取Book 类 类型 的实例
        Class<?> clazz = Class.forName("com.reflect.Book");
        //操作类
        //调用构造方法，调用缺省无参的构造方法
        Object book = clazz.newInstance();
        System.out.println(book);
//        调用指定的构造方法1.找到指定的构造方法
//        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);//找参数类型为String的构造方法
//        调用找到的构造方法
//        Object book2=constructor.newInstance("ll");
//        System.out.println(book2);
        //属性的读写
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(book, "斗破苍穹");
        System.out.println(nameField);
        //读属性
        Object bookname = nameField.get(book);
        System.out.println(bookname);
        //方法的调用，获取指定的方法
        Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);
        //调用指定的方法
        setNameMethod.invoke(book, "java高级编程");
        System.out.println(book);
        //调用GetnameLength方法
        Method GetnameLength = clazz.getDeclaredMethod("GetnameLength");
        GetnameLength.setAccessible(true);
        Object nameLength = GetnameLength.invoke(book);
        System.out.println(nameLength);


    }
}
