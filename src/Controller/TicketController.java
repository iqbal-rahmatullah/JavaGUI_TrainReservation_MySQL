/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.TicketDAO;
import Model.Kereta;
import Model.Seat;
import Model.Ticket;
import View.FormBooking;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author iqbalrahmatullah
 */
public class TicketController {

    private static List<Ticket> allTicket;
    private static List<Seat> seatSelected;

    /**
     * Method untuk mendapatkan kursi yang sudah sold out berdasarkan keretaId dan tanggal
     *
     * @param keretaId
     * @param tanggal
     * @return
     */
    public static List<Ticket> getSeat(int keretaId, String tanggal) {
        allTicket = new TicketDAO().getSeat(keretaId, tanggal);
        return allTicket;
    }

    /**
     * Method untuk menampilkan pilihan semua seat yang ada di kereta berupa button
     *
     * @param seatSold
     * @param parentPanel
     * @param jumlahTicket
     * @param tipe
     * @param btnCheckout
     */
    public static void displayButtonSeat(List<Ticket> seatSold, JPanel parentPanel, int jumlahTicket, String tipe, JButton btnCheckout) {
        JToggleButton[] seats = new JToggleButton[80];
        JPanel leftStall = new JPanel(new GridLayout(0, 2, 2, 2));
        JPanel centerStall = new JPanel(new GridLayout(0, 4, 2, 2));
        JPanel rightStall = new JPanel(new GridLayout(0, 2, 2, 2));

        leftStall.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        centerStall.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rightStall.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        leftStall.setBorder(new TitledBorder("Ekonomi"));
        centerStall.setBorder(new TitledBorder("Bisnis"));
        rightStall.setBorder(new TitledBorder("Eksekutif"));

        parentPanel.add(leftStall, BorderLayout.WEST);
        parentPanel.add(centerStall, BorderLayout.CENTER);
        parentPanel.add(rightStall, BorderLayout.EAST);

        for (int i = 0; i < seats.length; i++) {
            JToggleButton tb = new JToggleButton("S-" + (i + 1));
            seats[i] = tb;
            int colIndex = i % 8;
            if (colIndex < 2) {
                seats[i].putClientProperty("tipe", "Ekonomi");
                leftStall.add(tb);
            } else if (colIndex < 6) {
                seats[i].putClientProperty("tipe", "Bisnis");
                centerStall.add(tb);
            } else {
                seats[i].putClientProperty("tipe", "Eksekutif");
                rightStall.add(tb);
            }

            //Pengecekan apakah sudah sold
            for (Ticket sold : seatSold) {
                if (tb.getText().equalsIgnoreCase(sold.getSeat())) {
                    tb.setEnabled(false);
                }
            }
        }

        handleSelectSeat handleBtn = new handleSelectSeat(seats, jumlahTicket, seatSold, tipe);
    }

    /**
     * Method untuk menghandle button seat yang dipilih oleh user. Didalam method ini juga melakukan pengecekan seat yang sudah sold button nya akan di disable
     */
    public static class handleSelectSeat {

        private JToggleButton[] btnSeat;
        private int jumlahTicket;
        private List<Ticket> seatSold;
        private String tipe;
        private List<String> checkSeat;

        public handleSelectSeat(JToggleButton[] btnSeat, int jumlahTicket, List<Ticket> seatSold, String tipe) {
            this.btnSeat = btnSeat;
            this.jumlahTicket = jumlahTicket;
            this.seatSold = seatSold;
            this.tipe = tipe;
            this.checkSeat = new ArrayList<String>();

            ActionListener seatSelectionListener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    getSelectedSeat();
                }
            };

            for (JToggleButton seat : btnSeat) {
                seat.addActionListener(seatSelectionListener);
            }
        }

        public void getSelectedSeat() {
            TicketController.seatSelected = new ArrayList<Seat>();

            for (JToggleButton seat : btnSeat) {
                if (seat.isSelected()) {
                    seat.setForeground(Color.BLUE);
                    Seat newSeat = new Seat();
                    newSeat.setSeat(seat.getText());
                    newSeat.setTipe((String) seat.getClientProperty("tipe"));
                    seatSelected.add(newSeat);
                    checkSeat.add(seat.getText());
                } else {
                    seat.setForeground(null);
                    seatSelected.removeIf(s -> s.getSeat().equalsIgnoreCase(seat.getText()));
                    checkSeat.removeIf(s -> s.equalsIgnoreCase(seat.getText()));
                }
            }

            //Pengecekan jumlah order
            if (seatSelected.size() >= jumlahTicket) {
                for (JToggleButton seat : btnSeat) {
                    if (!checkSeat.contains(seat.getText())) {
                        seat.setEnabled(false);
                    }
                }
            } else {
                //Mengecek seat yang laku ada/tidak
                if (!seatSold.isEmpty()) {
                    for (JToggleButton seat : btnSeat) {
                        for (Ticket sold : seatSold) {
                            if (!seat.getText().equalsIgnoreCase(sold.getSeat())) {
                                seat.setEnabled(true);
                            }
                        }
                    }
                } else {
                    for (JToggleButton seat : btnSeat) {
                        seat.setEnabled(true);
                    }
                }
            }
        }
    }

    /**
     * Method untuk menghandle ketika user selesai memilih seat, maka data seat, kereta, jumlahticket, dan tanggal yang dipilih akan di kirim ke page formBooking
     *
     * @param kereta
     * @param jumlahTicket
     * @param tanggal
     */
    public static void handleSubmit(Kereta kereta, int jumlahTicket, String tanggal){
        FormBooking formBook = new FormBooking(seatSelected, kereta, jumlahTicket, tanggal);
        formBook.setVisible(true);
    }
    
    
}
