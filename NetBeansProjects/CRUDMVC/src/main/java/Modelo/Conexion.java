
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private final String base = "tienda";
    private final String user = "root";
    private final String password = "12345";
    private final String url = "jdbc:mysql://127.0.0.1:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion() throws SQLException
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password );
            
           } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

}
