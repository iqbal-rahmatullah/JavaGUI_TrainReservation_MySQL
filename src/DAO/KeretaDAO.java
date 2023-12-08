/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.Koneksi;
import Model.Kereta;
import java.util.List;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iqbalrahmatullah
 */
public class KeretaDAO implements KeretaImplement {

    private List<Kereta> allKereta;

    /**
     * Method untuk melakukan query get(mendapatkan) semua kereta yang ada berdasarkan asal dan tujuan yang di inputkan
     *
     * @param asal
     * @param tujuan
     * @return
     */
    @Override
    public List<Kereta> getKereta(String asal, String tujuan) {
        allKereta = new ArrayList<Kereta>();

        try {
            Statement statement = Koneksi.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM kereta WHERE asal='" + asal + "' AND tujuan='" + tujuan + "'");

            while (result.next()) {
                Kereta kereta = new Kereta();
                kereta.setId(result.getInt("id"));
                kereta.setNama(result.getString("nama"));
                kereta.setAsal(result.getString("asal"));
                kereta.setTujuan(result.getString("tujuan"));
                allKereta.add(kereta);
            }

            statement.close();
            result.close();
            return allKereta;
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Melakukan query get (mendapatkan) tujuan dari semua kereta yang ada di database berdasarkan asal yang di pilih
     *
     * @param asal
     * @return
     */
    @Override
    public List<Kereta> getTujuan(String asal) {
        allKereta = new ArrayList<Kereta>();
        
        try {
            Statement statement = Database.Koneksi.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT DISTINCT tujuan FROM kereta WHERE asal='" + asal + "'");
            
            while(result.next()) {
                Kereta tujuan = new Kereta();
                tujuan.setTujuan(result.getString("tujuan"));
                allKereta.add(tujuan);
            }
            
            statement.close();
            result.close();
            return allKereta;
        } catch (SQLException ex) {
            Logger.getLogger(KeretaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
