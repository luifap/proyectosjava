import java.io.File;
import java.io.IOException;

public class ManipulacionArchivos {
    public static void main(String[] args) {
        File folder = new File("folder");
        File file = new File("archivo.txt");
        try {
            boolean folderCreate = folder.mkdir();
            boolean fileCreate = file.createNewFile();
            if (folderCreate && fileCreate){
                System.out.println("El archivo se creo correctamente");
            }else {
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            System.out.println("Excepcion al crear el archivo " + e);
        }

    }
}
