package com.luiapp.example;

import java.util.Set;

public class Square extends Figure{
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
