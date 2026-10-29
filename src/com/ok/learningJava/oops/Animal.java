package com.ok.learningJava.oops;

abstract class Animal {
    abstract void sayHello();
    abstract void sayBye();

    void sleep(){
        System.out.println("zzz...");
    }
}

class Dog extends Animal{

    @Override
    void sayHello(){
        System.out.println("Woof");
    }

    @Override
    void sayBye(){
        System.out.println("Woof");
    }
}