 
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class conectar {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/compraventa","root","");
        } catch (Exception e) {
            
                    
        }
        return conectar;
    }
    
}
