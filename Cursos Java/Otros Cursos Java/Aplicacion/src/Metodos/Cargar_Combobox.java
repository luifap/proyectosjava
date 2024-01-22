/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIFAP
 */
public class Cargar_Combobox {
    
    Pool  metodospool = new Pool();
    
    
    public void consultar_apps(JComboBox cbox_apps){
        
        //Creamos objeto tipo conexion
        java.sql.Connection conectar = null;
        
        //Creamos la consulta de SQL
        String SSQL = "SELECT nombre_app FROM app ORDER BY nombre_app ASC";
        
        //Establecemos bloque  try-catch-finally
        try{
            //Establecemos conexión con la BD
            conectar = metodospool.dataSource.getConnection();
            //Preparar la consulta SQL
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecuta la secuencia SQL  
            ResultSet result = pst.executeQuery();
            
            //Ingresamos información a la lista desplegable
            cbox_apps.addItem("Seleccione una opción");
            
            
            while(result.next()){
                cbox_apps.addItem(result.getString("nombre_app"));
                
            }
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            
            if(conectar!=null){
                
                try {
                    conectar.close();
              
                } catch (SQLException ex) {
                    
                    JOptionPane.showMessageDialog(null, ex);
                    
                }
            }
            
        }
        
    } 
    
}
