import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;

        System.out.println("Ingresa tú primer número");
        num1 = sc.nextFloat();
        System.out.println("Ingresa el segúndo número");
        num2 = sc.nextFloat();

        System.out.println("Seleccione la operación");
        System.out.println("1) suma");
        System.out.println("2) resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) Divición");

        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                //suma
                float suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;
            case 2:
                //resta
                float resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                //multiplicación
                float multiplicacion = num1 * num2;
                System.out.println("El resultado es: " + multiplicacion);
                break;
            case 4:
                //división
                if (num2 == 0){
                    System.out.println("No es posible dividir  entre cero");
                }else {
                    float division = num1 / num2;
                    System.out.println("El resultado es: " + division);
                }
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }
}
