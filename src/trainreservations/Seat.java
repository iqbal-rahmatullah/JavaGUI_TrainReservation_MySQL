package trainreservations;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Class Seat untuk mempresentasikan identitas Seat yang akan dimasukkan ke Kereta
 *
 * @author Kelompok 3
 */
public class Seat {
    private String noSeat;
    private int Gerbong;
    private String tipe;

    /**
     * Constructor untuk memberi nilai variabel yang ada di class Seat
     *
     * @param noSeat (Nomer kursi)
     * @param Gerbong (Nomer gerbong)
     * @param tipe (Tipe kursi [ekonomi, bisnis, eksekutif])
     */
    public Seat(String noSeat, int Gerbong, String tipe) {
        this.noSeat = noSeat;
        this.Gerbong = Gerbong;
        this.tipe = tipe;
    }

    /**
     * Gettter dari variabel noSeat, untuk menghasilkan no kursi
     *
     * @return noSeat (Menghasilkan no kursi)
     */
    public String getNoSeat() {
        return noSeat;
    }

    /**
     * Gettter dari variabel Gerbong, untuk menghasilkan nomer gerbong
     *
     * @return Gerbong (Menghasilkan nomer gerbong)
     */
    public int getGerbong() {
        return Gerbong;
    }

    /**
     * Gettter dari variabel tipe, untuk menghasilkan tipe kursi (Ekonomi, bisnis, eksekutif)
     *
     * @return tipe (Menghasilkan tipe kursi)
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * Method untuk mempresentasikan object Customer sebagai string
     *
     * @return semua variabel yang ada di object Seat
     */
    @Override
    public String toString() {
        return "Seat{" + "noSeat=" + noSeat + ", Gerbong=" + Gerbong + ", tipe=" + tipe + '}';
    }
    
    
}
