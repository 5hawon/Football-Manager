
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shawon
 */
public class mysquad extends javax.swing.JFrame {

    /**
     * Creates new form myprofile
     */
     
      Connection co = null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    id getid=new id();
   
    
    
    public mysquad() {
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

        jPanel3 = new javax.swing.JPanel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton12 = new com.k33ptoo.components.KButton();
        name = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        kButton7 = new com.k33ptoo.components.KButton();
        kButton8 = new com.k33ptoo.components.KButton();
        kButton9 = new com.k33ptoo.components.KButton();
        kButton10 = new com.k33ptoo.components.KButton();
        kButton13 = new com.k33ptoo.components.KButton();
        kButton14 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton11 = new com.k33ptoo.components.KButton();
        signid = new javax.swing.JTextField();
        kButton15 = new com.k33ptoo.components.KButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kButton16 = new com.k33ptoo.components.KButton();

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
        kButton3.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton3.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton3.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(104, 42, 178));

        kButton4.setText("My Team");
        kButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton4.setkBorderRadius(15);
        kButton4.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton4.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton4.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(104, 42, 178));

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

        kButton6.setText("Contact Us");
        kButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton6.setkBorderRadius(15);
        kButton6.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton6.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton6.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(104, 42, 178));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kButton12.setText("Contact Us");
        kButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton12.setkBorderRadius(15);
        kButton12.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton12.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton12.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton12.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton12.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton12.setkStartColor(new java.awt.Color(104, 42, 178));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(928, 629));

        name.setBackground(new java.awt.Color(50, 0, 60));
        name.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(34, 0, 41));

        kButton7.setText("Manager List");
        kButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton7.setkBorderRadius(15);
        kButton7.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton7.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton7.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });

        kButton8.setText("Player List");
        kButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton8.setkBorderRadius(15);
        kButton8.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton8.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton8.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton8.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });

        kButton9.setText("My Team");
        kButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton9.setkBorderRadius(15);
        kButton9.setkEndColor(new java.awt.Color(50, 0, 60));
        kButton9.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton9.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton9.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });

        kButton10.setBackground(new java.awt.Color(104, 42, 178));
        kButton10.setText("Profile");
        kButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton10.setkBorderRadius(15);
        kButton10.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton10.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton10.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton10.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });

        kButton13.setText("Contact Us");
        kButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton13.setkBorderRadius(15);
        kButton13.setkEndColor(new java.awt.Color(104, 42, 178));
        kButton13.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton13.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton13.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton13.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton13.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton13ActionPerformed(evt);
            }
        });

        kButton14.setText("My Squad");
        kButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton14.setkBorderRadius(15);
        kButton14.setkEndColor(new java.awt.Color(50, 0, 60));
        kButton14.setkHoverEndColor(new java.awt.Color(50, 0, 60));
        kButton14.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton14.setkHoverStartColor(new java.awt.Color(50, 0, 60));
        kButton14.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton14.setkStartColor(new java.awt.Color(50, 0, 60));
        kButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        name.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 629));

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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        name.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 690, -1));

        kButton11.setText("Refresh");
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
        name.add(kButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 230, -1));

        signid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signidActionPerformed(evt);
            }
        });
        name.add(signid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        kButton15.setText("Sell Player");
        kButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton15.setkEndColor(new java.awt.Color(204, 0, 51));
        kButton15.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton15.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton15.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton15.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton15.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton15ActionPerformed(evt);
            }
        });
        name.add(kButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 690, 50));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        name.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfp/Search2.png"))); // NOI18N
        name.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 30, 30));

        kButton16.setText("View Details");
        kButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton16.setkEndColor(new java.awt.Color(204, 0, 51));
        kButton16.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        kButton16.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton16.setkHoverStartColor(new java.awt.Color(255, 0, 0));
        kButton16.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton16.setkStartColor(new java.awt.Color(104, 42, 178));
        kButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton16ActionPerformed(evt);
            }
        });
        name.add(kButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton14ActionPerformed

    private void kButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton13ActionPerformed
        // TODO add your handling code here:
        contactmanager obj=new contactmanager();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton13ActionPerformed

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        // TODO add your handling code here:
        myteam obj=new myteam();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton9ActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
       newplayerlist obj=new newplayerlist();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton8ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        // TODO add your handling code here:
        managerlistmanager1 obj=new managerlistmanager1();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        // TODO add your handling code here:
         managerprofile obj=new  managerprofile ();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
    }//GEN-LAST:event_kButton10ActionPerformed

    private void signidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signidActionPerformed

    private void kButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton15ActionPerformed
        // TODO add your handling code here:
//                String s=sellid.getText();
//                int k=Integer.parseInt(s);
//                System.out.println(k);
//                String sql="DELETE (*) FROM squad WHERE id2 = "+k;
//                try {
//            pst=co.prepareStatement(sql);
//////             System.out.println(555);     
//            rs=pst.executeQuery();
//////             System.out.println(555);  
//             rs.next();
////             
////            s1=rs.getString("name");
////        System.out.println(s1);           
//        } catch (SQLException ex) {
////            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.println("Not");
//        }


DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        
        //Inserting here
        
        
        int row = jTable1.getSelectedRow();
//        System.out.println(row);
        String k  = jTable1.getModel().getValueAt(row,0).toString();
        System.out.println(k);
        String s= k;
        
        String sql="SELECT name FROM squad WHERE id2 = "+k;
        String sql2="SELECT email FROM squad WHERE id2 = "+k;
        String sql3="SELECT club FROM squad WHERE id2 = "+k;
//        String sql4="SELECT year FROM squad WHERE id = "+k;
//        String sql5="SELECT username FROM squad WHERE id = "+k;
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
        
        String query= "INSERT INTO sell(id2,name, email,club) VALUES(?,?,?,?)";
        
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
        
        
        
        

          
          //INsert
          
          
          
    }//GEN-LAST:event_kButton15ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

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

    private void kButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton16ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();

        //Inserting here

        int row = jTable1.getSelectedRow();
        //        System.out.println(row);
        String k  = jTable1.getModel().getValueAt(row,0).toString();
        System.out.println(k);
        String s= k;

        getid.x=Integer.parseInt(k);

        playerdetailssquad obj=new playerdetailssquad();
        obj.setVisible(true);
        obj.setResizable(false);
        //        dispose();

    }//GEN-LAST:event_kButton16ActionPerformed

    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
        // TODO add your handling code here:

        try {
            String query = "SELECT * FROM squad ";
            pst = co.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            DefaultTableModel tm1 = (DefaultTableModel)jTable1.getModel();
            tm1.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getInt("id2"), rs.getString("name"), rs.getString("email"), rs.getString("club"),rs.getInt("year"),rs.getString("username")};
                tm1.addRow(obj);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //        homepage obj=new homepage();
        //        obj.setVisible(true);
        //        dispose();
    }//GEN-LAST:event_kButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new login().setVisible(true);
//new managerprofile().setVisible(true);
mysquad obj=new mysquad();
        obj.setVisible(true);
        obj.setResizable(false);
        obj.dispose();
    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton11;
    private com.k33ptoo.components.KButton kButton12;
    private com.k33ptoo.components.KButton kButton13;
    private com.k33ptoo.components.KButton kButton14;
    private com.k33ptoo.components.KButton kButton15;
    private com.k33ptoo.components.KButton kButton16;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    private javax.swing.JPanel name;
    private javax.swing.JTextField signid;
    // End of variables declaration//GEN-END:variables
}
