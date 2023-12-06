/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import Model.Ticket;

/**
 *
 * @author iqbalrahmatullah
 */
public interface TicketImplement {
    public List<Ticket> getSeat(int kereta_id);
}
