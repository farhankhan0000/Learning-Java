package com.ok.learningJava.oops;

public class Test {
    public static void main(String[] args){
    SmartPhone smartphone = new SmartPhone();
    smartphone.capture();
    smartphone.turnOn();
    }
}


class Camera{
    void capture(){
        System.out.println("Phot clicking..");
    }

    void turnOn(){
        System.out.println("turning on..");
    }
}

class MusicPlayer{
    void playMusic(){
        System.out.println("Music playing..");
    }
}

class Phone{
    void call(String number){
        System.out.println("Calling.." + number);
    }
}

class SmartPhone extends Camera{

}