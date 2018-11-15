/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author robertramirez
 */
public class Lista {
    
    public int dineroCuarto;

    private NodoLista cabeza; //Este es el puntero principal

    @Override
    public String toString() { //Inspecciono la cola internamente (sin eliminar)
        String s = ""; //Defino s como un String vacio
        NodoLista aux = cabeza; //pongo en un auxiliar (aux) el frente actual
        while (aux != null) {  //mientras aux no sea nulo se hace el ciclo
            s += aux + "\n";  //Concateno aux a s (Se llama al toString de aux)
            aux = aux.getNext(); //actualizo aux como el de atras
        }
        return s;
    }

    public int largoLista() {
        int counter = 0;
        String s = "";
        NodoLista aux = cabeza;
        while (aux != null) {
            counter++;
            s += aux + "\n";
            aux = aux.getNext();
        }
        return counter;
    }

    public void insertar(Cuartos j) {
        if (cabeza == null) { //Si cabeza esta vacia 
            cabeza = new NodoLista(j); //Se le asigna j como un nodo por que si no fuera como un nodo entonces los tipos de datos no coinciden
        } else {
            if (j.getHorasSolicitadas() <= cabeza.getDato().getHorasSolicitadas()) { //Si el precio del juego es menor al de cabeza...
                NodoLista aux = new NodoLista(j); //Se crea un nodo y se le asigna j
                aux.setNext(cabeza); //Se asigna cabeza como el siguiente del auxiliar 
                cabeza = aux; //Ahora el primero, osea la cabeza va a ser el auxiliar 
            } else {
                if (cabeza.getNext() == null) {
                    cabeza.setNext(new NodoLista(j));
                } else {
                    NodoLista aux = cabeza;
                    while (aux.getNext() != null && j.getHorasSolicitadas() > aux.getNext().getDato().getHorasSolicitadas()) { //Si el precio del juego es mayor a el siguiente de auxiliar
                        aux = aux.getNext(); //Moverse al siguiente 
                    }
                    NodoLista temp = new NodoLista(j);//Se crea un nodo temporal
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }

    public boolean existe(String nombre) {
        NodoLista aux = cabeza;
        while (aux != null) {
            if (nombre.equals(aux.getDato().getCliente())) {
                System.out.println("");
                return true;
            } else {
                aux = aux.getNext();
            }
            System.out.println("No existe la herramienta con el nombre: " + nombre);
            return false;
        }
        return false;
    }

    public boolean checkHorasMinimas(int horas) {
        boolean HorasMin = false;
        if (horas > 3) {
            System.out.println("Cuarto rentado!");
            dineroCuarto=20000;
            System.out.println("Dinero a pagar hasta ahora: "+dineroCuarto);
            return HorasMin = true;
        } else {
            System.out.println("El tiempo minimo en el cuarto son 3 horas");
            return false;
        }
    }
    
    public int sumDinero(String nombre){
        NodoLista aux = cabeza;
        while (aux != null) {
            if (nombre.equals(aux.getDato().getCliente())) {
                int dineroActual=aux.getDato().getDinero();
                aux.getDato().setDinero(dineroActual);
                System.out.println("Dinero a pagar cuarto: "+aux.getDato().getDinero()); //Imprime el dinero a pagar
                return dineroActual;
            } else {
                aux = aux.getNext();
            }
            JOptionPane.showMessageDialog(null, "No existe Cliente con el nombre "+nombre);
        }
        return 0;
    }
    
    

}
