/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shawon
 */
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ButtonModel;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
//import static javaconnect.connect;
//import static javaconnect.connect;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ButtonModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class playerlistmanager extends javax.swing.JFrame {

    /**
     * Creates new form contact
     */
    
    Connection co = null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    id getid=new id();
    public playerlistmanager() {
        initComponents();
        
         try {
            co = connnect.con();
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton31 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton11 = new com.k33ptoo.components.KButton();
        kButton12 = new com.k33ptoo.components.KButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kButton13 = new com.k33ptoo.components.KButton();
        position = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        club = new javax.swing.JComboBox<>();
        country = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profile Details");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(928, 629));

        jPanel1.setBackground(new java.awt.Color(50, 0, 60));
        jPanel1.setMinimumSize(new java.awt.Dimension(928, 629));
        jPanel1.setPreferredSize(new java.awt.Dimension(928, 629));

        jPanel3.setBackground(new java.awt.Color(34, 0, 41));

        kButton2.setText("Manager List");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton2.setkBorderRadius(15);
        kButton2.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton2.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton2.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Player List");
        kButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton3.setkBorderRadius(15);
        kButton3.setkEndColor(new java.awt.Color(50, 0, 60));
        kButton3.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton3.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(50, 0, 60));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton4.setText("My Team");
        kButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton4.setkBorderRadius(15);
        kButton4.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton4.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton4.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton5.setBackground(new java.awt.Color(104, 42, 178));
        kButton5.setText("Profile");
        kButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton5.setkBorderRadius(15);
        kButton5.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton5.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton5.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        kButton6.setText("Contact Us");
        kButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton6.setkBorderRadius(15);
        kButton6.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton6.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton6.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        kButton31.setText("My Squad");
        kButton31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton31.setkBorderRadius(15);
        kButton31.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton31.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton31.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton31.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton31.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton31.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "E-mail", "Club", "Birth_Year", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 0, 51));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("E-mail");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Club");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Birth_Year");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Username");
        }

        kButton11.setText("Sign Player");
        kButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton11.setkEndColor(new java.awt.Color(204, 0, 51));
        kButton11.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton11.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton11.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton11.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton11.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton11ActionPerformed(evt);
            }
        });

        kButton12.setText("Refresh");
        kButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton12.setkEndColor(new java.awt.Color(204, 0, 51));
        kButton12.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton12.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton12.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton12.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton12.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton12ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfp/Search2.png"))); // NOI18N

        kButton13.setText("Show Details");
        kButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton13.setkEndColor(new java.awt.Color(204, 0, 51));
        kButton13.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton13.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton13.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton13.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton13.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton13ActionPerformed(evt);
            }
        });

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Position", "CF", "AMF", "DMF","CB","GK","RB" }));
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select Birth Year", "1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        club.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Club", "FC Barcelona", "Real Madrid", "Manchaster City", "Arsenal" }));
        club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubActionPerformed(evt);
            }
        });

        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country", "Argentina", "Brazil", "Spain" }));
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(kButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(kButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        managerlistmanager1 obj=new managerlistmanager1();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        managerprofile obj=new managerprofile();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        myteam obj=new myteam();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
        // TODO add your handling code here:
//        String s=signid.getText();
//        String s= signid.getText();
//        int k=Integer.parseInt(s);
DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        
        //Inserting here
        
        
        int row = jTable1.getSelectedRow();
//        System.out.println(row);
        String k  = jTable1.getModel().getValueAt(row,0).toString();
        System.out.println(k);
        String s= k;
        
        String sql="SELECT name FROM signupplayer WHERE id = "+k;
        String sql2="SELECT email FROM signupplayer WHERE id = "+k;
        String sql3="SELECT club FROM signupplayer WHERE id = "+k;
//        String sql4="SELECT year FROM signupplayer WHERE id = "+k;
//        String sql5="SELECT username FROM signupplayer WHERE id = "+k;
        String s1="",s2="",s3="";
        
        try {
            pst=co.prepareStatement(sql);  
            rs=pst.executeQuery();  
             rs.next();
             
            s1=rs.getString("name");
            System.out.println(s1); 
            
            //2
            
            pst=co.prepareStatement(sql2);
//             System.out.println(555);     
            rs=pst.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s2=rs.getString("email");
            System.out.println(s2); 
            
            //3
            
            pst=co.prepareStatement(sql3);
//             System.out.println(555);     
            rs=pst.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s3=rs.getString("club");
            System.out.println(s3); 
            
         
            
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        String query= "INSERT INTO approval(id2,name, email,club) VALUES(?,?,?,?)";
        
        try{
            pst = co.prepareStatement(query);
            pst.setString(1, s);
            pst.setString(2, s1);
            pst.setString(3, s2);
            pst.setString(4, s3);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Pending Approval");
            
        }
        catch(Exception e)
        {
            System.out.println("No");
        }
        
        
        
        
        
        
        
        
//        homepage obj=new homepage();
//        obj.setVisible(true);
//        obj.setResizable(false);
//        dispose();
    }//GEN-LAST:event_kButton11ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        // TODO add your handling code here:
         contactmanager obj=new contactmanager();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton12ActionPerformed
        // TODO add your handling code here:
        try {
            String query = "SELECT * FROM signupplayer";
            pst = co.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm1 = (DefaultTableModel)jTable1.getModel();
            tm1.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("club"),rs.getInt("year"),rs.getString("username")};
                tm1.addRow(obj);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_kButton12ActionPerformed

    private void kButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton31ActionPerformed
        // TODO add your handling code here:
        mysquad obj=new mysquad();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton31ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
         DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
        final TableRowSorter<TableModel> sorter=new TableRowSorter<>(dtm);
        jTable1.setRowSorter(sorter);
        String txt=jTextField1.getText();
        if(txt.length()==0)
        {
            sorter.setRowFilter(null);
            
        }
        else
        {
            sorter.setRowFilter(RowFilter.regexFilter(txt));
        }
            
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void kButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton13ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        
        //Inserting here
        
        
        int row = jTable1.getSelectedRow();
//        System.out.println(row);
        String k  = jTable1.getModel().getValueAt(row,0).toString();
        System.out.println(k);
        String s= k;
        
        getid.x=Integer.parseInt(k);
        
        playerdetails obj=new playerdetails();
        obj.setVisible(true);
        obj.setResizable(false);
//        dispose();
        
    }//GEN-LAST:event_kButton13ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
      

    }//GEN-LAST:event_jTextField1KeyTyped

    private void clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubActionPerformed
        // TODO add your handling code here:
          String s=club.getItemAt(club.getSelectedIndex());
//          System.out.println(s);
//          String sql="SELECT * FROM signupplayer WHERE club=`"+s+";"; 
          String sql= "SELECT * FROM signupplayer WHERE club="+"\""+s+"\""; 
          System.out.println(sql);
           try {
           
            pst = co.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm1 = (DefaultTableModel)jTable1.getModel();
            tm1.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("club"),rs.getInt("year"),rs.getString("username")};
                tm1.addRow(obj);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_clubActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
          String s=year.getItemAt(year.getSelectedIndex());
//          System.out.println(s);
//          String sql="SELECT * FROM signupplayer WHERE club=`"+s+";"; 
          String sql= "SELECT * FROM signupplayer WHERE year="+"\""+s+"\""; 
          System.out.println(sql);
           try {
           
            pst = co.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm1 = (DefaultTableModel)jTable1.getModel();
            tm1.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("club"),rs.getInt("year"),rs.getString("username")};
                tm1.addRow(obj);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_yearActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
          String s=position.getItemAt(position.getSelectedIndex());
//          System.out.println(s);
//          String sql="SELECT * FROM signupplayer WHERE club=`"+s+";"; 
          String sql= "SELECT * FROM signupplayer WHERE position="+"\""+s+"\""; 
          System.out.println(sql);
           try {
           
            pst = co.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm1 = (DefaultTableModel)jTable1.getModel();
            tm1.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("club"),rs.getInt("year"),rs.getString("username")};
                tm1.addRow(obj);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_positionActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:\
          String s=country.getItemAt(country.getSelectedIndex());
//          System.out.println(s);
//          String sql="SELECT * FROM signupplayer WHERE club=`"+s+";"; 
          String sql= "SELECT * FROM signupplayer WHERE country="+"\""+s+"\""; 
          System.out.println(sql);
           try {
           
            pst = co.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm1 = (DefaultTableModel)jTable1.getModel();
            tm1.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("club"),rs.getInt("year"),rs.getString("username")};
                tm1.addRow(obj);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_countryActionPerformed

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
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  jTable1 p=new jTable1();
                
                new playerlistmanager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> club;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton11;
    private com.k33ptoo.components.KButton kButton12;
    private com.k33ptoo.components.KButton kButton13;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton31;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
