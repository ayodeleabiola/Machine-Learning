import java.awt.Color;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Abiola TheGenius
 */
public class ManageStudentsForm extends javax.swing.JFrame {
    Student std=new Student();
    private JFrame frame;
    private Object firstNameField;
    private Object lastNameField;
    private int id;
    public ManageStudentsForm() {
        initComponents();
       
      new Student().filledStudentTable(table,""); 
      // std.filledStudentTable(table," ");
        ButtonGroup bg;
        bg=new ButtonGroup();
        bg.add(radioMale);
        bg.add(radioFemale);
        radioMale.setSelected(true);
        table.setRowHeight(40);
        table.setShowGrid(true);
        table.setGridColor(Color.yellow);
        table.setSelectionBackground(Color.black);
        System.out.print("NO");
       
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        labelFn = new javax.swing.JLabel();
        labelLn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelBirth = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        matricField = new javax.swing.JLabel();
        fieldFn = new javax.swing.JTextField();
        fieldLn = new javax.swing.JTextField();
        bField = new javax.swing.JTextField();
        fieldPhone = new javax.swing.JTextField();
        fieldMatric = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldAddress = new javax.swing.JTextArea();
        labelAddress = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelSearch = new javax.swing.JLabel();
        fieldSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Manage Students");

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idLabel.setText("Id:");

        idField.setEditable(false);

        labelFn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFn.setText("First Name:");

        labelLn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelLn.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sex:");

        labelBirth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelBirth.setText("Birthday:");

        labelPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPhone.setText("Phone: ");

        matricField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        matricField.setText("Matric No");

        fieldFn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFnActionPerformed(evt);
            }
        });

        fieldLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLnActionPerformed(evt);
            }
        });

        bField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFieldActionPerformed(evt);
            }
        });

        fieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPhoneActionPerformed(evt);
            }
        });

        fieldMatric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMatricActionPerformed(evt);
            }
        });

        radioMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        radioFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioFemale.setText("Female");

        fieldAddress.setColumns(20);
        fieldAddress.setRows(5);
        jScrollPane1.setViewportView(fieldAddress);

        labelAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAddress.setText("Address");

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "First Name", "Last Name", "Sex", "Birthday", "Phone", "Address", "Matric No"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        labelSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSearch.setText("Enter to Search:");

        fieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSearchActionPerformed(evt);
            }
        });
        fieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(254, 254, 254))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRemove)
                        .addGap(48, 48, 48)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelFn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelLn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelBirth))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelPhone))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelAddress))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(matricField)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fieldFn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fieldMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fieldLn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(radioMale)
                                .addGap(37, 37, 37)
                                .addComponent(radioFemale)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel)
                    .addComponent(labelSearch)
                    .addComponent(fieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldFn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFn))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldLn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLn))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioFemale)
                            .addComponent(radioMale)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBirth))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPhone)
                            .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matricField)
                            .addComponent(fieldMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean verifyText(){
     if(fieldFn.getText().equals("")|| fieldLn.getText().equals("")|| bField.getText().equals("") 
                ||fieldPhone.getText().equals("") || matricField.getText().equals("")||idField.getText().equals("")|| fieldAddress.getText().equals("")){
         JOptionPane.showMessageDialog(null,"all field mst be filled"); 
         return false;
     }
     else{
        return true;
      }
       
   }
    
    
    private void fieldMatricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMatricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMatricActionPerformed

    private void fieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPhoneActionPerformed

    private void bFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFieldActionPerformed

    private void fieldLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLnActionPerformed

    private void fieldFnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFnActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int rowIndex=table.getSelectedRow();
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        if(model.getValueAt(rowIndex,3).toString().equals("Male"))
          {
            
            radioMale.setSelected(true);
            radioFemale.setSelected(false);
          }
        else
        {
            radioFemale.setSelected(true);
            radioMale.setSelected(false);
        }
        //System.out.print(model.getValueAt(rowIndex,0));
        idField.setText(model.getValueAt(rowIndex,0).toString());
        fieldFn.setText(model.getValueAt(rowIndex,1).toString());
        fieldLn.setText(model.getValueAt(rowIndex,2).toString());
        bField.setText(model.getValueAt(rowIndex,4).toString());
        fieldPhone.setText(model.getValueAt(rowIndex,5).toString());
        fieldMatric.setText(model.getValueAt(rowIndex,6).toString());
        fieldAddress.setText(model.getValueAt(rowIndex,7 ).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddStudentForm addform=new AddStudentForm();
        addform.setVisible(true);
        addform.pack();
        addform.setLocationRelativeTo(null);
        addform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // MainForm.stdLabel.setText("Students Count= "+Integer.toString(MyFunction.countData("student")));

    }//GEN-LAST:event_btnAddActionPerformed

    private void fieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSearchKeyTyped
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_fieldSearchKeyTyped

    private void fieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSearchKeyPressed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_fieldSearchKeyPressed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       // TODO add your handling code here:
       frame=new JFrame("Exit");
       if(idField.getText().equals(" ")){
           JOptionPane.showMessageDialog(null,"No Student Selected");
        }
       else{
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to delete"," ",
              JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        
        Student stud=new Student();
         stud.delete('u',id); 
         id=Integer.valueOf(idField.getText());
         //stud.display(table,"");
        // MainForm.stdLabel.setText("Student Count="+Integer.toString(MyFunction.countData("Student")));
         //MainForm.stdLabel.setText("Student Count="Integer. toString(MyFunction.countData("Student")));
         idField.setText("");
         fieldFn.setText("");
         fieldLn.setText("");
         radioMale.setSelected(false);
         radioFemale.setSelected(false);
         bField.setText("");
         fieldPhone.setText("");
         matricField.setText("");
         fieldAddress.setText("");
       }   
       }   
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(verifyText()){
        String fName=fieldFn.getText();
        String lName=fieldLn.getText();
        String sex="";
         if(radioMale.isSelected()){
             sex="Male";
         }
         else if(radioFemale.isSelected()){
          sex="Female";
         }
         
         //SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
         String date=bField.getText();
         String phone=fieldPhone.getText();
         String matric=matricField.getText();
         String textArea=fieldAddress.getText();
         id=Integer.valueOf(idField.getText());
        

        Student su=new Student();
        su.update('u',id, fName, lName, sex,date,phone,matric,textArea);
       // MainForm.stdLabel.setText("Student Count="+Integer.toString(MyFunction.countData("Student")));
       // mgt.display(ManageStudentsForm.table,"");
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        // TODO add your handling code here:  
       
    }//GEN-LAST:event_tableKeyReleased

    private void fieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSearchKeyReleased
        // TODO add your handling code here:
         table.setModel(new DefaultTableModel(null,new Object[]{"ID","FIRST NAME","LAST NAME","SEX","BIRTHDAY","PHONE","MATRIC NO","ADDRESS"}));
         new Student().filledStudentTable(table,fieldSearch.getText());
    }//GEN-LAST:event_fieldSearchKeyReleased

    private void fieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSearchActionPerformed
   
   /* private void display(JTable table,String valueToSearch)
    {
        try {
            Connection con=ConnectionFunc.connectMethod();
            PreparedStatement ps;
            String str="select * from student where concat('First_Name','Last_Name','Phone','Address','Matric_Number')like ?";
            ps=con.prepareStatement(str);
            ps.setString(1,"%"+valueToSearch+"%");
            ResultSet rs=ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
   /* public void filledStudentTable(JTable table,String valueToSearch){
         try {
             Connection connect =ConnectionFunc.connectMethod();
             PreparedStatement ps;
             String str="select * from student where concat('First_Name','Last_Name','Phone','Address','Matric_Number')like ?";
             ps=connect.prepareStatement(str);
             ps.setString(8,"%"+valueToSearch+"%");
             ResultSet res=ps.executeQuery();
             DefaultTableModel model=(DefaultTableModel)table.getModel();
             Object[] row;
             while(res.next()){
               row=new Object[7]; 
               //row[0]=res.getInt(1);
              // row[1]=res.getString(2);
               row[2]=res.getString(3);
               row[3]=res.getString(4);
               row[4]=res.getString(5);
               row[5]=res.getString(6);
               row[6]=res.getString(7);
               row[7]=res.getString(8);
               
               model.addRow(row);
             
             }
             
             } 
         catch (SQLException ex) {
             System.out.print(ex.getMessage());
             }
         
         }*/
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageStudentsForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bField;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTextArea fieldAddress;
    private javax.swing.JTextField fieldFn;
    private javax.swing.JTextField fieldLn;
    private javax.swing.JTextField fieldMatric;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBirth;
    private javax.swing.JLabel labelFn;
    private javax.swing.JLabel labelLn;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel matricField;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    public static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

 }

