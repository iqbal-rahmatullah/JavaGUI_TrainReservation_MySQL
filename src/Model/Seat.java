/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author iqbalrahmatullah
 */
public class Seat {
    private String seat;
    private String tipe;

    /**
     * getter no seat
     *
     * @return no seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * setter no seat
     *
     * @param seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * getter tipe seat
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
    
    
}
