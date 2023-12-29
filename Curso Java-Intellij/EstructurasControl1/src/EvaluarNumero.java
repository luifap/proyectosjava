import java.util.Scanner;

public class EvaluarNumero {
    public static void main(String[] args) {
         /*
         * Recibir un número entero y decir si es par o impar
         *  4 % 2 -> 0
         *  5 % 2 -> 1
         * */
        System.out.println("Ingrese un número entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int residuo = num % 2;

        //Con if y else

        /*
        * if ( residuo == 0){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        }
        * */



        //con código ternario

        String resultado = (residuo == 0) ? "El número es par" : "El número es impar";

        System.out.println(resultado);

    }

}
