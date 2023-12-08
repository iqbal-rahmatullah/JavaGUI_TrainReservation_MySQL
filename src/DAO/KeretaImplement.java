/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import Model.Kereta;

/**
 *
 * @author iqbalrahmatullah
 */
public interface KeretaImplement {
    public  List<Kereta> getKereta(String asal, String tujuan, String tipe);
    public List<Kereta> getTujuan(String asal, String tipe);
}
