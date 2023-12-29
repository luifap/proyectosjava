package com.luapp.calculadora;

public class Calculadora {
    public float operacionSuma (float num1, float num2){
        return num1 + num2;
    }

    public  float operacionResta (float num1, float num2){
        return  num1 - num2;
    }

    public float operacionMiltiplicacion (float num1, float num2){
        return num1 * num2;
    }

    public  float operacionDivision (float num1, float num2){
        return  num1/num2;
    }

    public void menu(){
        System.out.println("Seleccione la operación");
        System.out.println("1) suma");
        System.out.println("2) resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) Divición");
    }

}
