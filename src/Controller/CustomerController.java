/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.CustomerDAO;
import Model.Customer;
import Model.Seat;
import Model.Kereta;
import View.FormBooking;
import javax.swing.JTextField;

/**
 *
 * @author iqbalrahmatullah
 */
public class CustomerController {
    public static void addCustomer(Customer customer, int idTransaction, Kereta kereta,Seat seatSelected,String tanggal) {
        new CustomerDAO().insertCustomer(customer, idTransaction, kereta, seatSelected, tanggal);
    }
    
    public static void inputCustomer(JTextField fieldNama, JTextField fieldKtp, JTextField fieldHp) {
        Customer newCustomer = new Customer();
        newCustomer.setNama(fieldNama.getText());
        newCustomer.setNo_hp(fieldHp.getText());
        newCustomer.setNo_ktp(fieldKtp.getText());
        FormBooking.daftarPenumpang.add(newCustomer);
        FormBooking.penumpangField.setText(Integer.toString(FormBooking.daftarPenumpang.size()));
        
        cekCountCustomer();
    }
    
    public static void cekCountCustomer() {
         if(FormBooking.daftarPenumpang != null) {
            if(FormBooking.daftarPenumpang.size() == FormBooking.jumlahTicket) {
                FormBooking.btnTambahPenumpang.setEnabled(false);
            }
        }
    }
}
