import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFunction {
   
    public static int countData(String tableName)
    {
       int total=0;
       Connection cons=ConnectionFunc.connectMethod();
       Statement stm;
        try {
            stm = cons.createStatement();
            ResultSet res=stm.executeQuery("select COUNT(*) AS 'total'  from "+ tableName);
            while(res.next())
            {
              total=res.getInt(1);
             }
        } catch (SQLException ex) {
             System.out.print(ex.getMessage());
        }
      
         return total;    
    } 
        
}
       

    

