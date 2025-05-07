
import javax.swing.ButtonGroup;
public class Calculator extends javax.swing.JFrame {

    private double numberEnter1;
    private double numberEnter2;
    private double result;
    private ButtonGroup bg;
    
    String op;
    public Calculator() {
        initComponents();
        bg=new ButtonGroup();
        bg.add(btnON);
         bg.add(btnOFF);
       disable();
    }
    public void enterNumber(String q){
        String num=resultField.getText()+q;
        resultField.setText(num);
    }
    public void enable(){
        btnOFF.setEnabled(true);
        btnBack.setEnabled(true);
        btnClear.setEnabled(true);
        btnClear2.setEnabled(true);
        jButton20.setEnabled(true);
        btnDot.setEnabled(true);
        btn9.setEnabled(true);
        btn8.setEnabled(true);
        btn7.setEnabled(true);
        btn6.setEnabled(true);
        btn5.setEnabled(true);
        btn4.setEnabled(true);
        btn3.setEnabled(true);
        btn2.setEnabled(true);
        btn1.setEnabled(true);
        btn0.setEnabled(true);
        btnDiv.setEnabled(true);
        btnAdd.setEnabled(true);
        btnSub.setEnabled(true);
        btnMulti.setEnabled(true);
        btnEqual.setEnabled(true);
    }
    
    
     public void disable(){
         btnON.setEnabled(true);
        btnBack.setEnabled(false);
        btnClear.setEnabled(false);
        btnClear2.setEnabled(false);
        jButton20.setEnabled(false);
        btn9.setEnabled(false);
        btn8.setEnabled(false);
        btn7.setEnabled(false);
        btn6.setEnabled(false);
        btn5.setEnabled(false);
        btn4.setEnabled(false);
        btn3.setEnabled(false);
        btn2.setEnabled(false);
        btn1.setEnabled(false);
        btn0.setEnabled(false);
        btnDiv.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSub.setEnabled(false);
        btnMulti.setEnabled(false);
        btnEqual.setEnabled(false);
        btnDot.setEnabled(false);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        resultField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnOFF = new javax.swing.JRadioButton();
        btnON = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();

        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("CE");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("<--");
        jButton1.setPreferredSize(new java.awt.Dimension(45, 45));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setPreferredSize(new java.awt.Dimension(45, 45));

        jButton15.setPreferredSize(new java.awt.Dimension(45, 45));

        jButton16.setPreferredSize(new java.awt.Dimension(45, 45));

        jButton22.setPreferredSize(new java.awt.Dimension(45, 45));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultField.setEditable(false);
        resultField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resultField.setForeground(new java.awt.Color(153, 204, 0));
        resultField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFieldActionPerformed(evt);
            }
        });
        jPanel1.add(resultField, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 21, 320, 59));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBack.setText("<---");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 50));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setText("CE");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 70, 50));

        btnClear2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear2.setText("C");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 50));

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton20.setText("jButton20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 70, 50));

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 50));

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, 50));

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 70, 50));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 70, 50));

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 70, 50));

        btnSub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 70, 50));

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, 48));

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, 50));

        btnMulti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, 50));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 70, 50));

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 70, 50));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 70, 50));

        btnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        jPanel1.add(btnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 70, 50));

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, 50));

        btnDiv.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 70, 50));

        btnEqual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        jPanel1.add(btnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 70, 50));

        btnOFF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOFF.setText("OFF");
        btnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOFFActionPerformed(evt);
            }
        });
        jPanel1.add(btnOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        btnON.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnON.setText("ON");
        btnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnONActionPerformed(evt);
            }
        });
        jPanel1.add(btnON, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         enterNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        resultField.setText("");
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         enterNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         enterNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         enterNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if(!resultField.getText().contains(".")){
           resultField.setText(resultField.getText()+btnDot.getText());
        }
        
    }//GEN-LAST:event_btnDotActionPerformed

    private void resultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultFieldActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        numberEnter1=Double.parseDouble(resultField.getText());
        resultField.setText("");
        op="/";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       resultField.setText("");
       String fn,sn;
       fn=String.valueOf(numberEnter1);
       sn=String.valueOf(numberEnter2);
       fn="";
       sn="";
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         enterNumber("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        numberEnter2=Double.parseDouble(resultField.getText());
        if(op=="+"){
            result=numberEnter1+numberEnter2;
            resultField.setText(String.valueOf(result));
         }
        else if(op=="-"){
            result=numberEnter1-numberEnter2;
            resultField.setText(String.valueOf(result));
         }
        else if(op=="*"){
            result=numberEnter1*numberEnter2;
            resultField.setText(String.valueOf(result));
         }
        else if(op=="/"){
            result=numberEnter1/numberEnter2;
            resultField.setText(String.valueOf(result));
         }
        
        
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        enterNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         enterNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         enterNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         enterNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
         numberEnter1=Double.parseDouble(resultField.getText());
        resultField.setText("");
        op=("-");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         enterNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        numberEnter1=Double.parseDouble(resultField.getText());
        resultField.setText("");
        op="+";
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        numberEnter1=Double.parseDouble(resultField.getText());
        resultField.setText("");
        op="*";
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String backS=null;
        if(resultField.getText().length()>0){
        StringBuilder sb=new StringBuilder(resultField.getText());
        sb.deleteCharAt(resultField.getText().length()-1);
        backS= sb.toString();
        resultField.setText(backS);
    }
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        double nums=Double.parseDouble(String.valueOf(resultField.getText()));
        nums=nums*(-1);
        resultField.setText(String.valueOf(nums));


    }//GEN-LAST:event_jButton20ActionPerformed

    private void btnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOFFActionPerformed
        this.setEnabled(false);
        disable();
        
    }//GEN-LAST:event_btnOFFActionPerformed

    private void btnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnONActionPerformed
       this.setEnabled(false);
        enable();
    }//GEN-LAST:event_btnONActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JRadioButton btnOFF;
    private javax.swing.JRadioButton btnON;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultField;
    // End of variables declaration//GEN-END:variables
}
