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
public class NodoListasCirculares {
    private NodoListasCirculares next;
    private Comida dato;

    public NodoListasCirculares(Comida dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "dato: " + dato;
    }

    public NodoListasCirculares getNext() {
        return next;
    }

    public void setNext(NodoListasCirculares next) {
        this.next = next;
    }

    public Comida getDato() {
        return dato;
    }

    public void setDato(Comida dato) {
        this.dato = dato;
    }
}
