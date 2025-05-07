import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection
   {
    private Connection con;
    private Statement stm;
    
    
    public MyConnection()
    {
   try {
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sims","root","abiola123");
         stm=con.createStatement();
      } 
    catch (SQLException ex) {
          System.out.println(ex.getMessage());
      
      }
    }
   
    
  public ResultSet select(String Query){
         ResultSet res = null;
        try {
              res= stm.executeQuery(Query);
           } 
        catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return res;
   }
 }  
   
 