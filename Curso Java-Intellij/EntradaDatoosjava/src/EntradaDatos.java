import javax.swing.*;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        /* //Enrada de satos por consola
        *  // pedir enteros por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        int num1 =sc.nextInt();
        System.out.println("Ingrese número: ");
        int num2 =sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
        * */

        /*
        * Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un color");
        String color = sc.nextLine();
        System.out.println("El color es: " + color);
        * */


        //Entrada de datos por cuadro de dialogo

        //1. solicitar datos
        String strNum1 = JOptionPane.showInputDialog("Ingrese número: ");
        String strNum2 = JOptionPane.showInputDialog("Ingresa el otro numero");

        //Parsing de String a int

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int resultado = num1 + num2;

        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);


    }
}
