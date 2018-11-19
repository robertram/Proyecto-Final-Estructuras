
package libreriainternacional;

import javax.swing.JOptionPane;

/**
 *
 * @author Katherine
 */
public class ListaCircular {
    
        private NodoListaCircular cabeza, ultimo;

    public void insertar(usuarioAdmin h) {
        //Empezamos a insertar datos en nuestra estructura
        if (cabeza == null) { //PRIMER PREGUNTA
            cabeza = new NodoListaCircular(h); //se tiene que hacer un nuevo Nodo para toda la informacion
            ultimo = cabeza;
            ultimo.setNext(cabeza);//ultimo señala al primero (cabeza)
        } else { //menores SIEMPRE van a la izquierda:
            if (h.getPosicion() <= cabeza.getDato().getPosicion()) {
                NodoListaCircular aux = new NodoListaCircular(h);
                aux.setNext(cabeza); //ahora señala al primer dato
                //cabeza es el menor SIEMPRE
                cabeza = aux; //por lo tanto señala al auxiliar
                ultimo.setNext(cabeza); //ultimo, señala a cabeza
            } else { //datos MAYORES a cabeza
                if (h.getPosicion() >= ultimo.getDato().getPosicion()) { //si es mayor que ultimo
                    ultimo.setNext(new NodoListaCircular(h));//une los punteros, al mismo tiempo
                    ultimo = ultimo.getNext(); //ultimo ahora va a ser el que esté atras de ultimo
                    ultimo.setNext(cabeza);
                } else {
                    if (h.getPosicion() >= ultimo.getDato().getPosicion()) {
                        ultimo.setNext(new NodoListaCircular(h));
                        ultimo = ultimo.getNext();
                        ultimo.setNext(cabeza);
                    } else { //se debe insertar en el medio los datos de la prioridad y la ficha
                        NodoListaCircular aux = cabeza;
                        while (h.getPosicion() > aux.getNext().getDato().getPosicion()) {
                            aux = aux.getNext().getNext();
                        }
                        if (h.getPosicion() == cabeza.getDato().getPosicion()) {
                            aux.setNext(cabeza); //ahora señala al primer dato
                            //cabeza es el menor SIEMPRE
                            cabeza = aux; //por lo tanto señala al auxiliar
                            ultimo.setNext(null);
                        }
                        NodoListaCircular temp = new NodoListaCircular(h);
                        temp.setNext(aux.getNext());//unir con el siguiente de auxiliar
                        aux.setNext(temp);
                    }
                }
            }
        }
    }

    public void eliminar(String nombre, String apellidos) { //se pedirá al administrador original que digite el nombre y los apellidos del usuario que desea eliminar de la base de correos
        NodoListaCircular aux = cabeza; //auxiliar 1
        boolean salir = false; //variable para terminar ciclo
        if (aux.getDato().getNombre().equalsIgnoreCase(nombre) && aux.getDato().getApellidos().equalsIgnoreCase(apellidos)) { //si se señala a cabeza en la lista, se procede a comparar el nombre y los apellidos de la persona que se desea eliminar
            aux.setDato(null);
        } else {
            aux = aux.getNext();
        }
    }

    public String imprimir() { //inspecciono la lista (internamente) sin eliminar
        NodoListaCircular aux = cabeza; //pongo un auxiliar (aux) cabeza actual
        String s = ""; //Defino s como String Vacío
        if (aux != null) { //mientras aux no sea nulo, se hace el ciclo
            s += aux + ", ";  //concateno aux a s (se llama al ToString de aux)
            aux = aux.getNext(); //actualizando aux como el siguiente
            while (aux != cabeza) { //mientras aux sea difente de cabeza
                s += aux + " ";
                aux = aux.getNext();//actualizando aux como el siguiente
            }
        } else {
            s += " ";
        }
        return s; //retorno s
    }

    public int cantidadElementos() {
        NodoListaCircular aux = cabeza; //aux señala a cabeza
        int contador = 0; //contador de elementos existentes en la lista
        while (aux != null) { //comprobar que haya informacion 
            contador++; // si sí hay, se sumarán los datos
            aux = aux.getNext();  //actualizando aux como el de siguiente
        }
        return contador; //retorno el valor del contador o cantidad de elementos
    }

    public void Buscar(String nombre, String apellidos) {
        NodoListaCircular aux = cabeza; //aux señala a cabeza
        if (aux.getDato().getNombre().equalsIgnoreCase(nombre) && aux.getDato().getApellidos().equalsIgnoreCase(apellidos)) { //Se comparan los datos y si coinciden, prosigue, el ignoreCase es para que no hayan problemas al momento de introducir el nombre
            JOptionPane.showMessageDialog(null, "DATOS DE USUARIO:" //ventana que muestra los datos de esa persona
                    + "\nNombre: " + aux.getDato().getNombre()
                    + "\nApellidos: " + aux.getDato().getApellidos()
                    + "\nCédula: " + aux.getDato().getCedula()
                    + "\nCorreo: " + aux.getDato().getCorreo());
        } else {
            JOptionPane.showMessageDialog(null, "Asegurese de haber digitado los datos correctamente");
        }
        aux = aux.getNext();
    }

}
