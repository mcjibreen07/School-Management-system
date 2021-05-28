 
package LOGIN;

 
import database.School_db.db_connection;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


 
public class ReportS extends javax.swing.JFrame {
 db_connection co = new db_connection();
     static String driver = "org.mysql.Driver";
       static String path = "jdbc:mysql://127.0.0.1/my_school_database";
       static String user = "root";
      static String pass = "109218912";

    public ReportS() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idnum = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        status = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultsheet = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        birth = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        stud_class = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        SCORE = new javax.swing.JTable();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(14, 14, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter Student id");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, null));

        idnum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idnum.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                idnumComponentAdded(evt);
            }
        });
        idnum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idnumMouseEntered(evt);
            }
        });
        idnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idnumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idnumKeyTyped(evt);
            }
        });

        status.setEditable(false);
        status.setColumns(20);
        status.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(255, 51, 51));
        status.setRows(5);
        status.setBorder(null);
        jScrollPane3.setViewportView(status);

        jLabel16.setText("Status ...................................");

        jToggleButton1.setText("Print-Report");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Home");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idnum, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jToggleButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(291, 291, 291)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idnum)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1009, 500));

        Resultsheet.setBackground(new java.awt.Color(255, 255, 255));
        Resultsheet.setAutoscrolls(true);
        Resultsheet.setMaximumSize(new java.awt.Dimension(1009, 500));
        Resultsheet.setPreferredSize(new java.awt.Dimension(900, 1200));

        jLabel1.setBackground(new java.awt.Color(14, 14, 50));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("DEFAULT SECONDARY SCHOOL GEIDAM");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("DEVELOPMENT OF ANY FRIENDLY SOFTWARE");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Geidam Yobe State,Nigeria");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel6.setText("+2348105887212 , +2349074327531  , E-mail : Jibrillahgeidam@outlook.com");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setText("STUDENT'S REPORT SHEET");

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setText("Name :");

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setText("Student - Id :");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setText("Sex :");

        jLabel12.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel12.setText("Class : ");

        jLabel13.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel13.setText("Address :");

        jLabel14.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel14.setText("Parent Contact: ");

        jLabel15.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel15.setText("Date-of-Birth");

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 0, 0));
        id.setToolTipText("");
        id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 0, 0));
        name.setToolTipText("");
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        sex.setEditable(false);
        sex.setBackground(new java.awt.Color(255, 255, 255));
        sex.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sex.setForeground(new java.awt.Color(255, 0, 0));
        sex.setToolTipText("");
        sex.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        birth.setEditable(false);
        birth.setBackground(new java.awt.Color(255, 255, 255));
        birth.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        birth.setForeground(new java.awt.Color(255, 0, 0));
        birth.setToolTipText("");
        birth.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        phone.setEditable(false);
        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 0, 0));
        phone.setToolTipText("");
        phone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        stud_class.setEditable(false);
        stud_class.setBackground(new java.awt.Color(255, 255, 255));
        stud_class.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        stud_class.setForeground(new java.awt.Color(255, 0, 0));
        stud_class.setToolTipText("");
        stud_class.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        addr.setEditable(false);
        addr.setBackground(new java.awt.Color(255, 255, 255));
        addr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addr.setForeground(new java.awt.Color(255, 0, 0));
        addr.setToolTipText("");
        addr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));

        SCORE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        SCORE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SCORE.setForeground(new java.awt.Color(255, 0, 0));
        SCORE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENGLISH", "MATHEMATICS", "HAUSA", "RELIGION", "PHE", "SOCIAL STUDIES", "COMPUTER STUDIES", "Total_Score"
            }
        ));
        SCORE.setGridColor(new java.awt.Color(255, 255, 255));
        SCORE.setRowHeight(48);
        SCORE.setRowMargin(10);
        SCORE.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(SCORE);
        if (SCORE.getColumnModel().getColumnCount() > 0) {
            SCORE.getColumnModel().getColumn(0).setMinWidth(40);
            SCORE.getColumnModel().getColumn(1).setResizable(false);
            SCORE.getColumnModel().getColumn(2).setResizable(false);
            SCORE.getColumnModel().getColumn(3).setResizable(false);
            SCORE.getColumnModel().getColumn(4).setResizable(false);
            SCORE.getColumnModel().getColumn(5).setResizable(false);
            SCORE.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout ResultsheetLayout = new javax.swing.GroupLayout(Resultsheet);
        Resultsheet.setLayout(ResultsheetLayout);
        ResultsheetLayout.setHorizontalGroup(
            ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsheetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultsheetLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1))
                            .addGroup(ResultsheetLayout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(ResultsheetLayout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultsheetLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ResultsheetLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(894, 894, 894)))
                            .addGroup(ResultsheetLayout.createSequentialGroup()
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(897, 897, 897)))))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1003, 1003, 1003))
            .addGroup(ResultsheetLayout.createSequentialGroup()
                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel5))
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stud_class, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ResultsheetLayout.createSequentialGroup()
                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addGap(815, 815, 815)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResultsheetLayout.setVerticalGroup(
            ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsheetLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(813, 813, 813))
                    .addGroup(ResultsheetLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultsheetLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ResultsheetLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ResultsheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(stud_class, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(437, 437, 437))))
        );

        jScrollPane1.setViewportView(Resultsheet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnumKeyTyped
        result f = new result();
        ResultSet rs = null;
        ResultSet rs1 = null;
        rs = f.find(idnum.getText());
        DefaultTableModel tm = (DefaultTableModel)SCORE.getModel();
        tm.setRowCount(0);
        double total [] =new double[7] ;
        try{
            if(rs.next()){
                id.setText(rs.getString("student_id"));
                total [0] =Double.parseDouble(rs.getString("english"));
                 total [1] =Double.parseDouble(rs.getString("math"));
                  total [2] =Double.parseDouble(rs.getString("hausa"));
                   total [3] =Double.parseDouble(rs.getString("religion"));
                    total [4] =Double.parseDouble(rs.getString("phe"));
                     total [5] =Double.parseDouble(rs.getString("social_studies"));
                     total [6] =Double.parseDouble(rs.getString("computer_studies"));
                     
                  Double  we =  total [0]+total [1]+total [2]+total [3]+total [4]+total [5]+total [6];
                  
                 
                Object[] k = { rs.getString("english"),rs.getString("math")
                    ,rs.getString("hausa"),rs.getString("religion"),rs.getString("phe"),rs.getString("social_studies")
                    ,rs.getString("computer_studies"),we.toString()
                        
                }; tm.addRow(k);
                

               

            }  else{
                //   JOptionPane.showMessageDialog(null, "NO DATA FOUND FOR THIS ID");
                //  System.out.println("NO DATA FOUND FOR THIS ID");
                status.setText("NO DATA FOUND FOR THIS ID \n Result");
            }

            data k = new data();
            rs1 = k.find(idnum.getText());
            String r;
            try{
                if(rs1.next()){
                    String s,l,full;
                    s = rs1.getString("lastname");
                    l = rs1.getString("firstname");
                    full = l + "  " +s;
                    name.setText(full);
                    sex.setText(rs1.getString("sex"));
                    stud_class.setText(rs1.getString("class"));
                    birth.setText(rs1.getString("date_of_birth"));
                    addr.setText(rs1.getString("address"));
                    phone.setText(rs1.getString("parent_phone"));
                    r=rs1.getString("img");
                    ImageIcon img3 = new ImageIcon(r);
                              pic.setIcon(img3);
                            
                }  else{
                    status.setText("NO DATA FOUND FOR THIS ID \n BioData");
                }
            }catch(Exception pkk){
                System.out.println(pkk);
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_idnumKeyTyped

    private void idnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnumKeyReleased

    }//GEN-LAST:event_idnumKeyReleased

    private void idnumComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_idnumComponentAdded

    }//GEN-LAST:event_idnumComponentAdded

    private void idnumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idnumMouseEntered
 
    }//GEN-LAST:event_idnumMouseEntered

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        printRecord(Resultsheet);        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       new HomePage().setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int i = jScrollPane1.getWidth();
       int j = jScrollPane1.getHeight();
       int y = Resultsheet.getHeight();
       int x = Resultsheet.getWidth();
       System.out.print(j+ "  -scroll- " +i+" ----");
            System.out.println(y+ "  -result- " +x);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Resultsheet;
    private javax.swing.JTable SCORE;
    private javax.swing.JTextField addr;
    private javax.swing.JTextField birth;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField sex;
    private javax.swing.JTextArea status;
    private javax.swing.JTextField stud_class;
    // End of variables declaration//GEN-END:variables

   
    private void printRecord(final JPanel panel){
     
     PrinterJob printerJob = PrinterJob.getPrinterJob();
     
     //
     printerJob.setJobName("Print Student terminal report sheet");
     //
     

     printerJob.setPrintable(new Printable(){ 
         @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
              if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
              Graphics2D graphics2D = (Graphics2D)graphics;
               graphics2D.translate(pageFormat.getImageableX()*1, pageFormat.getImageableY()*1);
                graphics2D.scale(0.5, 0.5 );
                 
                panel.paint(graphics2D);
                 
                return Printable.PAGE_EXISTS;
     }
     }
     );
      boolean returningResult = printerJob.printDialog();
        
        if(returningResult){
             try{
                // Now call print method inside printerJob to print
                printerJob.print();
            }catch (PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
            }
        }
     
 }

    private static class result {
 Connection con = null;
  ResultSet rs = null;
    PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
               String query1="select * from student_result_primary   where student_id = ?";
           
            System.setProperty("jdbc.Driver", driver);
            con = DriverManager.getConnection(path, user, pass);
           ps = con.prepareStatement(query1);
             
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
              System.out.println(ex);
           }
           return rs;
       }
        
    } 
     private static class data {
 Connection con = null;
  ResultSet rs1 = null;
    PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
               String query1="select * from student_data   where student_id = ?";
           
            System.setProperty("jdbc.Driver", driver);
            con = DriverManager.getConnection(path, user, pass);
           ps = con.prepareStatement(query1);
             
           ps.setString(1,s);
           rs1 = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
              System.out.println(ex);
           }
           return rs1;
       }
        
    } 
    
}