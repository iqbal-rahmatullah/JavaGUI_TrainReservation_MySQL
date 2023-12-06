/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.Koneksi;
import Model.Seat;
import Model.Ticket;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Kereta;

/**
 *
 * @author iqbalrahmatullah
 */
public class TicketDAO implements TicketImplement{
    private List<Ticket> allTicket;

    @Override
    public List<Ticket> getSeat(int kereta_id, String tanggal) {
        allTicket = new ArrayList<Ticket>();
        try {
            Statement statement = Database.Koneksi.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM ticket WHERE kereta_id='" + kereta_id + "' AND date='" + tanggal + "'");
            
            while(result.next()) {
                Ticket tiket = new Ticket();
                tiket.setSeat(result.getString("seat"));
                allTicket.add(tiket);
            }
            statement.close();
            result.close();
            return allTicket;
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void insertTicket(int idTransaction, int idCustomer,Kereta kereta, Seat seat, String tanggal) {
        try {
            PreparedStatement statement = Koneksi.getConnection().prepareStatement("INSERT INTO ticket (id, customer_id, kereta_id, transaction_id, seat, tipe, date) VALUES (null, ?, ?, ?, ?, ?, ?)");

            statement.setInt(1, idCustomer);
            statement.setInt(2, kereta.getId());
            statement.setInt(3, idTransaction);
            statement.setString(4, seat.getSeat());
            statement.setString(5, seat.getTipe());
            statement.setString(6, tanggal);
            
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
