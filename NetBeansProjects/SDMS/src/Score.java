import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class Score {
   private Connection connect;
   private PreparedStatement stm;
    
    public void insertDeleteUpdate(char operation,Integer id,Integer stuId,Integer courseId,double stuScore,String descrip){
          try {
            connect=ConnectionFunc.connectMethod();
           
            String str=null;
            int i=1;
           
            if(operation=='i'){
                 str=" insert into score(Student_id,courseId,Score,Description) values(?,?,?,?);";
                 stm=connect.prepareStatement(str);
                 stm.setInt(1,stuId);
                 stm.setInt(2,courseId);
                 stm.setDouble(3,stuScore);
                 stm.setString(4,descrip);
                
                 
            }
            //String query=stm.executeUpdate(str);
             
            if(stm.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"new score added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Update Score Method
    
     public void update(char operation,Integer sid,Integer cid,Double combo,String desr){
        //Update Student
        if(operation=='u'){
        
         try{
             connect=ConnectionFunc.connectMethod();
             String str=null;
            
                 str="update score set Student_Id=?,Course_Id=?,Score=?,Description=? where Student_Id=? AND Course_Id=?";
                 stm=connect.prepareStatement(str);
                 
                 stm.setInt(1,sid);
                 stm.setInt(2,cid);
                 stm.setDouble(3,combo);
                 stm.setString(4,desr);
                 stm.setInt(5,sid);
                 stm.setInt(6,cid);
                
                
                 
             if(stm.executeUpdate()>0){
                 JOptionPane.showMessageDialog(null,"score data Updated successful!");
            }

        }
         catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
     
     //Delete From course table Method
    public void delete(char operation,Integer stId,Integer scId){
        //Update Student
        if(operation=='d'){
        
         try{
             connect=ConnectionFunc.connectMethod();
             String str=null;
            
                 str="delete from score where Student_Id=? AND Course_Id=?";
                 stm=connect.prepareStatement(str);
                 stm.setInt(1,stId);
                 stm.setInt(2,scId);
                
                 
             if(stm.executeUpdate()>0){
                 JOptionPane.showMessageDialog(null,"Student deleted!");
            }

        }
         catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
  }
    
    //Method table Display
    public void displayScore(JTable table,String valueToSearch)
    {
        try {
            Connection con=ConnectionFunc.connectMethod();
            PreparedStatement ps;
            String str="select * from score";
            ps=con.prepareStatement(str);
            ResultSet rs=ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
 }
