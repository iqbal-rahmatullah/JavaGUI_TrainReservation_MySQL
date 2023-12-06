/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Database.Koneksi;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbalrahmatullah
 */
public class TransactionDAO implements TransactionImplement{

    @Override
    public void insertTransaction(String tanggal) {
        try {
             PreparedStatement statement = Koneksi.getConnection().prepareStatement("INSERT INTO transaction (id, date) VALUES (null, ?)");
             
             statement.setString(1, tanggal);
             statement.executeUpdate();
             statement.close();
             
             JOptionPane.showMessageDialog(null, "Berhasil melakukan transaction", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
