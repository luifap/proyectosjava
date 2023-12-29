package com.applui.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();
        animal.attack();

        Animal[] animals =new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal a : animals){
                a.eat();
        }

    }
}
