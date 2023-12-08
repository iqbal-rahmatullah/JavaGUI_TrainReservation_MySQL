/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.Koneksi;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iqbalrahmatullah
 */
public class TransactionDAO implements TransactionImplement {

    /**
     * Method melakukan query insert ke table transaction
     * Method ini melakukan return id transaction tersebut agar bisa digunakan ketika melakukan insert ke table ticket
     *
     * @param tanggal
     * @return
     */
    @Override
    public int insertTransaction(String tanggal) {
        int id = 0;
        try {
            PreparedStatement statement = Koneksi.getConnection().prepareStatement("INSERT INTO transaction (id, date) VALUES (null, ?)", Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, tanggal);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                }
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    /**
     * Melakukan query get all data transaction yang ada dan mengambil relasi juga ke table ticket, untuk mendapatkan jumlah ticket yang dipesan di transaction tersebut.
     *
     * @return Detail transaction dan jumlah ticket yang dipesan di transaction tersebut
     */
    @Override
    public ResultSet getTransaction() {
        ResultSet result = null;
        try {
            Statement statement = Database.Koneksi.getConnection().createStatement();
            result = statement.executeQuery("SELECT t.id, t.date, COUNT(s.transaction_id) AS jumlah_seat FROM transaction t LEFT JOIN ticket s ON t.id = s.transaction_id GROUP BY t.id, t.date");
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
