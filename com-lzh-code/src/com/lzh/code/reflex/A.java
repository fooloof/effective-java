package com.lzh.code.reflex;

public class A {


    private String aaa;
    private final String aaaa = null;
    private static String aaaaa;
    private final static  String aaaaaa = null;


    public String aaa1 = "23";
    public final String aaaa1 = null;
    public static String aaaaa1;
    public final static  String aaaaaa1 = null;

    public A(String aaa) {
        this.aaa = aaa;
    }

    public String getA(){
        System.out.println("getA");
        return "";
    }
}
