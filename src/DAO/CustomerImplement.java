/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;
import Model.Customer;
import Model.Kereta;
import Model.Seat;

/**
 *
 * @author iqbalrahmatullah
 */
public interface CustomerImplement {
    public void insertCustomer(Customer customer, int idTransaction, Kereta kereta, Seat seat, String tanggal);
}
