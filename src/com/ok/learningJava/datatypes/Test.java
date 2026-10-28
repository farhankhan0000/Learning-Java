package com.ok.learningJava.datatypes;

public class Test {
    public static void main(String[] args){
        int a = 1;
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
    }
}
