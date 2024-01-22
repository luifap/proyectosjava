// GUardar un Char
package guardarchar;

import java.util.Scanner;

/**
 *
 * @author LUIFAP
 */
public class GuardarChar {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        char letra;
                
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);
        
        System.out.println("La cadena es: " + letra);
           
      
    }
    
}
