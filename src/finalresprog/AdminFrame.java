/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresprog;

/**
 *
 * @author arell
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
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

        tabs = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reservation1 = new javax.swing.JButton();
        user1 = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        reservation2 = new javax.swing.JButton();
        user2 = new javax.swing.JButton();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reservation3 = new javax.swing.JButton();
        user3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 675));
        getContentPane().setLayout(null);

        tab1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/srcImage/Admin Home.png"))); // NOI18N
        tab1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 675);

        reservation1.setText("jButton1");
        reservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservation1ActionPerformed(evt);
            }
        });
        tab1.add(reservation1);
        reservation1.setBounds(240, 50, 190, 90);

        user1.setText("jButton1");
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });
        tab1.add(user1);
        user1.setBounds(420, 50, 200, 90);

        tabs.addTab("tab1", tab1);

        tab2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        tab2.add(jScrollPane1);
        jScrollPane1.setBounds(62, 170, 1070, 402);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/srcImage/Admin Reservation.png"))); // NOI18N
        tab2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 675);

        reservation2.setText("jButton1");
        reservation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservation2ActionPerformed(evt);
            }
        });
        tab2.add(reservation2);
        reservation2.setBounds(40, 50, 200, 90);

        user2.setText("jButton1");
        user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user2ActionPerformed(evt);
            }
        });
        tab2.add(user2);
        user2.setBounds(420, 50, 200, 90);

        tabs.addTab("tab2", tab2);

        tab3.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/srcImage/Admin User.png"))); // NOI18N
        tab3.add(jLabel3);
        jLabel3.setBounds(0, 0, 1200, 675);

        reservation3.setText("jButton1");
        reservation3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservation3ActionPerformed(evt);
            }
        });
        tab3.add(reservation3);
        reservation3.setBounds(240, 50, 190, 90);

        user3.setText("jButton1");
        user3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user3ActionPerformed(evt);
            }
        });
        tab3.add(user3);
        user3.setBounds(40, 50, 190, 90);

        tabs.addTab("tab3", tab3);

        getContentPane().add(tabs);
        tabs.setBounds(5, -27, 1200, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservation1ActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedComponent(tab2);
    }//GEN-LAST:event_reservation1ActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedComponent(tab3);
    }//GEN-LAST:event_user1ActionPerformed

    private void reservation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservation2ActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedComponent(tab1);
    }//GEN-LAST:event_reservation2ActionPerformed

    private void user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user2ActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedComponent(tab3);
    }//GEN-LAST:event_user2ActionPerformed

    private void reservation3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservation3ActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedComponent(tab2);
    }//GEN-LAST:event_reservation3ActionPerformed

    private void user3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user3ActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedComponent(tab1);
    }//GEN-LAST:event_user3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reservation1;
    private javax.swing.JButton reservation2;
    private javax.swing.JButton reservation3;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JButton user1;
    private javax.swing.JButton user2;
    private javax.swing.JButton user3;
    // End of variables declaration//GEN-END:variables
}
