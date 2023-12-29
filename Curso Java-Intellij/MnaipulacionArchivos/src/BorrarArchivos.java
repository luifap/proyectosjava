import java.io.File;
 class BorrarArchivos {
    public static void main(String[] args) {
        File file = new File("BorradoArchivo.txt");
        if (file.delete()){
            System.out.println("El arcchivo se borro correctamente");
        }else {
            System.out.println("No se logro eliminar el archivo");
        }
    }
}
