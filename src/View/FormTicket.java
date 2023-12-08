/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.KeretaController;
import Model.Kereta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author iqbalrahmatullah
 */
public class FormTicket extends javax.swing.JFrame {

    /**
     * Creates new form KeretaLocal
     */
    List<Kereta> tujuan;
    String tipe;

    public FormTicket(String tipe) {
        initComponents();
        this.tipe = tipe;
        
        Train1.setText(Train1.getText() + " " + tipe.toUpperCase());
        tanggalField.setMinSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listSeatFrame = new javax.swing.JFrame();
        jProgressBar1 = new javax.swing.JProgressBar();
        rightPanel = new javax.swing.JPanel();
        Applogo = new javax.swing.JLabel();
        Train = new javax.swing.JLabel();
        Train1 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        asalField = new javax.swing.JComboBox<>();
        asalLabel = new javax.swing.JLabel();
        tujuanField = new javax.swing.JComboBox<>();
        tujuanLabel = new javax.swing.JLabel();
        penumpangField = new javax.swing.JComboBox<>();
        penumpangLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        tanggalField = new com.toedter.calendar.JDateChooser();
        btnCari = new javax.swing.JButton();

        javax.swing.GroupLayout listSeatFrameLayout = new javax.swing.GroupLayout(listSeatFrame.getContentPane());
        listSeatFrame.getContentPane().setLayout(listSeatFrameLayout);
        listSeatFrameLayout.setHorizontalGroup(
            listSeatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        listSeatFrameLayout.setVerticalGroup(
            listSeatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightPanel.setBackground(new java.awt.Color(41, 128, 185));

        Applogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applogo.png"))); // NOI18N

        Train.setFont(new java.awt.Font("PT Sans Narrow", 1, 36)); // NOI18N
        Train.setForeground(new java.awt.Color(255, 255, 255));
        Train.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Train.setText("RESERVATION");

        Train1.setFont(new java.awt.Font("PT Sans Narrow", 1, 36)); // NOI18N
        Train1.setForeground(new java.awt.Color(255, 255, 255));
        Train1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Train1.setText("KERETA");

        buttonHome.setBackground(new java.awt.Color(255, 153, 0));
        buttonHome.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setText("Back To Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Train, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(buttonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addComponent(Applogo)
                                .addGap(44, 44, 44))))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(Train1)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Applogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Train1)
                .addGap(2, 2, 2)
                .addComponent(Train)
                .addGap(18, 18, 18)
                .addComponent(buttonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        asalField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Asal", "Surabaya" }));
        asalField.setToolTipText("");
        asalField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asalFieldItemStateChanged(evt);
            }
        });

        asalLabel.setFont(new java.awt.Font("Kohinoor Telugu", 1, 13)); // NOI18N
        asalLabel.setForeground(new java.awt.Color(102, 102, 102));
        asalLabel.setText("Masukkan Asal :");

        tujuanField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih tujuan anda" }));
        tujuanField.setToolTipText("");

        tujuanLabel.setFont(new java.awt.Font("Kohinoor Telugu", 1, 13)); // NOI18N
        tujuanLabel.setForeground(new java.awt.Color(102, 102, 102));
        tujuanLabel.setText("Masukkan Tujuan :");

        penumpangField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Orang", "2 Orang", "3 Orang", "4 Orang", "5 Orang", "6 Orang", "7 Orang", "8 Orang", "9 Orang" }));
        penumpangField.setToolTipText("");

        penumpangLabel.setFont(new java.awt.Font("Kohinoor Telugu", 1, 13)); // NOI18N
        penumpangLabel.setForeground(new java.awt.Color(102, 102, 102));
        penumpangLabel.setText("Jumlah Penumpang :");

        tanggalLabel.setFont(new java.awt.Font("Kohinoor Telugu", 1, 13)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(102, 102, 102));
        tanggalLabel.setText("Tanggal Keberangkatan :");

        btnCari.setBackground(new java.awt.Color(51, 153, 255));
        btnCari.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.setLabel("Cari Kereta");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(asalField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(asalLabel)
                        .addComponent(tujuanField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tujuanLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(penumpangLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(penumpangField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tanggalLabel)
                        .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(asalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asalField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tujuanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tujuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(tanggalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penumpangLabel)
                    .addComponent(penumpangField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        Home homeFrame = new Home();
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void asalFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asalFieldItemStateChanged
        KeretaController.getTujuanKereta((String) asalField.getSelectedItem(), tujuanField, tipe);
    }//GEN-LAST:event_asalFieldItemStateChanged

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        KeretaController.SearchKereta(asalField, tujuanField, tanggalField, penumpangField, tipe);
        this.dispose();
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(FormTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTicket("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Applogo;
    private javax.swing.JLabel Train;
    private javax.swing.JLabel Train1;
    private javax.swing.JComboBox<String> asalField;
    private javax.swing.JLabel asalLabel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton buttonHome;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JFrame listSeatFrame;
    private javax.swing.JComboBox<String> penumpangField;
    private javax.swing.JLabel penumpangLabel;
    private javax.swing.JPanel rightPanel;
    private com.toedter.calendar.JDateChooser tanggalField;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JComboBox<String> tujuanField;
    private javax.swing.JLabel tujuanLabel;
    // End of variables declaration//GEN-END:variables
}
