package com.luapp.principal;

import com.luapp.calculadora.Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("*** CALCULADORA ***");
        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;

        System.out.println("Ingresa tú primer número");
        num1 = sc.nextFloat();
        System.out.println("Ingresa el segúndo número");
        num2 = sc.nextFloat();

        Calculadora cal = new Calculadora();
        cal.menu();

        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                //suma
                System.out.println("El resultado es: " + cal.operacionSuma(num1,num2));
                break;
            case 2:
                //resta
                System.out.println("El resultado es: " + cal.operacionResta(num1,num2));
                break;
            case 3:
                //multiplicación
                System.out.println("El resultado es: " + cal.operacionMiltiplicacion(num1,num2));
                break;
            case 4:
                //división
                if (num2 == 0){
                    System.out.println("No es posible dividir  entre cero");
                }else {
                    System.out.println("El resultado es: " + cal.operacionDivision(num1,num2));
                }
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }
}