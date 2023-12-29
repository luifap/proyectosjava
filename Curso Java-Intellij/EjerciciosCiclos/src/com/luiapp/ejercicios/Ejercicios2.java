package com.luiapp.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        /*
        * Desarrolle un programa que pida al usuario adivinar
        * un numero entre 0 y 10. El número se debe generar aleatoriamente.
        * El usuario tiene 3 intentos para adivinar el número.
        * ---Generar el número random entre 0 y 10
        * ---Pedir al usuario que intente adivinar y validar si acerto
        * ---Validar el número de intentos
        * */

        Random r = new Random();
        int randNum = r.nextInt(11);
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        int intentos = 3;

        while (userNum != randNum) {

            System.out.println("Adivina el número aleatorio entre 0 y 10");
            userNum = sc.nextInt();
            if (userNum != randNum){
                intentos--; //intentos = intentos - 1
                System.out.println("Fallaste... intentos restantes: " + intentos);
                if (intentos == 0){
                    System.out.println("Perdiste");
                    System.out.println("El número aleatorio era: " + randNum);
                    break;
                }
            }else {
                System.out.println("***GNASTAE**");
            }
        }

    }
}
