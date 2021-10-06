package com.State;

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
    public void description(){
        System.out.println("I has " + legs +" legs and " + eyes + " eyes ");
    }
}

public class Main {

    public static void main(String[] args) {

        // create object
        Satish satish1 = new Satish();
        Satish satish2 = new Satish();

        satish2.legs = 2;
        satish2.eyes = 2;

        satish1.eyes = 2;
        satish1.legs = 2;

        //call the function walk and eat
        satish1.description();
        satish2.description();
    }
}
