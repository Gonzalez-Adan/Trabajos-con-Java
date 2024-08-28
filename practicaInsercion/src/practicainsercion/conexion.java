/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainsercion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class conexion {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String user = "postgres";
    String clave = "0129";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5435/lp2-practica-insercion",user,clave);
            //JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos.");
            System.out.println("Conexión exitosa a la base de datos.");
            
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return con;
    }
    
    public void cerrarConexion(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Conexión cerrada.");
       
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
    
    public void insertar_datos(String tabla, String campos, String valores, int mensaje) {
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("insert into " + tabla + " (" + campos + ") values(" + valores + ")");

            switch (mensaje) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Se ha grabado exitosamente", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Se ha grabado exitosamente", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } catch (Exception ex) {
            System.out.println("insert into " + tabla + " (" + campos + ") values(" + valores + ")");
            //JOptionPane.showMessageDialog(null, "Error en la operacion", "ATENCION", JOptionPane.WARNING_MESSAGE);
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
    
    
    
    
    

    
    
    
    
    
    
    
    

