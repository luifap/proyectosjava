import java.util.Scanner;

public class EvaluarSwitch {
    public static void main(String[] args) {
        /*
        * Recibir un número entero y decir si es par o impar
        *  4 % 2 ->
        *  5 % 2 ->
        *
        * */

        /*
        * System.out.println("Ingresa un número entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int residuo = num  % 2;

        switch (residuo){
            case 0:
                System.out.println("El número es par");
                break;
            default:
                System.out.println("El número es impar");
                break;
        }
        *
        * */

        /*
         * Recibir un número  y decir si que día de la semana es
         *  1 -> Domingo
         *  2 -> Lunes
         *  etc..
         * */
        System.out.println("Ingresa un número entre el 1  y 7: ");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("el día es Domingo");
                break;
            case 2:
                System.out.println("El día es Lunes");
                break;
            case 3:
                System.out.println("El día es Martes");
                break;
            case 4:
                System.out.println("El día es Miercoles");
                break;
            case 5:
                System.out.println("El día es Jueves");
                break;
            case 6:
                System.out.println("El día es Viernes");
                break;
            case 7:
                System.out.println("El día es Sábado");
                break;
            default:
                System.out.println("El número ingresado no es valido");
                break;
         }
    }
}
