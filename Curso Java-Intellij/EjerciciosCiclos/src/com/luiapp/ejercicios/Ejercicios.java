package com.luiapp.ejercicios;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        /*
        * Desarrollar un programa que obtenga el promedio
        * de calificación de un alumno con 5 materias
        * --Solicitar y almacenra la información de las 5 materias
        * --Sumar el total de las calificaciones
        * --Obtener el promedio
        *
        * */

        float [] calificaciones = new float[5];
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        float promedio = 0;

        for (int m = 0; m < calificaciones.length; m++ ){
            System.out.println("Ingrese la calificación " + (m +1));
            calificaciones[m] = sc.nextFloat();
        }
        for (float f : calificaciones){
            suma += f; //suma = suma + f
        }

        promedio = suma / calificaciones.length;
        System.out.println("El promedio del alumno es: " + promedio);


    }
}
