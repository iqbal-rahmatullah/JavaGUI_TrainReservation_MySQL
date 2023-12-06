/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainreservations;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbalrahmatullah
 */
public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection() {
        if(conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_kai", "root", "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return conn;
    }
}
