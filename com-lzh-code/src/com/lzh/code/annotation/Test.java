package com.lzh.code.annotation;

public class Test {
    public static void main(String[] args) {
        A annotation = new A_Default().getClass().getAnnotation(A.class);
        annotation.id();
        annotation.name();
    }
}
