/*
 * Guardar Cadenas pero para esto se define la cadena. con String
 */
package guardarcadenas;

import java.util.Scanner;

/**
 *
 * @author LUIFAP
 */
public class GuardarCadenas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
          
          System.out.print("Digite una cadena: ");
          cadena = entrada.nextLine();
          
          System.out.println("La cadena es: " + cadena);
          
    }
    
}
