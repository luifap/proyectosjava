package com.applui.modificadores;

public class TaxCalculator {
    private double rate = 0.1;

    public double getTaxAmount(double price) {

        return rate * price;
    }
}
