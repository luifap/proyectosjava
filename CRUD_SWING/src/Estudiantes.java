import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Estudiantes {
    private JPanel panel;
    private JTextField idText;
    private JTextField CarreraText;
    private JTextField Telefonoext;
    private JTextField nombreText;
    private JTextField edadText;
    private JTextField apellidoText;
    private JButton ingresarBt;
    private JButton consultarBt;
    private JList lista;
    Connection con;

    public void  conectar(){
        try{
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/learning","root","12345");
            System.out.println("Conectado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

