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

    public void AgregarTicket(int numero,String tipo){
        Ticket newTicket= new Ticket(numero,tipo);
        lista.add(newTicket);   
        indice.put(numero, newTicket);
        
}
    
    public void EliminarTicket(int id){
         Ticket ticketToRemove = indice.remove(id);
        if (ticketToRemove == null) {
            
        }

        Queue<Ticket> newQueue = new LinkedList<>();
        while (!lista.isEmpty()) {
            Ticket ticket = lista.poll();
            if (ticket.getNumero() != id) {
                newQueue.add(ticket);
            }
        }
        lista = newQueue;  

     
    }
     
    
    
     
        
    
    public Ticket BuscarTicket(String tipo){
        for(Ticket ticket : lista){
            if (ticket == ticket){
                return ticket;
            }
            }
            return null;
        }
            
        }
    
    

