package org.example.oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
