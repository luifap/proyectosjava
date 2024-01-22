

import java.io.*;
import java.net.*;
import java.net.URL;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class LoginFireWallTecnica  {
  public void LoginFireWall() {

    String servidor = "172.22.59.2 259"; // !!!!!
    int puerto = 259;   // puerto Firewall

		try {
      Socket socket = new Socket( servidor,puerto );
      BufferedReader entrada = new BufferedReader(new InputStreamReader( socket.getInputStream() ) );// Conseguimos el canal de entrada    
      System.out.println( entrada.readLine() );           
      PrintWriter salida = new PrintWriter( new OutputStreamWriter( socket.getOutputStream() ),true ); // Conseguimos el canal de salida
      salida.println( "aplica2" );
      System.out.println( entrada.readLine() );      
      salida.println( "P4mdb0n0");
      System.out.println( entrada.readLine() );
      salida.println( "1");
      System.out.println( entrada.readLine() );  
      socket.close(); 

		} catch (ConnectException exC) {
			System.out.println("Se produjo un error en el FireWall por Conexion.");
			System.err.println(exC);
      System.out.println("IO Exception: " + exC.getMessage(  ));      
      
		} catch (IOException e) {
      System.out.println("IO Exception: " + e.getMessage(  ));
	    e.printStackTrace();
      
    } catch (Exception ex) {
			System.out.println("Se produjo un error en el FireWall.");
			System.err.println(ex);
      System.out.println("IO Exception: " + ex.getMessage(  ));      
		}

  
  }
}