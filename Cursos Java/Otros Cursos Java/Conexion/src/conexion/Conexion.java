/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion 
{
    String usuario = "sa";
    String pass = "1234";
    Connection con;
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://Lucia:1433;databaseName=BDelecciones",usuario,pass);
        
        
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error el intentar conectar", "Mensaje", 1);
        }
    }
    
    public Connection getConnectionSql()
    {
        return con;
    }
    
}
