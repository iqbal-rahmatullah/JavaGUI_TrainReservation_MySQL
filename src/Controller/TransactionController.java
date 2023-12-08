/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.TicketDAO;
import DAO.TransactionDAO;
import View.DetailTransaction;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author iqbalrahmatullah
 */
public class TransactionController {

    public static int addTransaction(String tanggal) {
        return new TransactionDAO().insertTransaction(tanggal);
    }

    public static void setHistoryTable(JTable transactionTable, JFrame historyPage) throws SQLException {
        ResultSet dataTransaction = new TransactionDAO().getTransaction();
        DefaultTableModel model = (DefaultTableModel) transactionTable.getModel();

        while (dataTransaction.next()) {
            model.addRow(new Object[]{dataTransaction.getInt("id"), dataTransaction.getInt("jumlah_seat") + " Ticket", dataTransaction.getDate("date")});
        }
        transactionTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JTable target = (JTable) e.getSource();
                int row = target.getSelectedRow();
                try {
                    handleDetailTransaction(String.valueOf(transactionTable.getValueAt(row, 0)), historyPage);
                } catch (SQLException ex) {
                    Logger.getLogger(TransactionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void handleDetailTransaction(String id, JFrame HistoryPage) throws SQLException {
        ResultSet dataTransaction = new TicketDAO().getDetailTransaction(id);
        DetailTransaction detailTransactionPage = new DetailTransaction();

        int rowCount = 0;
        while (dataTransaction.next()) {
            rowCount++;
        }
        dataTransaction.beforeFirst();

        JPanel ticketPanel[] = new JPanel[rowCount];
        for (int i = 0; i < rowCount; i++) {
            dataTransaction.next();
            ticketPanel[i] = new JPanel();

            ticketPanel[i].setPreferredSize(new Dimension(430, 150));
            ticketPanel[i].setLayout(null);
            ticketPanel[i].setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 128, 185), 1, true));

            JLabel label = new JLabel("Nama : " + dataTransaction.getString("nama"));
            label.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label.setBounds(6, 3, 150, 40);
            label.setHorizontalAlignment(SwingConstants.LEFT);  // Set alignment to left

            JLabel label2 = new JLabel("No KTP : " + dataTransaction.getString("no_ktp"));
            label2.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label2.setBounds(6, 18, 150, 40);
            label2.setHorizontalAlignment(SwingConstants.LEFT);
            
            JLabel label3 = new JLabel("No HP : " + dataTransaction.getString("no_hp"));
            label3.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label3.setBounds(6, 33, 150, 40);
            label3.setHorizontalAlignment(SwingConstants.LEFT);
            
            JLabel label4 = new JLabel("Seat : " + dataTransaction.getString("seat"));
            label4.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label4.setBounds(6, 48, 150, 40);
            label4.setHorizontalAlignment(SwingConstants.LEFT);
            
            JLabel label5 = new JLabel("Tipe : " + dataTransaction.getString("tipe"));
            label5.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label5.setBounds(6, 63, 150, 40);
            label5.setHorizontalAlignment(SwingConstants.LEFT);
            
            JLabel label6 = new JLabel("Kereta : " + dataTransaction.getString("kereta.nama"));
            label6.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label6.setBounds(6, 88, 150, 40);
            label6.setHorizontalAlignment(SwingConstants.LEFT);
            
            JLabel label7 = new JLabel("Rute : " + dataTransaction.getString("kereta.asal") + " - " + dataTransaction.getString("kereta.tujuan"));
            label7.setFont(new Font("PT Sans Narrow", Font.BOLD, 13));
            label7.setBounds(6, 103, 150, 40);
            label7.setHorizontalAlignment(SwingConstants.LEFT);
            
            ticketPanel[i].add(label);
            ticketPanel[i].add(label2);
            ticketPanel[i].add(label3);
            ticketPanel[i].add(label4);
            ticketPanel[i].add(label5);
            ticketPanel[i].add(label6);
            ticketPanel[i].add(label7);
            detailTransactionPage.mainPanel.add(ticketPanel[i]);
        }

        detailTransactionPage.setVisible(true);
        HistoryPage.setVisible(false);
    }
}
