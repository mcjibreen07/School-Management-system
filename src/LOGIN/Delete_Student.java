/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIN;

import LOGIN.error.error;
import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dark-Flame
 */
public class Delete_Student extends javax.swing.JFrame {
 static Connection conn  = null;
    static   String dbinfo = "jdbc:sqlite:C://School_db//registred.db";
      
    public Delete_Student() {
        initComponents();
        

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel9.setBackground(new java.awt.Color(14, 14, 50));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setText("DELETE STUDENT FROM SCHOOL DATABASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, java.awt.Color.lightGray, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel2.setText("ENTER STUDENT ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 168, 51));

        id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 440, 51));

        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.setActionCommand("Delete ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 82, 31));

        jButton6.setBackground(new java.awt.Color(216, 214, 214));
        jButton6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton6.setText("Home");
        jButton6.setToolTipText("");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 86, 31));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 257, -1, -1));

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 710, 250));
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 418, 335, 165));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
       //String cl = (String) HomePage.sclass.getSelectedItem();
      
       //String se =(String) HomePage.session.getSelectedItem();
      
     //  String  te = (String)HomePage.sterm.getSelectedItem();
        
       
       
       //try{
       
      //if(cl == "Jss 1" && se == "2020/2021" && te == "1st"){
         // first();
          //forth();
          
    //  }else  if(cl == "Jss 1" && se == "2020/2021" && te == "2nd"){
      ///    second();
         // forth();
          
      //}else  if(cl == "Jss 1" && se == "2020/2021" && te == "3rd"){
        //  third();
          //forth();
          
      //}
       //}catch(Exception e){
       
    //   System.out.println(e);
       
       //} 
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

public void first(){

        
        String sqlquery = "DELETE FROM student_result1 where student_id = ?";
        try {
                  conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            pst.setString(1,id.getText());
           
                 int status = pst.executeUpdate();
                               if(status != 0){  
                                //   JOptionPane.showMessageDialog(null,"DELETED OKAY");
                                   
                                   JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ??");
                    
                                               }else {
                               JOptionPane.showMessageDialog(null, "THis id is not found the this class \n pleae go back to home and set");
                               
                               }
          } catch (SQLException  ex) {
                 JOptionPane.showMessageDialog(null,ex);
          }  

}
public void second(){

        
        String sqlquery = "DELETE FROM  student_result2 where student_id = ?";
        try {
            
               conn  = (Connection) DriverManager.getConnection(dbinfo );
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            pst.setString(1,id.getText());
           
                
                
                 int status = pst.executeUpdate();
                               if(status != 0){  
                                //   JOptionPane.showMessageDialog(null,"DELETED OKAY");
                                   error.del();
                                               }else {
                              error.notfound();
                               }
                               
          } catch (SQLException  ex) {
                 JOptionPane.showMessageDialog(null,ex);
          }  

}
public void third(){

        
        String sqlquery = "DELETE FROM  student_result3 where student_id = ?";
        try {
               
               conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            pst.setString(1,id.getText());
           
                 int status = pst.executeUpdate();
                               if(status != 0){  
                                //   JOptionPane.showMessageDialog(null,"DELETED OKAY");
                                   JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ??");
                                                }else {
                              error.notfound();
                               }
                               
          } catch ( SQLException  ex) {
                 JOptionPane.showMessageDialog(null,ex);
          }  

}

public void forth(){

        
        String sqlquery = "DELETE FROM  student_bio where student_id = ?";
        try {
               
               conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            pst.setString(1,id.getText());
           
                 int status = pst.executeUpdate();
                               if(status != 0){  
                                //   JOptionPane.showMessageDialog(null,"DELETED OKAY");
                                   JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ??");
                                                }else {
                              error.notfound();
                               }
                               
          } catch ( SQLException  ex) {
                 JOptionPane.showMessageDialog(null,ex);
          }  

}



}
