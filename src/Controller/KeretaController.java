/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.KeretaDAO;
import java.util.List;
import Model.Kereta;
import View.SelectKereta;
import View.SelectSeat;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author iqbalrahmatullah
 */
public class KeretaController {

    private static List<Kereta> allKereta;
    private static List<Kereta> tujuanKereta;

    public static void getTujuanKereta(String asal, JComboBox fieldTujuan) {
        tujuanKereta = new KeretaDAO().getTujuan(asal);
        if (tujuanKereta != null) {
            for (Kereta value : tujuanKereta) {
                fieldTujuan.addItem(value.getTujuan());
            }
        }
    }

    public static void SearchKereta(JComboBox asalField, JComboBox tujuanField, JDateChooser tanggalField, JComboBox ticketField, String tipe) {
        String asal = (String) asalField.getSelectedItem();
        String tujuan = (String) tujuanField.getSelectedItem();
        String jumlahTicket = (String) ticketField.getSelectedItem();
        jumlahTicket = jumlahTicket.substring(0, 1);

        Date tanggal = tanggalField.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalFormatted = dateFormat.format(tanggal);

        if (asal == null || tujuan == null || tanggal == null) {
            JOptionPane.showMessageDialog(null, "Input an tidak boleh kosong!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SelectKereta pageSelect = new SelectKereta(asal, tujuan, Integer.parseInt(jumlahTicket), tipe, tanggalFormatted);
        pageSelect.setVisible(true);
    }

    public static List<Kereta> getKereta(String asal, String tujuan) {
        if (asal == null || tujuan == null) {
            JOptionPane.showMessageDialog(null, "Wajib input asal dan tujuan", "Error", JOptionPane.ERROR_MESSAGE);
        }

        allKereta = new KeretaDAO().getKereta(asal, tujuan);
        return allKereta;
    }

    public void displayButtonKereta(JPanel panel, List<Kereta> allKereta, int jumlahTicket, String tipe, JFrame keretaFrame, String tanggal) {
        int y = 20;
        for (Kereta kereta : allKereta) {
            JButton pickKereta = new JButton(kereta.getNama());
            pickKereta.setIcon(new ImageIcon(getClass().getResource("/images/train.png")));
            pickKereta.setBounds(10, y, 350, 50);
            pickKereta.addActionListener(new handleButtonKereta(kereta, jumlahTicket, tipe,  keretaFrame, tanggal));

            panel.add(pickKereta);
            y += 70;
        }
    }

     class handleButtonKereta implements ActionListener {

        private Kereta kereta;
        private int jumlahTicket;
        private String tipe;
        private JFrame selectKeretaFrame;
        private String tanggal;

        public handleButtonKereta(Kereta kereta, int jumlahTicket, String tipe, JFrame selectKeretaFrame, String tanggal) {
            this.kereta = kereta;
            this.jumlahTicket = jumlahTicket;
            this.tipe = tipe;
            this.selectKeretaFrame = selectKeretaFrame;
            this.tanggal = tanggal;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            SelectSeat seatFrame = new SelectSeat(kereta, jumlahTicket, tipe, tanggal);
            seatFrame.setVisible(true);
            selectKeretaFrame.dispose();
        }
    }
}
