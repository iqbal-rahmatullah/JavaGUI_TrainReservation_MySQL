/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Model.Seat;
import java.util.List;
import Model.Ticket;
import Model.Kereta;

/**
 *
 * @author iqbalrahmatullah
 */
public interface TicketImplement {
    public List<Ticket> getSeat(int kereta_id, String tanggal);
    public void insertTicket(int idTransaction, int idCustomer,Kereta kereta, Seat seat, String tanggal);
}
