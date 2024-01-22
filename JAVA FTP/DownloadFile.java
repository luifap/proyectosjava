
 
import com.enterprisedt.net.ftp.FTPTransferType;
import com.enterprisedt.net.ftp.FileTransferClient;
import com.enterprisedt.util.debug.Level;
import com.enterprisedt.util.debug.Logger;
import java.io.File;
 
 public class DownloadFile
{
 
  public void DownloadFile(String NE , String mscIp) {
  
    String host = mscIp;
    String username = "SWSYNC";
    String password = "S1NCR0";
    String filename = "CDRSTAT1.TXT";
  
    String  MensajeEjecucion =  "  \n\n";   
    String  MensajeAnalisis =  "  \n\n"; 
  


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
          
          ftp.changeDirectory("COMCALOUT");

          ftp.setContentType(FTPTransferType.ASCII);

          System.out.println("Downloading file");
          ftp.downloadFile("D:\\CONCILIACION\\"+NE, filename);
          System.out.println("File downloaded");

         // Shut down client
          System.out.println("Quitting client");
          ftp.disconnect();

          System.out.println("Example complete");

      } catch (Exception e) {
          e.printStackTrace();
      }
  
  }
  
 
}




