/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class ListaTickets {
    Queue<Ticket> lista;
    Map<Integer,Ticket> indice;
    

    public ListaTickets() {
        this.lista = new LinkedList<>();
    }

    public void AgregarTicket(int id,String tipo){
        Ticket newTicket= new Ticket(id,tipo);
        lista.add(newTicket);   
        indice.put(id, newTicket);
        
}
    
    public void EliminarTicket(int id){
        Ticket ticket = indice.remove(id);
            if (ticket == null) {
            
        }
    }
    
     
        
    
    public void BuscarTicket(Ticket ticket){
        for(Ticket ticket: lista){
            
        }
            
        }
    }
    

