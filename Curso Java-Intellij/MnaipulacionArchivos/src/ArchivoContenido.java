import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ArchivoContenido {
    public static void main(String[] args) {
        File folder = new File("folder");
        File file = new File("folder\\miPrimerarchivo.txt");
        try {
            boolean folderCreate = folder.mkdir();
            boolean fileCreate = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Aprendiendo a manjer archivos");
            fileWriter.close();
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
