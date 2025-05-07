import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class Course {
    Connection connect;
    PreparedStatement stm;
    
     public void insertDeleteUpdate(char operation,Integer id, String label,Integer hour){
          try {
            connect=ConnectionFunc.connectMethod();
           
            String str=null;
            int i=1;
           
            if(operation=='i'){
                 str="insert into course (Label,HoursNumber)values(?,?)";
                 stm=connect.prepareStatement(str);
                 stm.setString(1, label);
                 stm.setInt(2, hour);
                 
            }
            //String query=stm.executeUpdate(str);
              
            if(stm.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"new course added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public boolean isCourseExisted( String courseName){
           boolean isExisted=false;
       
            try {
                     Connection con=ConnectionFunc.connectMethod();
                     PreparedStatement ps;
                     String str="select * from course where Label= ?";
                     ps=con.prepareStatement(str);
                     ps.setString(1,courseName);
                     ResultSet rs=ps.executeQuery();

                     if(rs.next()){
                       isExisted= true;
                     }
                 }

                catch (SQLException ex) {
                 Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
                }
              return isExisted;
        } 
   
                    //update course
    public void update(char operation,Integer id,String label,Integer hour){
        //Update Student
        if(operation=='u'){
        
         try{
             connect=ConnectionFunc.connectMethod();
             String str=null;
            
                 str="update course set Label=?,Hours_Number=? where Id=?";
                 stm=connect.prepareStatement(str);
                 
                 stm.setString(1, label);
                 stm.setInt(2, hour);
                 stm.setInt(3,id);
                
                
                 
             if(stm.executeUpdate()>0){
                 JOptionPane.showMessageDialog(null,"Student data Updated successful!");
            }

        }
         catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
   
    //Delete From course table Method
    public void delete(char operation,Integer id){
        //Update Student
        if(operation=='u'){
        
         try{
             connect=ConnectionFunc.connectMethod();
             String str=null;
            
                 str="delete from course where Id=?";
                 stm=connect.prepareStatement(str);
                 stm.setInt(1,id);
                
                 
             if(stm.executeUpdate()>0){
                 JOptionPane.showMessageDialog(null,"Student deleted!");
            }

        }
         catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
  }
    
    //display Method
   public void display(JTable table)
    {
        try {
            Connection con=ConnectionFunc.connectMethod();
            PreparedStatement ps;
            String str="select * from course";
            ps=con.prepareStatement(str);
            ResultSet rs=ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public int getCourse(String courseLabel)
   {
      int courseId=0;
      
       try {
                     Connection con=ConnectionFunc.connectMethod();
                     PreparedStatement ps;
                     String str="select * from course where label= ?";
                     ps=con.prepareStatement(str);
                     ps.setString(1,courseLabel);
                     ResultSet rs=ps.executeQuery();

                     if(rs.next()){
                      courseId=rs.getInt("id");
                     }
                 }

                catch (SQLException ex) {
                 Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
                }

      
      return courseId;
   }
    public void displayCombo(JComboBox combo){
    
        try{
                Connection con=ConnectionFunc.connectMethod();
                PreparedStatement ps;
                String str="select * from course";
                ps=con.prepareStatement(str);
                ResultSet rs=ps.executeQuery();

                while(rs.next()){
                combo.addItem(rs.getString(2));
                }
            }
           catch (SQLException ex) {
            Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}

   
 

   
    

