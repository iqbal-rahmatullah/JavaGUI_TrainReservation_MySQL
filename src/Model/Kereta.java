/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author iqbalrahmatullah
 */
public class Kereta {
    private int id;
    private String nama;
    private String asal;
    private String tujuan;

    /**
     * getter id kereta
     *
     * @return id kereta
     */
    public int getId() {
        return id;
    }
    
    /**
     * Setter id kereta
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter nama kereta
     *
     * @return nama kereta
     */
    public String getNama() {
        return nama;
    }

    /**
     * Setter nama kereta
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Getter asal kereta
     *
     * @return asal kereta
     */
    public String getAsal() {
        return asal;
    }

    /**
     * Setter asal kereta
     *
     * @param asal
     */
    public void setAsal(String asal) {
        this.asal = asal;
    }

    /**
     * getter tujuan kereta
     *
     * @return tujuan kereta
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * setter tujuan kereta
     *
     * @param tujuan
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}