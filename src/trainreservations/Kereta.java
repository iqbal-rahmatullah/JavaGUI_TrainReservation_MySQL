package trainreservations;


import java.util.LinkedList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Class Kereta untuk mempresentasikan kereta yang yang tersedia untuk dipesan Customer
 *
 * @author Kelompok 3
 */
public class Kereta {
    private String nama;
    private String asal;
    private String tujuan;
    private List<Seat> seatList;
    private String tipeKereta;

    /**
     * Constructor untuk memberi nilai variabel yang ada di class Kereta
     *
     * @param nama (Nama Kereta)
     * @param asal (Rute asal kereta)
     * @param tujuan (Tujuan akhir kereta)
     * @param tipeKereta (Tipe kereta [Lokal/antarkota])
     */
    public Kereta(String nama, String asal, String tujuan, String tipeKereta) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tipeKereta = tipeKereta;
        seatList = new LinkedList<Seat> ();
        
    }

    /**
     * Method untuk menambahkan seat yang tersedia di kereta
     *
     * @param seat (Object dari class Seat)
     * @return true (Mengindikasikan bahwa penambahan seat di kereta berhasil)
     */
    public boolean addSeat(Seat seat){
        seatList.add(seat);
        return true;
    }
    
    /**
     * Gettter dari variabel nama, untuk menghasilkan nama Kereta
     *
     * @return nama (Menghasilkan nama kereta)
     */
    public String getNama() {
        return nama;
    }

    /**
     * Gettter dari variabel asal, untuk menghasilkan asal rute dari kereta
     *
     * @return asal (Menghasilkan asal kereta)
     */
    public String getAsal() {
        return asal;
    }

    /**
     * Gettter dari variabel tujuan, untuk menghasilkan tujuan akhir kereta
     *
     * @return tujuan (Menghasilkan tujuan akhir dari kereta)
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * Gettter dari variabel tipeKereta, untuk menghasilkan tipe kereta (Lokal/Antarkota)
     *
     * @return tipeKereta (Menghasilkan tipe kereta)
     */
    public String getTipeKereta() {
        return tipeKereta;
    }

    /**
     * Gettter dari variabel seatList, untuk menghasilkan semua seat yang tersedia di kereta
     *
     * @return seatList (Menghasilkan semua seat yang tersedia)
     */
    public List<Seat> getSeatList() {
        return seatList;
    }
    
    /**
     * Method yang digunakan untuk secara otomatis mengisi seat yang ada di kereta menggunakan perulangan. Dimana disini seat dari setiap kereta dibuat sama yaitu 32 seat. Lalu digunakan penkondisian (if else) untuk menghasilkan tipeSeat, noSeat, noGerbong yang berbeda antarseat.
     *
     */
    public void configureSeat() {
        Seat[] allSeat = new Seat[32];
        char code = 'A';
        int gerbong = 1;
        for(int i=0;i<allSeat.length;i++) {
            if(i < 10) {
                allSeat[i] = new Seat( String.valueOf(i + 1) + code, gerbong, "Ekonomi");
            }else if(i < 20) {
                allSeat[i] = new Seat( String.valueOf(i + 1) + code, gerbong, "Bisnis");
            }else {
                allSeat[i] = new Seat( String.valueOf(i + 1) + code, gerbong, "Eksekutif");
            }
            
            //setiap kelipatan 10
            if(i % 10 == 0) {
                gerbong++;
            }
            //Setiap kelipatan 3
            if(i % 3 == 0 && i >= 3) {
                code++;
            }
            this.addSeat(allSeat[i]);
        }
    }
    
    
    
    
}
