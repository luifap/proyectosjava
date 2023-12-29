package com.luiapp.ciclos;

public class Ciclos {
    public static void main(String[] args) {
        // CICLO WHILE
        System.out.println("Ciclo While");
        int i = 0;

        while (i < 5 ){
            System.out.println("El valo de i es: " + i);
            i++; //i = i + 1
        }

        // CICLO Do  WHILE
        System.out.println("Ciclo Do While");
        i = 0;
        do{
            System.out.println("El valo de i es: " + i);
            i++; //i = i + 1
        }while (i < 5);

        //CICLO FOR
        System.out.println("Ciclo FOR");
        for (int j = 0; j < 5; j++){
            System.out.println("El valor de j es: " + j);
        }
        //CICLO FOR TRADICIONAL
        System.out.println("Ciclo FOR tradicional");
        String[] values = {"a","bb","ccc"};
        for (int m = 0; m < values.length; m++){
            System.out.println(values[m]);
        }
        //CICLO FOREACH
        System.out.println("Ciclo FOREACH");
        for (String str : values){
            System.out.println(str);
        }
    }
}
