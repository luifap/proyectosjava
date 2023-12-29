import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivos {
    public static void main(String[] args) {
        File file = new File("lectura.txt");
        try{
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }

        }catch (FileNotFoundException e){
            System.out.println("Excepcion al abrir archivo " + e);
        }


    }
}
