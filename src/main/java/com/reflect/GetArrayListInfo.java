package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetArrayListInfo {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<ArrrayList> x = ArrrayList.class;
//        ArrrayList list = null;
//        Class<? extends ArrrayList> x = list.getClass();
        Class<?> clazz = Class.forName("java.util.ArrayList");
//        解析类获取类的信息
//        获取包名
        Package pkg = clazz.getPackage();
        String pkgName = pkg.getName();
        System.out.println(pkgName);
        //获取访问修饰符
        int mod = clazz.getModifiers();
        String modstr = Modifier.toString(mod);
        if (Modifier.isInterface(mod))
            System.out.println(modstr);
        else
            System.out.println(modstr + "class");
        //获取类名
        String className = clazz.getSimpleName();
        System.out.println(className);
        Class<?> supcla = clazz.getSuperclass();
        if (supcla != null)
            System.out.println("extend" + supcla.toGenericString());
        //获取接口
        Class<?>[] ifs = clazz.getInterfaces();
        if (ifs != null && ifs.length != 0) {
            System.out.println("implements");
            for (Class<?> ifName : ifs)
                System.out.println("" + ifName.getSimpleName() + "");
        }
        //获取属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.getModifiers();
            Class<?> fieldType = field.getType();
            String fileName = field.getName();
        }
        //获取方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
//            method.getModifiers();
//            Class<?>  returnType =method.getReturnType();
//            String methodName=method.getName();
//            Class<?>[]pts=method.getParameters();
//            Class<?>[]ets= method.getExceptionTypes();

        }
        //获取构造方法
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            //
        }
        //获取内部类
        Class<?>[] innerClz = clazz.getDeclaredClasses();
        //外部类
        Class<?> outClz = clazz.getDeclaringClass();


    }

}
