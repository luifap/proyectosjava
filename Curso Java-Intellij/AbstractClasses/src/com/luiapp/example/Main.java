package com.luiapp.example;

public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        Circle c = new Circle();
        s.setSide(3);
        c.setRadius(3);
        System.out.println("Square area: " + s.calculateArea());
        System.out.println("Circle area: " + c.calculateArea());
    }
}
