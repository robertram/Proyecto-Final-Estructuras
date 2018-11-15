/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

import javax.swing.JOptionPane;

/**
 *
 * @author robertramirez
 */
public class ListasCirculares {

    private int TotalaPagar = 0;

    private NodoListasCirculares cabeza, ultimo;

    @Override
    public String toString() {
        NodoListasCirculares aux = cabeza;
        String s = "";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "";
                aux = aux.getNext();
            }
        } else {
            s += "No compro comida";
        }
        return s;
    }

    public void insertar(Comida h) {
        if (cabeza == null) { //Si la lista esta vacia
            cabeza = new NodoListasCirculares(h);
            ultimo = cabeza; //Cuando un dato es el unico en la lista, es el primero y el ultimo
            ultimo.setNext(cabeza); //Para que sea circular, el ultimo tiene que senalar al primero
        } else {
            if (h.getPrecio() <= cabeza.getDato().getPrecio()) {
                NodoListasCirculares aux = new NodoListasCirculares(h);
                aux.setNext(cabeza);
                cabeza = aux;
                ultimo.setNext(cabeza); //Para que sea circular, el ultimo tiene que senalar al primero

            } else {//mayores a cabeza
                if (h.getPrecio() >= ultimo.getDato().getPrecio()) {
                    ultimo.setNext(new NodoListasCirculares(h));
                    ultimo = ultimo.getNext();
                    ultimo.setNext(cabeza);
                } else {
                    NodoListasCirculares aux = cabeza;
                    while (h.getPrecio() > aux.getNext().getDato().getPrecio()) {
                        aux = aux.getNext();
                    }
                    NodoListasCirculares temp = new NodoListasCirculares(h);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }

    public boolean existe(String nombre) {
        NodoListasCirculares aux = cabeza;
        while (aux != null) {
            if (nombre.equals(aux.getDato().getNombre())) {
                return true;
            } else {
                aux = aux.getNext();
            }
            return false;
        }
        return false;
    }

    public void modifica(String nombre, int precio) {
        NodoListasCirculares aux = cabeza;
        Boolean salir = false;
        while (aux != null && !salir) {
            if (nombre.equals(aux.getDato().getNombre())) { //Cambiar precio
                aux.getDato().setPrecio(precio);
                salir = true;
            } else {
                aux = aux.getNext();
            }
        }
    }

    public void elimina(String nombre) {
        NodoListasCirculares aux = cabeza;
        Boolean salir = false;
        while (aux != null && !salir) {
            if (nombre.equals(aux.getDato().getNombre())) {
                if (aux == cabeza) {
                    cabeza = aux.getNext();
                    ultimo.setNext(cabeza);
                    salir = true;
                    System.out.println(nombre + " eliminado");
                } else if (aux != ultimo) {
                    aux.setNext(aux.getNext().getNext());
                    System.out.println("Elim medio");
                } else {
                    
                }
            } else {
                System.out.println("No existe la herramienta " + nombre);
                salir = true;
            }
        }
    }

    static Lista lista = new Lista();
    static ListasCirculares circ = new ListasCirculares();

    public void escogerComida() { //Agrega comida a la lista circular
        String usuario = JOptionPane.showInputDialog(null, "Cual es el nombre del usuario del cuarto?");
        int consola = Integer.parseInt(JOptionPane.showInputDialog(null, "Que comida desea?\n1-Hamburguesa\n2-Papas\n3-Tacos\n4-Pizza\n5-Burrito\n6-Pollo\n7-Hot Dog\n8-Comida China\n9-Tacos\n10-Nachos\n11-Chalupas\n12-Sandwich"));
        switch (consola) {
            case 1://Hamburguesa
                circ.insertar(new Comida(usuario, "Hamburguesa", 2500)); 
                TotalaPagar += 2500;
                break;
            case 2://Papas
                circ.insertar(new Comida(usuario, "Papas", 1500));
                TotalaPagar += 1500;
                break;
            case 3://Tacos
                circ.insertar(new Comida(usuario, "Tacos", 2000));
                TotalaPagar += 2000;
                break;
            case 4://Pizza
                circ.insertar(new Comida(usuario, "Pizza", 5000));
                TotalaPagar += 5000;
                break;
            case 5://Burrito
                circ.insertar(new Comida(usuario, "Burrito", 1500));
                TotalaPagar += 1500;
                break;
            case 6://Pollo
                circ.insertar(new Comida(usuario, "Pollo", 3000));
                TotalaPagar += 3000;
                break;
            case 7://Hot Dog
                circ.insertar(new Comida(usuario, "Hot Dog", 2000));
                TotalaPagar += 2000;
                break;
            case 8://Comida China
                circ.insertar(new Comida(usuario, "Comida China", 3000));
                TotalaPagar += 3000;
                break;
            case 9://Donas
                circ.insertar(new Comida(usuario, "Donas", 1000));
                TotalaPagar += 1000;
                break;
            case 10://Nachos
                circ.insertar(new Comida(usuario, "Nachos", 2000));
                TotalaPagar += 2000;
                break;
            case 11://Chalupas
                circ.insertar(new Comida(usuario, "Chalupas", 2500));
                TotalaPagar += 2500;
                break;
            case 12://Sandwich
                circ.insertar(new Comida(usuario, "Sandwich", 2000));
                TotalaPagar += 2000;
                break;
            default:
                System.out.println("Escoge una consola");
                break;
        }
        System.out.println(circ+"\n");

    }

}
