/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MiEmpresa;

import conexion.conectar;
import java.sql.Connection;
import javax.swing.JOptionPane;
import vista.*;




/**
 *
 * @author jpcor
 */
public class Mi_Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     conectar acc = new conectar();
        
     login lg= new login ();
       lg.setVisible(true);
       
    }
    
}
