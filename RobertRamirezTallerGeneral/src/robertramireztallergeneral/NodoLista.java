/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

/**
 *
 * @author robertramirez
 */
public class NodoLista {
    private Cuartos dato;
    private NodoLista next;

    public NodoLista(Cuartos dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Cuarto: " + dato;
    }

    public Cuartos getDato() {
        return dato;
    }

    public void setDato(Cuartos dato) {
        this.dato = dato;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }
}
