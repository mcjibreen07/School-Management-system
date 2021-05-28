 
package LOGIN;

 
import LOGIN.error.error;
import database.School_db.db_connection;
import java.awt.Image;
import java.io.File;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JIBREEN
 */
public class Basic_info extends javax.swing.JFrame {

   public  static  String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));
 String defaul = "E:\\JAVA\\SCHOOLRESULT\\src\\Images\\done.jpg";
   
 db_connection xx = new db_connection();
    
    public Basic_info() {
        initComponents();
        Date1.setText("Today is : "+date);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        lname1 = new javax.swing.JTextField();
        clas = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        error1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        gender2 = new javax.swing.JComboBox();
        txt_photo2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        mat = new javax.swing.JTextField();
        eng = new javax.swing.JTextField();
        hau = new javax.swing.JTextField();
        agr = new javax.swing.JTextField();
        chem = new javax.swing.JTextField();
        lit = new javax.swing.JTextField();
        bio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        phy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result_table = new javax.swing.JTable();
        yeah = new javax.swing.JComboBox<>();
        Day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Data_table = new javax.swing.JTable();
        phone2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_photo = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic infomation");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(14, 14, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel53.setText("Student- Id");
        jPanel15.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel54.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel54.setText("First Name");
        jPanel15.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel55.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel55.setText("Class");
        jPanel15.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 50, -1));

        jLabel57.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel57.setText("Last Name");
        jPanel15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel59.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel59.setText("Parent Phone");
        jPanel15.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        fname1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        fname1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname1.setToolTipText("");
        fname1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        fname1.setMargin(new java.awt.Insets(2, 2, 2, 5));
        jPanel15.add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, 33));

        id1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id1.setToolTipText("");
        id1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        id1.setMargin(new java.awt.Insets(2, 2, 2, 5));
        id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                id1MouseExited(evt);
            }
        });
        jPanel15.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 33));

        Address.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Address.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Address.setToolTipText("");
        Address.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        Address.setMargin(new java.awt.Insets(2, 2, 2, 5));
        Address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddressMouseExited(evt);
            }
        });
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        jPanel15.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 170, 33));

        lname1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lname1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname1.setToolTipText("");
        lname1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        lname1.setMargin(new java.awt.Insets(2, 2, 2, 5));
        lname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname1jTextField7ActionPerformed(evt);
            }
        });
        jPanel15.add(lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 33));

        clas.setBackground(new java.awt.Color(230, 230, 230));
        clas.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        clas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "primary level", "1", "2", "3", "4", "5", "6", "junior Secondary", "jss1", "jss2", "jss3", "Senior secondary", "ss1", "ss2", "ss3" }));
        jPanel15.add(clas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 90, 30));

        jButton3.setBackground(new java.awt.Color(230, 230, 230));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("photo");
        jButton3.setToolTipText("");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 180, 120, 30));

        error1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel15.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 710, 30));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 29, -1, -1));

        jLabel60.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel60.setText("Address");
        jPanel15.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 80, -1));

        jLabel62.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel62.setText("Date of Birth");
        jPanel15.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        jLabel61.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel61.setText("Gender");
        jPanel15.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        gender2.setBackground(new java.awt.Color(230, 230, 230));
        gender2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        gender2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F", "Other" }));
        jPanel15.add(gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 90, 30));

        txt_photo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pic.png"))); // NOI18N
        txt_photo2.setText(",");
        jPanel15.add(txt_photo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, 130, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        mat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        eng.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eng.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        hau.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hau.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        agr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        chem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        lit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        bio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ENGLISH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PYSHIC");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("MATHEMATICS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("HAUSA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("AGRIC");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("BIOLOGY");

        jComboBox11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chemistry", "Geography", "History" }));

        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litrature", "Government", "Economic" }));

        phy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mat, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addComponent(eng, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                            .addComponent(agr, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hau, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phy)
                            .addComponent(bio))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hau, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lit))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel15.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 220, 340));

        Result_table.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Result_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Eng", "Math", "Bio", "Agric", "Hausa", "Chem", "Geo", "Govt", "phy", "Lit", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Result_table.setGridColor(new java.awt.Color(255, 255, 255));
        Result_table.setRowHeight(27);
        jScrollPane1.setViewportView(Result_table);
        if (Result_table.getColumnModel().getColumnCount() > 0) {
            Result_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel15.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 380, 340));

        yeah.setFont(new java.awt.Font("OCR-B 10 BT", 1, 14)); // NOI18N
        yeah.setForeground(new java.awt.Color(0, 51, 51));
        yeah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jPanel15.add(yeah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, 32));

        Day.setFont(new java.awt.Font("OCR-B 10 BT", 1, 14)); // NOI18N
        Day.setForeground(new java.awt.Color(0, 51, 51));
        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day.setToolTipText("");
        jPanel15.add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 50, 32));

        month.setFont(new java.awt.Font("OCR-B 10 BT", 1, 14)); // NOI18N
        month.setForeground(new java.awt.Color(0, 51, 51));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel15.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 53, 32));

        Data_table.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student-id", "FirstName", "LastName", "DOB", "Phone", "Address", "Sex", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Data_table.setGridColor(new java.awt.Color(255, 255, 255));
        Data_table.setRowHeight(27);
        jScrollPane2.setViewportView(Data_table);
        if (Data_table.getColumnModel().getColumnCount() > 0) {
            Data_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 420, 340));

        phone2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        phone2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone2.setToolTipText("");
        phone2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        phone2.setMargin(new java.awt.Insets(2, 2, 2, 5));
        phone2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phone2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phone2MouseExited(evt);
            }
        });
        phone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone2ActionPerformed(evt);
            }
        });
        jPanel15.add(phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 33));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-save-64.png"))); // NOI18N
        jButton4.setToolTipText("Save Record");
        jButton4.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (6).png"))); // NOI18N
        jButton1.setToolTipText("Generate New Id");
        jButton1.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images (3).jpg"))); // NOI18N
        jButton8.setToolTipText("Reset Form To default");
        jButton8.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (5).jpg"))); // NOI18N
        jButton6.setToolTipText("Goto HomePage");
        jButton6.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images (5).jpg"))); // NOI18N
        jButton5.setToolTipText("Next Page");
        jButton5.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (4).png"))); // NOI18N
        jButton7.setToolTipText("Update Record");
        jButton7.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 760, 50));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, 1459, 485));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Bio- Data And Result Registration Panel");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 11, 572, -1));

        Date1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Date1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1164, 11, 305, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (2).jpg"))); // NOI18N
        jLabel9.setToolTipText("Exit Application");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1487, 0, -1, -1));

        txt_photo.setEditable(false);
        txt_photo.setBackground(new java.awt.Color(14, 14, 50));
        txt_photo.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txt_photo.setForeground(new java.awt.Color(14, 14, 50));
        txt_photo.setBorder(null);
        txt_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_photoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 120, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1515, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
        error1.setText("Click on generate to get new student_id");
    }//GEN-LAST:event_id1MouseEntered

    private void id1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseExited
        error1.setText("");
    }//GEN-LAST:event_id1MouseExited

    private void AddressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressMouseEntered
        error1.setText("Phone number should be like 08105887212");
    }//GEN-LAST:event_AddressMouseEntered

    private void AddressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressMouseExited
        error1.setText("");
    }//GEN-LAST:event_AddressMouseExited

    private void lname1jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname1jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname1jTextField7ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
             JFileChooser chooser= new JFileChooser();
             chooser.showOpenDialog(null);
             File f = chooser.getSelectedFile();
             String file_name = f.getAbsolutePath();
             txt_photo.setText(file_name);
             Image getAbsolutePath = null;
             ImageIcon img = new ImageIcon(file_name);
             Image  image = img.getImage().getScaledInstance(txt_photo2.getWidth()+33, txt_photo2.getHeight()+20,Image.SCALE_SMOOTH);
            txt_photo2.setIcon(img);
     
             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 //----------------------------------DATA INFO DECRATION ---------------------------------------------//
        String id = id1.getText();
String fn = fname1.getText();
 String ln = lname1.getText();
  String pp= Address.getText();
   String ad= Address.getText();
    Object yh  = yeah.getSelectedItem();
     Object dd =  Day.getSelectedItem();   
      Object  age = yh +"-"+ dd+ "-" +month.getSelectedItem();
       String dt = (String)age;
        String sex =(String) gender2.getSelectedItem();
         String level = (String)clas.getSelectedItem();
          Object image = txt_photo.getText();
           String img = (String)image;
            String img2 = img = img.replace("\\", "\\\\");
            System.out.println(img2);
//----------------------------------RESULT PROCESSING ------------------------------------------------//
//image procress
 ImageIcon pro = new ImageIcon(img2);

int y = pro.getIconHeight();
int x = pro.getIconWidth();


 
//DATABASE INFO INSERTION
 String Query ="INSERT INTO student_data(student_id,firstname,lastname,sex,date_of_birth,parent_phone,address,class,img)VALUES"
         + "('"+id+"','"+fn+"','"+ln+"','"+sex+"','"+dt+"','"+pp+"','"+ad+"','"+level+"','"+img2+"')";
 save_result_secondary(
 id,eng.getText(),mat.getText(),phy.getText(),agr.getText(),hau.getText(),chem.getText(),lit.getText(),lit.getText(),lit.getText(),
         mat.getText()
 );
   try {
            xx.connect(); 
            PreparedStatement pst =xx.conn.prepareStatement(Query);
            int  k =pst.executeUpdate();
            
            if(k!=0){
                if(y <= 120 && x <= 110){
            error1.setText("New Student saved to the database");
            DefaultTableModel model = (DefaultTableModel)Data_table.getModel();
              model.addRow(new Object []{id,fn,ln,sex,dt,pp,ad,level});
              String done =  defaul.replace("\\", "\\\\");
               ImageIcon finish = new ImageIcon(done);
                       int q = finish.getIconWidth();
                       int t = finish.getIconHeight();
              txt_photo2.setIcon(finish);
              
            }else{
           error1.setText("Reduce the photo to 100x100");
                    }
            }else{
            System.out.println("error load photo");
           
            }
            
        } catch (SQLException ex) {
         error1.setText("Student_id already Registred please click on Generate");
         System.out.println(ex);
        }catch (NullPointerException e){
        error1.setText("Empty Entity Requireq!");
        }
     
            
          
            
         
           
  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Thread k = new Thread();
        int i = 0;
        if (i==i){
            for ( int j = 0; j==0; j++){
                try {
                    k.sleep(1);
                     new User_Academic_info().setVisible(true);       
                     this.dispose();

                } catch (InterruptedException ex) {
                   System.out.println(ex);
                }

            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new HomePage().setVisible(true);       
                     this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        
    }//GEN-LAST:event_AddressActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
        String id = id1.getText();
        String fn = fname1.getText();
        String ln = lname1.getText();
         String pp= Address.getText();
          String ad= Address.getText();
         Object yh  = yeah.getSelectedItem();
         Object dd =  Day.getSelectedItem();
         
       Object  age = yh +"-"+ dd+ "-" +month.getSelectedItem();
       String dt = (String)age;
        String sex =(String) gender2.getSelectedItem();
       String level = (String)clas.getSelectedItem();
         Object image = txt_photo.getText();
           String img = (String)image;
            String img2 = img = img.replace("\\", "\\\\");
 String statem = "update student_data set firstname = ?,lastname =? ,sex = ? , date_of_birth=? , parent_phone =? , address =?, class =? img=?"
     + "where student_id=?";
        try{
 
        xx.connect();
        PreparedStatement pst = xx.conn.prepareStatement(statem);
         pst.setString(1, fn);
         pst.setString(2, ln);
           pst.setString(3, sex);
             pst.setString(4, dt);
               pst.setString(5, pp);
                 pst.setString(6, ad);
                 pst.setString(7, level);
                  pst.setString(8, img2);
                     pst.setString(9, id);
           
          int rr = pst.executeUpdate();
         
       if(rr !=0){ 
     error.succeed();

             }else{
           error. notfound();
     }

        
        }catch(Exception e){
            error1.setText("Sonething Wrong Happened !!!");
        System.out.println(e);
        
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       id1.setText("");
       Address.setText("");
       lname1.setText("");
       fname1.setText("");
       txt_photo.setText("");
       Address.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         idgen();
         error1.setText("ID is Generated");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
       
    }//GEN-LAST:event_jButton4MouseEntered

    private void txt_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_photoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_photoActionPerformed

    private void phone2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2MouseEntered

    private void phone2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2MouseExited

    private void phone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Basic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basic_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basic_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTable Data_table;
    public static javax.swing.JLabel Date1;
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JTable Result_table;
    private javax.swing.JTextField agr;
    private javax.swing.JTextField bio;
    private javax.swing.JTextField chem;
    private javax.swing.JComboBox clas;
    private javax.swing.JTextField eng;
    private javax.swing.JLabel error1;
    private javax.swing.JTextField fname1;
    private javax.swing.JComboBox gender2;
    private javax.swing.JTextField hau;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lit;
    private javax.swing.JTextField lname1;
    private javax.swing.JTextField mat;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField phone2;
    private javax.swing.JTextField phy;
    private javax.swing.JTextField txt_photo;
    private javax.swing.JLabel txt_photo2;
    private javax.swing.JComboBox<String> yeah;
    // End of variables declaration//GEN-END:variables

    void idgen(){
 Random rnd = new Random();
        int [] arr = new int[50];
        int sum=0;
          for(int i = 0; i<arr.length; i++){
             arr[i] =rnd.nextInt(300);
          }
          for(int k = 0; k < arr.length; k++){
             
      
                sum = sum +arr[k];
          } 
      
          String g =String.valueOf(sum);
          id1.setText("DEMO/GE/"+g);
          System.out.println(g);
              
           
}
    public void save_result_secondary(String idd,String a,String b,String c,String d,String e,String f,String g,String h,String i,String j){
    
String Secondary_science = ("INSERT INTO student_result_recondary_science(student_id,english,math,biology,physic,agric,computer,chemistry,geography,hausa,religion) VALUES "
        + "('"+idd+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"');");
System.out.println(

idd + " " +a + " " +b + " " + c+ " " +d+ " " +e+ " " +f+ " " +g+ " " +h+ " " +j

);

try{
  xx.connect();
   PreparedStatement pst =xx.conn.prepareStatement(Secondary_science);
            int  k =pst.executeUpdate();
            if(k!=0){
    
Double total = Average();
      System.out.println("Result is okay");
            DefaultTableModel model = (DefaultTableModel)Result_table.getModel();
            
              model.addRow(new Object []{a,b,c,d,e,f,g,h,i,j,total});
  }else{
  error1.setText("Problem occrs");
  }
  }catch(Exception vv){
  System.out.println(vv);
  }
 
    }
      public void save_result_primary(String idd,String a,String b,String c,String d,String e,String f,String g,String h,String i,String j){
      
      String Primary_student =("INSERT INTO student_result_primary (student_id,english,math,hausa,religion,phe,social_studies,computer_studies)VALUES "
        + "('"+idd+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')");
    try{}catch(Exception vv){
  System.out.println(vv);
  }
 
      }
public Double Average(){
         Double ave []= new Double[11];
         ave[0]=Double.parseDouble(eng.getText());
              ave[1]=Double.parseDouble(mat.getText());
                   ave[2]=Double.parseDouble(agr.getText());
                        ave[3]=Double.parseDouble(hau.getText());
                             ave[4]=Double.parseDouble(bio.getText());
                                  ave[5]=Double.parseDouble(chem.getText());
                                       ave[6]=Double.parseDouble(phy.getText());  
                                          ave[7]=Double.parseDouble(lit.getText());
                                         
Double sum = ave[0]+ave[1]+ave[2]+ave[3]+ave[4]+ave[5]+ave[6]+ave[7];   
 
                  Double avr = sum /8.0;
       return sum;
                  
         }                    
          

      
}
