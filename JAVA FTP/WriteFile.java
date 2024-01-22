

import com.enterprisedt.net.ftp.FTPTransferType;
import com.enterprisedt.net.ftp.FileTransferClient;
import com.enterprisedt.util.debug.Level;
import com.enterprisedt.util.debug.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Date;

public class WriteFile {
    
    public void ReadWriteFiles(String NE , String mscIp) {
    
      String host = mscIp;
      File archivo = null;
      FileReader fr = null;
      boolean logeo = false;
      boolean token = false;  
    
        Date today= new Date();
        Date initialFecha= new Date();   
        Date finalFecha= new Date();   
        String patronhoy= "yyMMdd";
        String patronMSS= "yyyy-MM-dd";
        SimpleDateFormat formatohoy = new SimpleDateFormat(patronhoy);
        SimpleDateFormat formatoMSS = new SimpleDateFormat(patronMSS);
        String Fecha =  formatohoy.format(today); 
        String FechaMSS =  formatoMSS.format(today); 
        String initialDate = " ";
        String finallDate = " ";
        
        initialDate  = formatohoy.format(initialFecha);
        finalFecha.setDate(finalFecha.getDate()-1);  
        finallDate  = formatohoy.format(finalFecha);  
        Fecha= finallDate;
        FechaMSS= formatoMSS.format(finalFecha);  
        
        String MensajeAnalisis = "";
    
        String File = "CDRSTAT1.TXT";
        String DownloadFile = "CDRSTAT"+Fecha+".LOG";
         
            int i = 1;
            try {
                   archivo = new File ("D:\\CONCILIACION\\"+NE+"\\"+File);
                   String linea;
                   String  Messages= " ";
                   String  mss= NE;
                
                logeo = false;
                token = false;
                  
                    fr = new FileReader (archivo);
                    BufferedReader br = new BufferedReader(fr);
                    while((linea=br.readLine())!=null){
                   
                        String respuesta = linea;
                        
                        if (respuesta.startsWith("MSCi      "+mss+"                  "+FechaMSS+"") ) {
                            token=true;
                        }else if(token==true) {
                            Messages = linea;
                            MensajeAnalisis += Messages+" \n";
                        }if (respuesta.startsWith("REMOVE PACKAGE(S) :") ) {
                            token=false;
                        }
                        i=i+1;
                    }
                    
                
                    
            }
            catch(IOException e){
                System.out.println(e);
            }finally{
                    try{                    //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
                         if( fr != null){   //al final del primer try, y ha dado un error antes, pasaría
                            fr.close();     //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
                         }                  //cerrarlo aquí, comprobando que no sea -por un error anterior, como
                       }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
                         System.out.println(e);
                       }
             }
             
        File directorio = new File("D:\\CONCILIACION\\"+NE+"\\");
        if (directorio.mkdirs())
        System.out.println("Se ha creado directorio");
        else
        System.out.println("El Directorio ya existe");
        
        File fichero = new File (directorio.getPath()+"\\"+DownloadFile);
        try {
        // A partir del objeto File creamos el fichero físicamente
        if (fichero.createNewFile())
        System.out.println("El fichero se ha creado correctamente");
        else
        System.out.println("No ha podido ser creado el fichero");
        } catch (IOException ioe) {
        ioe.printStackTrace();
        }

        
        try {

        File TextFile = new File(directorio.getPath()+"\\"+DownloadFile);
        FileWriter TextOut = new FileWriter(TextFile);
        TextOut.write(MensajeAnalisis);
        TextOut.close();
        
        } catch (IOException ioe) {
        ioe.printStackTrace();
        }
    
    }
}
