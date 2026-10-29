package com.ok.learningJava.oops;

public class Test {
    public static void main(String[] args){
    Dog dog = new Dog();
    dog.sayBye();
    dog.sayHello();
    dog.sleep();
    }
}


interface Mobile{
    void makeCall();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Mobile, MusicPlayer{
    @Override
    public void makeCall(){
        System.out.println("Making call....");
    }

    @Override
    public void playMusic(){
        System.out.println("Playing music.....");
    }
}