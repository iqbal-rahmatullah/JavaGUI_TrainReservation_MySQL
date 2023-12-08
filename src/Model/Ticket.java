/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author iqbalrahmatullah
 */
public class Ticket {
    private int id;
    private int customer_id;
    private int kereta_id;
    private String seat;
    private String tipe;
    private Date date;

    /**
     * Getter id ticket
     *
     * @return id ticket
     */
    public int getId() {
        return id;
    }

    /**
     * Setter id ticket
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get id customer
     *
     * @return id customer
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * Setter id customer
     *
     * @param customer_id
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * Getter id kereta
     *
     * @return id kereta
     */
    public int getKereta_id() {
        return kereta_id;
    }

    /**
     * Setter id kereta
     *
     * @param kereta_id
     */
    public void setKereta_id(int kereta_id) {
        this.kereta_id = kereta_id;
    }

    /**
     * Get no seat
     *
     * @return no seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * Setter no seat
     *
     * @param seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * get tipe seat
     *
     * @return ekonomi/bisnis/eksekutif
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * Setter tipe seat
     *
     * @param tipe
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    /**
     * Getter tanggal transaction
     *
     * @return tanggal transaction
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter date transaction
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
