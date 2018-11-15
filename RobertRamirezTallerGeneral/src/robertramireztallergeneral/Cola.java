/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author robertramirez
 */
public class Cola {

    public int consolasPedidas = 0;
    private NodoCola frente, ultimo;

    public NodoCola pop(NodoCola n) {
        int i = 0;
        NodoCola aux = frente;
        if (aux != null) {
            frente = frente.getAtras();
            aux.setAtras(null); //Aqui desconecta el top osea aux de los demas nodos
        }
        return aux;
    }

    public void encola(Consolas f) {

        if (frente == null) {
            frente = new NodoCola(f);
            ultimo = frente;
        } else {
            NodoCola aux = new NodoCola(f);
            ultimo.setAtras(aux);
            ultimo = aux;
        }
    }

    public NodoCola atiende() {
        NodoCola aux = frente;
        if (aux != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
            if (frente == null) {
                ultimo = null;
            }
        }
        return aux;
    }

    @Override
    public String toString() { //Inspecciono la cola internamente (sin eliminar)
        String s = ""; //Defino s como un String vacio
        NodoCola aux = frente; //pongo en un auxiliar (aux) el frente actual
        while (aux != null) {  //mientras aux no sea nulo se hace el ciclo
            s += aux + "\n";  //Concateno aux a s (Se llama al toString de aux)
            aux = aux.getAtras(); //actualizo aux como el de atras
        }
        return s;
    }
    
    
    static Cola cola = new Cola();
    public void escogerConsola() {
            if (consolasPedidas < 3) {
                String cliente= JOptionPane.showInputDialog(null, "Cual es el nombre del usuario?");
                int consola = Integer.parseInt(JOptionPane.showInputDialog(null, "Que consola desea?\n1-Playstation\n2-Switch\n3-Xbox One"));
                switch (consola) {
                    case 1://Playstation
                        cola.encola(new Consolas(cliente, "Playstation", 2000)); //Agrega la consola a la cola
                        consolasPedidas++;
                        break;
                    case 2://Switch
                        cola.encola(new Consolas(cliente, "Switch", 20000)); //Agrega la consola a la cola
                        consolasPedidas++;
                        break;
                    case 3://Xbox One
                        cola.encola(new Consolas(cliente, "Xbox One", 20000)); //Agrega la consola a la cola
                        consolasPedidas++;
                        break;
                    default:
                        System.out.println("Escoge una consola"); //Si escribe otro numero le pide otra opcion
                        break;
                }
            } else if (consolasPedidas >= 3) { //Si ya hay 3 consolas entonces elimina la primera que pidio
                cola.atiende();
            }
            System.out.println(cola); //Imprime cola


    }

    

}
