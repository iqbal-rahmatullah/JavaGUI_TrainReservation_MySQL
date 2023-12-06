/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Ticket;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
}
