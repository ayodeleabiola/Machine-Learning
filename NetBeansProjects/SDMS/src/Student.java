import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Student {

    static JTable table;
    Connection connect;
     PreparedStatement stm;
     ResultSetMetaData rsm;
   
     
     
   public void insertDeleteUpdate(char operation,Integer id, String first_Name,String last_Name,
                                   String sex,String birthday,String phone,String address,String Matric_No){
          try {
            connect=ConnectionFunc.connectMethod();
           
            String str=null;
            //int i=1;
           
            if(operation=='i'){
                 str="insert into student (FirstName,LastName,Sex,Birthday,PhoneNumber,Address,Matric_No)values(?,?,?,?,?,?,?)";
                 stm=connect.prepareStatement(str);
                 stm.setString(1, first_Name);
                 stm.setString(2, last_Name);
                 stm.setString(3, sex);
                 stm.setString(4, birthday);
                 stm.setString(5, phone);
                 stm.setString(6, address);
                 stm.setString(7, Matric_No);
            }
            //String query=stm.executeUpdate(str);
             
            if(stm.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"new student added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
         
  }
   //Update Method
   public void update(char operation,Integer id, String first_Name,String last_Name,
                                   String sex,String birthday,String phone,String address,String Matric_No){
        //Update Student
        if(operation=='u'){
        
         try{
             connect=ConnectionFunc.connectMethod();
             String str=null;
            
                 str="update student set FirstName=?,LastName=?,Sex=?,Birthday=?,PhoneNumber=?,Address=?,Matric_No=? where Id=?";
                 stm=connect.prepareStatement(str);
                 
                 stm.setString(1, first_Name);
                 stm.setString(2, last_Name);
                 stm.setString(3, sex);
                 stm.setString(4, birthday);
                 stm.setString(5, phone);
                 stm.setString(6, address);
                 stm.setString(7, Matric_No);
                 stm.setInt(8, id);
                
                 
             if(stm.executeUpdate()>0){
                 JOptionPane.showMessageDialog(null,"Student data Updated successful!");
            }

        }
         catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
   
  //Delete Method
  public void delete(char operation,Integer id){
        //Update Student
        if(operation=='u'){
        
         try{
             connect=ConnectionFunc.connectMethod();
             String str=null;
            
                 str="delete from student where Id=?";
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
   public void display(JTable table,String valueToSearch)
    {
        try {
            Connection con=ConnectionFunc.connectMethod();
            PreparedStatement ps;
            String str="select * from student where concat('First_Name','Last_Name','PhoneNumber','Address','Matric_No')like ?";
            ps=con.prepareStatement(str);
            ps.setString(1,"%"+valueToSearch+"%");
            ResultSet rs=ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void filledStudentTable(JTable table,String valueToSearch){
         try {
              connect =ConnectionFunc.connectMethod();
             PreparedStatement ps;
             String str="select * from student where concat('First_Name','Last_Name','Phone','Address','Matric_No')like ?";
             ps=connect.prepareStatement(str);
             ps.setString(1,"%"+valueToSearch+"%");
             ResultSet res=ps.executeQuery();
             rsm=res.getMetaData();
             int c=rsm.getColumnCount();
             DefaultTableModel df=(DefaultTableModel)table.getModel();
             df.setRowCount(0); 
             
             while(res.next()){ 
              Vector v2=new Vector();
               for(int i=0;i<=c;i++){
               
               v2.add(res.getInt(1));
               v2.add(res.getString(2));
               v2.add(res.getString(3));
               v2.add(res.getString(4));
               v2.add(res.getString(5));
               v2.add(res.getString(6));
               v2.add(res.getString(7));
               v2.add(res.getString(8));
               
              }
              df.addRow(v2);
             } 
        
         
         }
         catch (SQLException ex) {
             System.out.print(ex.getMessage());
             }
    }
}

   
    
     
    
