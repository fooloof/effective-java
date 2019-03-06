package com.lzh.code.reflex;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public  class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /**-------Class对象--------------------*/
        //获取类 class com.lzh.code.reflex.A
        Class<A> aClass = A.class;
        A a = new A("");
        Class<? extends A> aClass1 = a.getClass();
        try {
            Class<?> aClass2 = Class.forName("com.lzh.code.reflex.A");
        } catch (ClassNotFoundException e) {
        }
        Class<Boolean> type = Boolean.TYPE;

        /**---------类------------------------*/
        // com.lzh.code.reflex.A
        String name = aClass.getName();

        // com.lzh.code.reflex.A
        String canonicalName = aClass.getCanonicalName();

        // A
        String simpleName = aClass.getSimpleName();
        /**-----------------类修饰-------------*/
        //类修饰符合标示位 1
        int modifiers = aClass.getModifiers();

        Modifier.isPublic(modifiers);
        Modifier.isPrivate(modifiers);
        Modifier.isProtected(modifiers);
        Modifier.isStatic(modifiers);
        Modifier.isFinal(modifiers);
        Modifier.isSynchronized(modifiers);
        Modifier.isVolatile(modifiers);
        Modifier.isTransient(modifiers);
        Modifier.isNative(modifiers);
        Modifier.isInterface(modifiers);
        Modifier.isAbstract(modifiers);
        Modifier.isStrict(modifiers);

        /**------------包------------*/
        //包信息 package com.lzh.code.reflex
        Package aPackage = aClass.getPackage();
        //包名 com.lzh.code.reflex
        aPackage.getName();

        /**-----------接口-----------*/
        Class<?>[] interfaces = aClass.getInterfaces();
        //-----------构造函数
        Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<A> constructor = aClass.getConstructor(String.class);
        Parameter[] parameters = constructor.getParameters();
        String name1 = parameters[0].getName();
        try {
            A a1 = constructor.newInstance("123");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        /**---------方法-----------*/
        Method[] methods = aClass.getMethods();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        Method getA = aClass.getMethod("getA", null);
        Class<?>[] parameterTypes = getA.getParameterTypes();
        Class<?> returnType = getA.getReturnType();
        A a2  = new A("");
        Object invoke = getA.invoke(a2);
        /**---------------字段------------*/
        Field[] fields = aClass.getFields();
        Field[] declaredFields = aClass.getDeclaredFields();

        try {
            Field aaa1 = aClass.getField("aaa1");
            Class<?> type1 = aaa1.getType();
            String name2 = aaa1.getName();
            try {
                A a1  = new A("");
                Object o = aaa1.get(a1);
                System.out.println(o);
                aaa1.set(a1,"1");
                System.out.println(aaa1.get(a1));
                System.out.println(a1.aaa1);


            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        /**----------注解--------------*/
        Annotation[] annotations = aClass.getAnnotations();
        /**-----私有属性，方法-----------*/
        A a3  = new A("");
        Field aaaa = null;
        try {
            aaaa = aClass.getDeclaredField("aaaa");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        aaaa.setAccessible(true);
        Object o = aaaa.get(a3);
        /**-----------数组-------------**/
        try {
            Class stringArrayClass = Class.forName("[Lcom.lzh.code.reflex.A;");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
