/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author iqbalrahmatullah
 */
public class Transaction {
    private int id;
    private String date;

    /**
     * Getter id transaction
     *
     * @return id transaction
     */
    public int getId() {
        return id;
    }

    /**
     * Setter id transaction
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter tanggal transaction
     *
     * @return tanggal transaction
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter tanggal transaction
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
}
