 package LOGIN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
    public class Register1 extends javax.swing.JFrame {
    static Connection conn  = null;
    static   String dbinfo = "jdbc:sqlite:C://School_db//registred.db";
      
    public Register1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        error = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(14, 14, 50));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.white));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        username.setBackground(new java.awt.Color(236, 236, 237));
        username.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 0, 0));
        username.setAlignmentX(0.8F);
        username.setBorder(null);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameMouseExited(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 160, 40));

        p1.setBackground(new java.awt.Color(236, 236, 237));
        p1.setColumns(1);
        p1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 51, 51));
        p1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1.setAlignmentX(0.3F);
        p1.setBorder(null);
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p1KeyTyped(evt);
            }
        });
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 160, 40));

        p2.setBackground(new java.awt.Color(236, 236, 237));
        p2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        p2.setForeground(new java.awt.Color(255, 51, 51));
        p2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2.setAlignmentX(0.8F);
        p2.setBorder(null);
        p2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p2KeyTyped(evt);
            }
        });
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 163, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_25px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/School logo.png"))); // NOI18N
        jLabel1.setText("USER  REGISTRATION PANEL ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 50));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Varify Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "who are you ?", "Admin", "Moderator", "User" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 160, 30));

        jPanel2.setBackground(new java.awt.Color(14, 14, 50));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 490, 240));

        error.setBackground(new java.awt.Color(14, 14, 50));
        error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 560, 40));

        jPanel3.setBackground(new java.awt.Color(14, 14, 50));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseEntered
        
    }//GEN-LAST:event_usernameMouseEntered

    private void p1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyTyped
        
    }//GEN-LAST:event_p1KeyTyped

    private void p2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyTyped
      
    }//GEN-LAST:event_p2KeyTyped

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
    
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        username.setText("");
       p1.setText("");
       p2.setText("");
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseExited
 
        
    }//GEN-LAST:event_usernameMouseExited

    private void p2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyReleased
     
// TODO add your handling code here:
    }//GEN-LAST:event_p2KeyReleased

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void kButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseEntered
      if(username.getText().equals(null)){
        error.setText("Sorry you can't leave empty field");
      }
        
    }//GEN-LAST:event_kButton2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String ID,P1,P2;
        ID = username.getText();
        P1 = p1.getText();
        P2 = p2.getText();
        
       if(P1.equals(P2)  &&  P2.length() >=  4 && P1.length() >=  4) {
  
        String sqlquery = ("INSERT INTO  `users` ( `uname`, `pword`) VALUES ('"+ID+"','"+P1+"');;");
      try{
         
     conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement ps = conn.prepareStatement(sqlquery);
            
                  int status = ps.executeUpdate();
                    if(status != 0){
     JOptionPane.showMessageDialog(null,"New User has been Resgistred Successully !!");
     new Login().setVisible(true);
       this.dispose();
}
    
      }catch(SQLException w){
      
      JOptionPane.showMessageDialog(null, "Sorry this username is already taken ");
      
        }
       }else{ 
           JOptionPane.showMessageDialog(null,"Sorry password are not the same ");

        
       }
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField error;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}