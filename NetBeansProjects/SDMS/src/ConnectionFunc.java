import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionFunc {
    
   public static Connection connectMethod(){
        String url="jdbc:mysql://localhost/sims?serverTimezone=UTC";
        String user="root";
        String password="abiola123";       
        Connection con=null;
        try {
               con=DriverManager.getConnection(url,user,password);
            } 
         catch (SQLException ex) {
                 System.out.print (ex.getMessage());
            }
                return con;
         }
    }