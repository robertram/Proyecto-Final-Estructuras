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
public class NodoCola {
    private Consolas dato;
    private NodoCola atras;  //Por razones de recursividad como la profe explico... 

    @Override
    public String toString() { //No se va a poder mostrar los punteros 
        return ""+dato;
    }

    public NodoCola(Consolas dato) {  //El constructor no puede recibir los punteros
        this.dato = dato;
    }

    public Consolas getDato() {
        return dato;
    }

    public void setDato(Consolas dato) {
        this.dato = dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }
    

    
    
    
}
