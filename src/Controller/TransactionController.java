/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.TransactionDAO;

/**
 *
 * @author iqbalrahmatullah
 */
public class TransactionController {
    public static void addTransaction(String tanggal) {
        new TransactionDAO().insertTransaction(tanggal);
    }
}
