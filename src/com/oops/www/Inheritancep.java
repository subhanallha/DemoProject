package com.oops.www;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// inheriting
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritancep {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();

        // Access from the parent class (Animal)
        myDog.eat();
        myDog.sleep();

        // Access from the child class (Dog)
        myDog.bark();
    }
}
