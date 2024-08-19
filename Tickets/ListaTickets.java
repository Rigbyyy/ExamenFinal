/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class ListaTickets {
    Queue<Ticket> lista;
    HashMap<String,Integer> indice;
    
    

    public ListaTickets() {
        this.lista = new LinkedList<>();
    }

    public void AgregarTicket(Ticket ticket){
        lista.add(ticket);   
       
        
}
    
    public void EliminarTicket(int id){
        
    }
    
     
    public Ticket BuscarTicket(String tipo){
        for(Ticket ticket : lista){
            if (ticket == ticket){
                return ticket;
            }
            }
            return null;
        }
    
      
    public void generarTicket(String tipo){
        if(!indice.containsKey(tipo)){
           indice.put(tipo,0);
            
        }
        int numero= indice.get(tipo)+1;
        indice.put(tipo,numero);
        
        Ticket Ticket = new Ticket (numero,tipo);
        lista.add(Ticket);            
        }
    
    public void Atender(){
        lista.poll();
    }
    
    public Ticket ObtenerSiguienteTicket(){
        
        for (Ticket ticket : lista) {
            if (ticket.getTipo().equals(ticket)) {
                return ticket;
            }
        }
        return null;
    }
        
    }

    

