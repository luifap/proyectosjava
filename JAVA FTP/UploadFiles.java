


import com.enterprisedt.net.ftp.FTPFile;
import com.enterprisedt.net.ftp.FTPTransferType;
import com.enterprisedt.net.ftp.FileTransferClient;
import com.enterprisedt.util.debug.Level;
import com.enterprisedt.util.debug.Logger;
import java.io.File;

import java.text.SimpleDateFormat;

import java.util.Date;

public class UploadFiles
{
 
  public void UploadFiles(String NE , String mscIp) {
  
    String host = "172.22.87.37";
    String username = "dpgaic28";
    String password = "sncros123";
    
    
      Date today= new Date();
      Date initialFecha= new Date();   
      Date finalFecha= new Date();   
      String patronhoy= "yyMMdd";
      SimpleDateFormat formatohoy = new SimpleDateFormat(patronhoy);
      String Fecha =  formatohoy.format(today);
      finalFecha.setDate(finalFecha.getDate()-1);  
      Fecha  = formatohoy.format(finalFecha);  


      String filename = "CDRSTAT"+Fecha+".LOG";
      String path = "D:\\CONCILIACION\\"+NE+"\\"+filename;
      
      System.out.println("nombre del archivo con la fecha "+filename)  ;
      

  
    String  MensajeEjecucion =  "  \n\n";   
    String  MensajeAnalisis =  "  \n\n"; 
  
      // set up logger so that we get some output

      FileTransferClient ftp = null;

      try {
          // create client
          System.out.println("Creating FTP client");
          ftp = new FileTransferClient();

          // set remote host
          ftp.setRemoteHost(host);
          ftp.setUserName(username);
          ftp.setPassword(password);

          // connect to the server
          System.out.println("Connecting to server " + host);
          ftp.connect();
          System.out.println("Connected and logged in to server " + host);
          
          String directory = ftp.getRemoteDirectory();
          
          System.out.println("Current dir: " + ftp.getRemoteDirectory());
          System.out.println("Changing directory");
          ftp.changeDirectory("ESTADISTICAS/OCCIDENTE/"+NE);
          System.out.println("Current dir: " + ftp.getRemoteDirectory());
          
          ftp.setContentType(FTPTransferType.ASCII);
          
          System.out.println("Uploading file");
          ftp.uploadFile(path, filename);
          System.out.println("File uploaded");


         // Shut down client
          System.out.println("Quitting client");
          ftp.disconnect();

          System.out.println("Example complete");

      } catch (Exception e) {
          e.printStackTrace();
      }
  
  }
  
 
}





