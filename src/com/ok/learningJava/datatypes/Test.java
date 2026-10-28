package com.ok.learningJava.datatypes;

public class Test {
    public static void main(String[] args){
        System.out.println("Narrowing conversion Example: ");
        System.out.println("__________________");
        double doubleValue = 123.456;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;

        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("int: " + intValue);
        System.out.println();
    }
}
