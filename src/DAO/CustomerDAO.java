/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Customer;
import Database.Koneksi;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Kereta;
import Model.Seat;

/**
 *
 * @author iqbalrahmatullah
 */
public class CustomerDAO implements CustomerImplement {

    @Override
    public void insertCustomer(Customer customer, int idTransaction, Kereta kereta, Seat seat, String tanggal) {
        try {
            PreparedStatement statement = Koneksi.getConnection().prepareStatement("INSERT INTO customer (id, nama, no_ktp, no_hp) VALUES (null, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

             statement.setString(1, customer.getNama());
             statement.setString(2, customer.getNo_ktp());
             statement.setString(3, customer.getNo_hp());
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    new TicketDAO().insertTicket(idTransaction, id, kereta, seat, tanggal);
                }
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
