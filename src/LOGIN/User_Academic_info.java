
package LOGIN;

 
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JIBREEN
 */
public class User_Academic_info extends javax.swing.JFrame {
   static Connection conn  = null;
    static   String dbinfo = "jdbc:sqlite:C://School_db//registred.db";
       
    
    public User_Academic_info() {
        initComponents();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        cos = new javax.swing.JComboBox();
        ag1 = new javax.swing.JTextField();
        bi1 = new javax.swing.JTextField();
        en1 = new javax.swing.JTextField();
        ma1 = new javax.swing.JTextField();
        py1 = new javax.swing.JTextField();
        ha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        en2 = new javax.swing.JTextField();
        ma2 = new javax.swing.JTextField();
        py2 = new javax.swing.JTextField();
        ha2 = new javax.swing.JTextField();
        bi2 = new javax.swing.JTextField();
        ag2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        error = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        mth = new javax.swing.JLabel();
        phy = new javax.swing.JLabel();
        eng = new javax.swing.JLabel();
        hau = new javax.swing.JLabel();
        bio = new javax.swing.JLabel();
        agr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        category = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabled = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student acaddemic panel");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(14, 14, 50));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel53.setText("Student- Id");
        jPanel15.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, -1, -1));

        id1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        id1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                id1MouseExited(evt);
            }
        });
        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        jPanel15.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 32, 234, -1));

        cos.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unselected", "Primary", "Secondary Sci", "Secondary art" }));
        cos.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        jPanel15.add(cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        ag1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        ag1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jPanel15.add(ag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 315, 45, -1));

        bi1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bi1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        bi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bi1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bi1MouseExited(evt);
            }
        });
        jPanel15.add(bi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 275, 45, -1));

        en1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        en1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jPanel15.add(en1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 130, 45, -1));

        ma1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        ma1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jPanel15.add(ma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 165, 45, -1));

        py1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        py1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        py1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                py1jTextField7ActionPerformed(evt);
            }
        });
        jPanel15.add(py1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 205, 45, -1));

        ha1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        ha1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        ha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ha1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ha1MouseExited(evt);
            }
        });
        jPanel15.add(ha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 240, 45, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("C A");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 101, 35, 16));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setText("Exam");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 97, -1, -1));

        en2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        en2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jPanel15.add(en2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 130, 45, -1));

        ma2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        ma2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jPanel15.add(ma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 165, 45, 28));

        py2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        py2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        py2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                py2jTextField7ActionPerformed(evt);
            }
        });
        jPanel15.add(py2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 205, 45, -1));

        ha2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        ha2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        ha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ha2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ha2MouseExited(evt);
            }
        });
        jPanel15.add(ha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 240, 45, -1));

        bi2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bi2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        bi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bi2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bi2MouseExited(evt);
            }
        });
        jPanel15.add(bi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 275, 45, -1));

        ag2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        ag2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jPanel15.add(ag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 315, 45, -1));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setText("Select Catetory");
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 133, -1));

        error.setEditable(false);
        error.setBackground(new java.awt.Color(238, 238, 238));
        error.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setBorder(null);
        jPanel15.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 350, 560, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 69, 890, 10));

        mth.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        mth.setForeground(new java.awt.Color(51, 51, 51));
        mth.setText("Maths");
        jPanel15.add(mth, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 164, -1, -1));

        phy.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        phy.setForeground(new java.awt.Color(51, 51, 51));
        phy.setText("Physic");
        jPanel15.add(phy, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 202, -1, -1));

        eng.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eng.setForeground(new java.awt.Color(51, 51, 51));
        eng.setText("English");
        jPanel15.add(eng, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 128, -1, -1));

        hau.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        hau.setForeground(new java.awt.Color(51, 51, 51));
        hau.setText("Hausa");
        jPanel15.add(hau, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 242, -1, -1));

        bio.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bio.setForeground(new java.awt.Color(51, 51, 51));
        bio.setText("Biology");
        jPanel15.add(bio, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 277, -1, -1));

        agr.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        agr.setForeground(new java.awt.Color(51, 51, 51));
        agr.setText("Agric");
        jPanel15.add(agr, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 317, -1, -1));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 3, -1, -1));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Update");
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        save1.setBackground(new java.awt.Color(102, 102, 102));
        save1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save1.setText("Save");
        save1.setToolTipText("");
        save1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));
        save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save1MouseExited(evt);
            }
        });
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jToolBar1.add(save1);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Home");
        jButton6.setToolTipText("");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Reset");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Go -  Back");
        jButton7.setToolTipText("");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jPanel15.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 450, 50));
        jPanel15.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 280, 20));

        tabled.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabled);

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 190, 90));

        jScrollPane1.setViewportView(jPanel15);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel5.setText("Student Academic Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(310, 310, 310))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(943, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ha1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ha1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ha1MouseExited

    private void ha1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ha1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ha1MouseEntered

    private void py1jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_py1jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_py1jTextField7ActionPerformed

    private void bi1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bi1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bi1MouseExited

    private void bi1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bi1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bi1MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  try{
 
      String sqlquery= ("UPDATE  `student_result1`  set (`english = 112` )  where student_id = '"+id1+"';");
     
             conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement ps = conn.prepareStatement(sqlquery);

            int status = ps.executeUpdate();
  
         if(status !=0){
         
         System.out.println("updated");
         
         }else{
          System.out.println("Not updated");
         }
  }catch(NumberFormatException | SQLException | HeadlessException e){
  
  System.out.println(e);
  }  
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
              en1.setText(null);
              ma1.setText(null);
              py1.setText(null);
              ha1.setText(null);
              bi1.setText(null);
              ag1  .setText(null);
              /////////////////////////////
               
              ////////////////////////////
              en2.setText(null);
              ma2.setText(null);
              py2.setText(null);
              ha2.setText(null);
              bi2.setText(null);
              ag2.setText(null);
              id1.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
  Double [] c; Double [] e ;
  c = new Double [7];
  e = new Double [7];
  try{
     /*
      String cl = (String) HomePage.sclass.getSelectedItem();
      
       String se =(String) HomePage.session.getSelectedItem();
      
       String  te = (String)HomePage.sterm.getSelectedItem();
      
       
       
       
       
       
      if(cl == "Jss 1" && se == "2020/2021" && te == "1st"){
          first();
          
      }else  if(cl == "Jss 1" && se == "2020/2021" && te == "2nd"){
          second();
          
      }else  if(cl == "Jss 1" && se == "2020/2021" && te == "3rd"){
          third();
          
      }
      */
       
       
         
         c[0] = Double.parseDouble(en1.getText());
         c[1] = Double.parseDouble(ma1.getText());
         c[2]= Double.parseDouble(py1.getText());
         c[3] = Double.parseDouble(ha1.getText());
         c[4] = Double.parseDouble(bi1.getText());
         c[5]= Double.parseDouble(ag1.getText());
         
         e[0] = Double.parseDouble(en2.getText());
         e[1] = Double.parseDouble(ma2.getText());
         e[2] = Double.parseDouble(py2.getText());
         e[3] = Double.parseDouble(ha2.getText());
         e[4] = Double.parseDouble(bi2.getText());
         e[5]= Double.parseDouble(ag2.getText());
         
      
         
    c[6]= c[0] + c[1] + c[2] + c[3] + c[4] + c[5];
    e[6] = e[0] + e[1] + e[2] + e[3] + e[4] + e[5];
          Double total_both = e[6] + c[6];
               Double  average = total_both / 6;  
  }catch(NumberFormatException p){
   error.setText(" CA OR Exam This cannot contain Alphabet Digit Only!!");
  } 
                       
    }//GEN-LAST:event_save1ActionPerformed

    private void save1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseEntered
           
              String  ca01 =  en1.getText();
              String  ca02 = ma1.getText();
              String  ca03  = py1.getText();
              String  ca04 = ha1.getText();
              String  ca05 = bi1.getText();
              String  ca06 = ag1.getText();
              /////////////////////////////
               
              ////////////////////////////
              String  ex01 =  en2.getText();
              String  ex02 =  ma2.getText();
              String  ex03 =  py2.getText();
              String  ex04 = ha2.getText();
              String  ex05 = bi2.getText();
              String  ex06 = ag2.getText();
              String  id01 = id1.getText();
              String j = "";
              
              
  if ( ca01.equals(j)| ca02.equals(j) | ca03.equals(j) | ca04.equals(j) | 
          ca05.equals(j) | ca06.equals(j) | ex01.equals(j) |ex02.equals(j) |
          ex03.equals(j) |ex04.equals(j) |  ex05.equals(j) |  ex06.equals(j)| 
          id01.equals(j)){
      error.setText("C A OR EXAM  or ID COULD "
              + "NOT BE EMPTY ");
         } 
    }//GEN-LAST:event_save1MouseEntered

    private void id1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseExited
        
    }//GEN-LAST:event_id1MouseExited

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
     
    }//GEN-LAST:event_id1MouseEntered

    private void py2jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_py2jTextField7ActionPerformed
        // not null
    }//GEN-LAST:event_py2jTextField7ActionPerformed

    private void ha2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ha2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ha2MouseEntered

    private void ha2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ha2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ha2MouseExited

    private void bi2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bi2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bi2MouseEntered

    private void bi2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bi2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bi2MouseExited

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new HomePage().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       new New_Student().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
         String mycos= (String)cos.getSelectedItem();
        
        if(mycos == "English"){
           eng.setVisible(true);
          en1.setVisible(true);en2.setVisible(true); 
          ma1.setVisible(false);bi1.setVisible(false);  
          ag1.setVisible(false); py1.setVisible(false); 
          ha1.setVisible(false);   py2.setVisible(false);
          ha2.setVisible(false);  bi2.setVisible(false); 
          ag2.setVisible(false);  ma2.setVisible(false);
        
        
       
        
        }else if(mycos == "Mathematics"){
            ma1.setVisible(true); ma2.setVisible(true); 
            bi1.setVisible(false);  ag1.setVisible(false); 
            py1.setVisible(false); ha1.setVisible(false); 
            py2.setVisible(false);   ha2.setVisible(false); 
            bi2.setVisible(false); ag2.setVisible(false);
             mth.setVisible(true);
           
        
        }else if(mycos == "Hausa"){
         
             
             hau.setVisible(true);
            bi1.setVisible(false); ag1.setVisible(false);  
            ha1.setVisible(true);  ha2.setVisible(true);
            bi2.setVisible(false); ag2.setVisible(false);
           
           
        }else if(mycos == "Physics"){
        py1.setVisible(true);   py2.setVisible(true); 
        bi2.setVisible(false); ag2.setVisible(false);
         bi1.setVisible(false);
       
         phy.setVisible(true);
       
        }
        
        else if(mycos == "Biology"){
         bi1.setVisible(true);    ag1.setVisible(false); 
                
         bi2.setVisible(true); ag2.setVisible(false);
          bio.setVisible(true); 
       
        }
        else if(mycos == "Agriculture"){
        ag1.setVisible(true);
        agr.setVisible(true);
          
       
           ag2.setVisible(true);
        }
         if(mycos == "None"){
            en1.setVisible(false);en2.setVisible(false); 
          ma1.setVisible(false);bi1.setVisible(false);  
          
         
          ag1.setVisible(false);  
             
          py1.setVisible(false); 
          ha1.setVisible(false);  
             py2.setVisible(false); ha2.setVisible(false);
          bi2.setVisible(false); ag2.setVisible(false);
          ma2.setVisible(false);
         }
    }//GEN-LAST:event_cosActionPerformed

    private void save1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseExited
        error.setText("");
    }//GEN-LAST:event_save1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
    String k = (String)cos.getSelectedItem();
  switch(k){
      case "Unselected":
          category.setText("Category of the student must be choosen first");
          break;
      case "Primary":
          category.setText("Primary Subjects is activated");
          break;
      case "Secondary Sci":
          category.setText("Secondary Science Subject is activated");
          break;
      case "Secondary art":
          category.setText("Secondary Art Subject is Activated");
          break;
      default:
          category.setText("Category of the student must be choosen first");
         
  }
    }//GEN-LAST:event_jPanel15MouseEntered
///alot of iteration jb
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
            java.util.logging.Logger.getLogger(User_Academic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Academic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Academic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Academic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Academic_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ag1;
    private javax.swing.JTextField ag2;
    private javax.swing.JLabel agr;
    private javax.swing.JTextField bi1;
    private javax.swing.JTextField bi2;
    private javax.swing.JLabel bio;
    private javax.swing.JLabel category;
    private javax.swing.JComboBox cos;
    private javax.swing.JTextField en1;
    private javax.swing.JTextField en2;
    private javax.swing.JLabel eng;
    private javax.swing.JTextField error;
    private javax.swing.JTextField ha1;
    private javax.swing.JTextField ha2;
    private javax.swing.JLabel hau;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField ma1;
    private javax.swing.JTextField ma2;
    private javax.swing.JLabel mth;
    private javax.swing.JLabel phy;
    private javax.swing.JTextField py1;
    private javax.swing.JTextField py2;
    private javax.swing.JButton save1;
    private javax.swing.JTable tabled;
    // End of variables declaration//GEN-END:variables

public void first() throws SQLException{
 
    
     Double [] c; Double [] e ;
  c = new Double [7];
  e = new Double [7];
   String myid = id1.getText();
         c[0] = Double.parseDouble(en1.getText());
         c[1] = Double.parseDouble(ma1.getText());
         c[2]= Double.parseDouble(py1.getText());
         c[3] = Double.parseDouble(ha1.getText());
         c[4] = Double.parseDouble(bi1.getText());
         c[5]= Double.parseDouble(ag1.getText());
         
         e[0] = Double.parseDouble(en2.getText());
         e[1] = Double.parseDouble(ma2.getText());
         e[2] = Double.parseDouble(py2.getText());
         e[3] = Double.parseDouble(ha2.getText());
         e[4] = Double.parseDouble(bi2.getText());
         e[5]= Double.parseDouble(ag2.getText());
         
    c[6]= c[0] + c[1] + c[2] + c[3] + c[4] + c[5];

    e[6] = e[0] + e[1] + e[2] + e[3] + e[4] + e[5];
           Double total_score = c[6] + e[6];
              float average = (float) (total_score / 6);  
 
         
         String sqlquery = ("INSERT INTO  `student_result1` (`student_id`,`english`, `maths`, `physic`, `biology`,`hausa`,`agric`,`english_e`, `maths_e`,`physic_e`,`biology_e`,`hausa_e`,`agric_e`,`avarage`,`total_all`)     "
                 + "VALUES('"+myid+"','"+e[0]+"','"+e[1]+"','"+e[2]+"','"+e[4]+"','"+e[3]+"','"+e[5]+"','"+c[0]+"','"+c[1]+"','"+c[2]+"','"+c[4]+"','"+c[3]+"','"+c[5]+"','"+average+"','"+total_score+"');;");
  
       
        try{

             conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement ps = conn.prepareStatement(sqlquery);

            int status = ps.executeUpdate();
            if(status != 0){
                JOptionPane.showMessageDialog(null,"Info Has been Resgistred Successully !!");
             User_Academic_info user1 = new User_Academic_info();
                user1.setVisible(true);
                  this.dispose();

            }

         }catch(SQLException w){
             JOptionPane.showMessageDialog(null,"Student - id  "+myid.toUpperCase()+ " Already Exitsts !" );
             System.out.println(w);
           
        }
               
  
}

public void second() throws SQLException{
 
    
     Double [] c; Double [] e ;
  c = new Double [7];
  e = new Double [7];
   String myid = id1.getText();
         c[0] = Double.parseDouble(en1.getText());
         c[1] = Double.parseDouble(ma1.getText());
         c[2]= Double.parseDouble(py1.getText());
         c[3] = Double.parseDouble(ha1.getText());
         c[4] = Double.parseDouble(bi1.getText());
         c[5]= Double.parseDouble(ag1.getText());
         
         e[0] = Double.parseDouble(en2.getText());
         e[1] = Double.parseDouble(ma2.getText());
         e[2] = Double.parseDouble(py2.getText());
         e[3] = Double.parseDouble(ha2.getText());
         e[4] = Double.parseDouble(bi2.getText());
         e[5]= Double.parseDouble(ag2.getText());
         
    c[6]= c[0] + c[1] + c[2] + c[3] + c[4] + c[5];

    e[6] = e[0] + e[1] + e[2] + e[3] + e[4] + e[5];
           Double total_score = c[6] + e[6];
              float average = (float) (total_score / 6);  
 
         
         String sqlquery = ("INSERT INTO  `student_result2` (`student_id`,`english`, `maths`, `physic`, `biology`,`hausa`,`agric`,`english_e`, `maths_e`,`physic_e`,`biology_e`,`hausa_e`,`agric_e`,`avarage`,`total_all`)     "
                 + "VALUES('"+myid+"','"+e[0]+"','"+e[1]+"','"+e[2]+"','"+e[4]+"','"+e[3]+"','"+e[5]+"','"+c[0]+"','"+c[1]+"','"+c[2]+"','"+c[4]+"','"+c[3]+"','"+c[5]+"','"+average+"','"+total_score+"');;");
  
       
        try{

                conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement ps = conn.prepareStatement(sqlquery);

            int status = ps.executeUpdate();
            if(status != 0){
                JOptionPane.showMessageDialog(null,"Result  Has been recorded  Successully !! !!");
             User_Academic_info user1 = new User_Academic_info();
                user1.setVisible(true);
                  this.dispose();

            }

         }catch(SQLException w){
             JOptionPane.showMessageDialog(null,"Student - id  "+myid.toUpperCase()+ " Already Exitsts !" );
             System.out.println(w);
           
        }
               
  
}

public void third() throws SQLException{
 
    
     Double [] c; Double [] e ;
  c = new Double [7];
  e = new Double [7];
   String myid = id1.getText();
         c[0] = Double.parseDouble(en1.getText());
         c[1] = Double.parseDouble(ma1.getText());
         c[2]= Double.parseDouble(py1.getText());
         c[3] = Double.parseDouble(ha1.getText());
         c[4] = Double.parseDouble(bi1.getText());
         c[5]= Double.parseDouble(ag1.getText());
         
         e[0] = Double.parseDouble(en2.getText());
         e[1] = Double.parseDouble(ma2.getText());
         e[2] = Double.parseDouble(py2.getText());
         e[3] = Double.parseDouble(ha2.getText());
         e[4] = Double.parseDouble(bi2.getText());
         e[5]= Double.parseDouble(ag2.getText());
         
    c[6]= c[0] + c[1] + c[2] + c[3] + c[4] + c[5];

    e[6] = e[0] + e[1] + e[2] + e[3] + e[4] + e[5];
           Double total_score = c[6] + e[6];
              float average = (float) (total_score / 6);  
 
         
         String sqlquery = ("INSERT INTO  `student_result3` (`student_id`,`english`, `maths`, `physic`, `biology`,`hausa`,`agric`,`english_e`, `maths_e`,`physic_e`,`biology_e`,`hausa_e`,`agric_e`,`avarage`,`total_all`)     "
                 + "VALUES('"+myid+"','"+e[0]+"','"+e[1]+"','"+e[2]+"','"+e[4]+"','"+e[3]+"','"+e[5]+"','"+c[0]+"','"+c[1]+"','"+c[2]+"','"+c[4]+"','"+c[3]+"','"+c[5]+"','"+average+"','"+total_score+"');;");
  
       
        try{

           
            conn  = (Connection) DriverManager.getConnection(dbinfo);
            PreparedStatement ps = conn.prepareStatement(sqlquery);

            int status = ps.executeUpdate();
            if(status != 0){
                JOptionPane.showMessageDialog(null,"Result  Has been recorded  Successully !!");
             User_Academic_info user1 = new User_Academic_info();
                user1.setVisible(true);
                  this.dispose();

            }

        }catch(SQLException w){
            JOptionPane.showMessageDialog(null,"Student - id  "+myid.toUpperCase()+ " Already Exitsts !" );
           
        }
               
  
}
 
}
