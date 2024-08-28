/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainsercion;

import formulario.registrarDatos;



/**
 *
 * @author gonza
 */
public class PracticaInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Para probar la conexion con la base de datos
        conexion conex = new conexion();
        conex.conectar();
        conex.cerrarConexion();
        
        new registrarDatos().setVisible(true);
    }
    
}
