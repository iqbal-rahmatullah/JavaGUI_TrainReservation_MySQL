package trainreservations;


import java.time.LocalDate;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Class Tiket untuk menyimpan data ticket/order setelah pesanan selesai
 *
 * @author Kelompok 3
 */
public class Tiket {
    private Customer customer;
    private Kereta kereta;
    private Date date;
    private Seat seat;

    /**
     * Constructor untuk memberi nilai variabel yang ada di class Tiket
     *
     * @param customer (Data customer [object dari Class Customer])
     * @param kereta (Data kereta [object dari Class Kereta])
     * @param date (Tanggal pemesanan tiket)
     * @param seat (Data kursi [object dari Class Seat])
     */
    public Tiket(Customer customer, Kereta kereta, Date date, Seat seat) {
        this.customer = customer;
        this.kereta = kereta;
        this.date = date;
        this.seat = seat;
    }

    /**
     * Gettter dari variabel customer, untuk menghasilkan data Customer yang memesan
     *
     * @return customer (Menghasilkan object Customer, yang menyimpan data-data customer yang memesan)
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gettter dari variabel kereta, untuk menghasilkan data kereta yang dipesan
     *
     * @return kereta (Menghasilkan object kereta, yang menyimpan data-data kereta yang dipesan)
     */
    public Kereta getKereta() {
        return kereta;
    }

    /**
     * Gettter dari variabel date, untuk menghasilkan tanggal pemesanan
     *
     * @return date (Menghasilkan tanggal yang dipesan customer)
     */
    public Date getDate() {
        return date;
    }

    /**
     * Gettter dari variabel seat, untuk menghasilkan data kursi yang dipesan
     *
     * @return seat (Menghasilkan object Seat, yang menyimpan data-data kursi yang dipesan)
     */
    public Seat getSeat() {
        return seat;
    }
    
    
    
}
