
package carrentalsystem;

import javax.swing.JFrame;

public class AdminInterface extends javax.swing.JFrame {

    /**
     * Creates new form Admininterface
     */
    public AdminInterface() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelMini = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        addbt1 = new javax.swing.JButton();
        ud = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(11, 43, 42));

        jPanel2.setBackground(new java.awt.Color(27, 129, 129));

        jLabelMini.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabelMini.setForeground(new java.awt.Color(11, 43, 42));
        jLabelMini.setText("-");
        jLabelMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMiniMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(11, 43, 42));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMini, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMini, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        logout.setBackground(new java.awt.Color(11, 43, 42));
        logout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(27, 129, 129));
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        addbt1.setBackground(new java.awt.Color(11, 43, 42));
        addbt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addbt1.setForeground(new java.awt.Color(27, 129, 129));
        addbt1.setText("ADD");
        addbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbt1ActionPerformed(evt);
            }
        });

        ud.setBackground(new java.awt.Color(11, 43, 42));
        ud.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ud.setForeground(new java.awt.Color(27, 129, 129));
        ud.setText("UPDATE DETAILS");
        ud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(11, 43, 42));
        del.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        del.setForeground(new java.awt.Color(27, 129, 129));
        del.setText("DELETE DETAILS");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 129, 129));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboSelect.setBackground(new java.awt.Color(11, 43, 42));
        jComboSelect.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboSelect.setForeground(new java.awt.Color(70, 173, 173));
        jComboSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Car Details", "Employee Details", "Customer Details", " " }));
        jComboSelect.setBorder(null);
        jComboSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(del, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ud, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(53, 53, 53)
                .addComponent(jComboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ud, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        LogIn log = new LogIn();
        log.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void addbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbt1ActionPerformed
        // TODO add your handling code here:
        if (jComboSelect.getSelectedItem().equals("Car Details")) {
            Addcar upc = new Addcar();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        } else if (jComboSelect.getSelectedItem().equals("Employee Details")) {
            Add_EmpDetails upc = new Add_EmpDetails();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        } else if (jComboSelect.getSelectedItem().equals("Customer Details")) {
            Add_CusDetails upc = new Add_CusDetails();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        }

    }//GEN-LAST:event_addbt1ActionPerformed

    private void udActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udActionPerformed
        // TODO add your handling code here:
        if (jComboSelect.getSelectedItem().equals("Car Details")) {
            UpdateCar upc = new UpdateCar();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        } else if (jComboSelect.getSelectedItem().equals("Employee Details")) {
            Update_EmpDetails upc = new Update_EmpDetails();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        } else if (jComboSelect.getSelectedItem().equals("Customer Details")) {
            Update_CusDetails upc = new Update_CusDetails();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        }
    }//GEN-LAST:event_udActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        if (jComboSelect.getSelectedItem().equals("Car Details")) {
            DeleteCar upc = new DeleteCar();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        } else if (jComboSelect.getSelectedItem().equals("Employee Details")) {
            Delete_EmpDetails upc = new Delete_EmpDetails();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        } else if (jComboSelect.getSelectedItem().equals("Customer Details")) {
            Delete_CusDetails upc = new Delete_CusDetails();
            upc.setVisible(true);
            upc.pack(); //sets frame size as per need
            upc.setLocationRelativeTo(null); //center on scren
            upc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close 
            this.dispose();
        }
    }//GEN-LAST:event_delActionPerformed

    private void jComboSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSelectActionPerformed

    }//GEN-LAST:event_jComboSelectActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMiniMouseClicked

        this.setState(JFrame.ICONIFIED); //to minimize JFrame
    }//GEN-LAST:event_jLabelMiniMouseClicked

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
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt1;
    private javax.swing.JButton del;
    private javax.swing.JComboBox<String> jComboSelect;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton ud;
    // End of variables declaration//GEN-END:variables
}
