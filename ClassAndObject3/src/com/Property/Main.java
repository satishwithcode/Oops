package com.Property;

class Dog{
    String breed,name;
    public void jump(){
        System.out.println("my dog " + name + " jumped ");
    }
    public void description(){
        System.out.println("my dog's name is " + name + " and it's breed is " + breed);
    }

}

public class Main {

    public static void main(String[] args) {

        // create object
       Dog husky = new Dog();
       Dog poodle = new Dog();

       husky.breed = "Husky";
       husky.name = "Browny";

       poodle.breed = "poodle";
       poodle.name = " Mr jayanti lal ji";

       husky.jump();
       husky.description();

       poodle.jump();
       poodle.description();
    }
}
