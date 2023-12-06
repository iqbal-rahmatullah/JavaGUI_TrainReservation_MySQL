package trainreservations;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Class Customer untuk mempresentasikan data pribadi dari customer
 *
 * @author Kelompok 3
 */
public class Customer {

    private String name;
    private String noHP;
    private String noKTP;

    /**
     * Constructor untuk memberi nilai variabel yang ada di class Customer
     *
     * @param name (Nama dari customer)
     * @param noHP (No hp dari customer)
     * @param noKTP (Identitas No KTP Customer)
     */
    public Customer(String name, String noHP, String noKTP) {
        this.name = name;
        this.noHP = noHP;
        this.noKTP = noKTP;
    }

    /**
     * Gettter dari variabel name, untuk menghasilkan nama customer
     *
     * @return name (nama dari customer)
     */
    public String getName() {
        return name;
    }

    /**
     * Gettter dari variabel noHp, untuk menghasilkan No HP customer
     *
     * @return noHP (No hp dari customer
     */
    public String getNoHP() {
        return noHP;
    }

    /**
     * Gettter dari variabel noKtp, untuk menghasilkan No KTP customer
     *
     * @return noKTP (No KTP Customer)
     */
    public String getNoKTP() {
        return noKTP;
    }

    /**
     * Method untuk mempresentasikan object Customer sebagai string
     *
     * @return menampilkan semua variabel yang ada di class Customer
     */
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", noHP=" + noHP + ", noKTP=" + noKTP + '}';
    }

}
