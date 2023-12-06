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
    private String gerbong;
    private String tipe;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getKereta_id() {
        return kereta_id;
    }

    public void setKereta_id(int kereta_id) {
        this.kereta_id = kereta_id;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGerbong() {
        return gerbong;
    }

    public void setGerbong(String gerbong) {
        this.gerbong = gerbong;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
