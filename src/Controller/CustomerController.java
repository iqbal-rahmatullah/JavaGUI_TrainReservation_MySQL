/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.CustomerDAO;
import Model.Customer;
import Model.Seat;
import Model.Kereta;

/**
 *
 * @author iqbalrahmatullah
 */
public class CustomerController {
    public static void addCustomer(Customer customer, int idTransaction, Kereta kereta,Seat seatSelected,String tanggal) {
        new CustomerDAO().insertCustomer(customer, idTransaction, kereta, seatSelected, tanggal);
    }
}
