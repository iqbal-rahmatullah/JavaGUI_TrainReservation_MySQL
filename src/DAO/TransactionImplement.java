/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;
import java.sql.ResultSet;

/**
 *
 * @author iqbalrahmatullah
 */
public interface TransactionImplement {
    public int insertTransaction(String tanggal);
    public ResultSet getTransaction();
}
