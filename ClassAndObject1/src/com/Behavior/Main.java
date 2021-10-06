package com.Behavior;

class Satish{
    boolean hasFur;
    String color;
    int legs,eyes;

    public void walk(){
        System.out.println("Satish is walking");
    }
    public void eat(){
        System.out.println("Satish is eating");
    }
}

public class Main {

    public static void main(String[] args) {

        // create object
        Satish satish1 = new Satish();
        Satish satish2 = new Satish();

        //call the function walk and eat
        satish1.walk();
        satish2.eat();
    }
}
