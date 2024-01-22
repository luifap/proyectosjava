
 
import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;


public class PrincipalCDRSTAT  {

 public static void main(String[] args) {
 

    LoginFireWallTecnica  loginFireWallTecnica = new LoginFireWallTecnica();  
   // LoginFireWallCali loginFireWallCali = new LoginFireWallCali();      
    
    loginFireWallTecnica.LoginFireWall(); 
   // loginFireWallCali.LoginFireWall();     
          
    DownloadFile DownloadFile = new DownloadFile();
    UploadFiles UploadFiles = new UploadFiles();    
    WriteFile WriteFile = new WriteFile();    

    ConexionMySqlAction ConexionMySqlAction = new ConexionMySqlAction(); 
    
           NeVO networkElement = new NeVO();
           networkElement.setTypeNE("MSS");
           //networkElement.setNameNE("MSS01ING");
           networkElement.setPropio(new Long (1));    

           Collection listIpAllNe = ConexionMySqlAction.findIpAllNe(networkElement);
           
            if(!listIpAllNe.equals(null) && listIpAllNe.size()!=0 && listIpAllNe!=null){
               Iterator it = listIpAllNe.iterator(); // Itera cada registro de la BSCs encontradas
               NeVO nElementFound = new NeVO();
            
            while ( it.hasNext() ) {
                nElementFound = (NeVO) it.next();
                
                  String mscName = nElementFound.getNameNE(); 
                  String mscIp = nElementFound.getIpAddressNE(); 
                  
                  DownloadFile.DownloadFiles(mscName,mscIp);
                  WriteFile.ReadWriteFiles(mscName,mscIp);
                  UploadFiles.UploadFiles(mscName,mscIp);                  
                
                }
            }


         System.out.println("Fin!!!!");
 
        }
  
  }










