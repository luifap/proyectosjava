/*
 * Hacer un programa que calcule e imprima 
 *la suma de tres calificaciones
 */
package calificaciones;

import java.util.Scanner;

/**
 *
 * @author LUIFAP
 */
public class Calificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        
        //SE guardan las tres notas
        System.out.print("Digite las tres calificaiones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3; //suma de las tres notas
         
        System.out.println("\nLa suma es: " + suma);
        
    }
    
}
