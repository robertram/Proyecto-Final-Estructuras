package libreriainternacional;

public class Cola {

    private NodoCola frente, ultimo;

    public void encola(Libro l) { //guardar DENTRO de un nodo
        if (frente == null) {//comprobar si hay informacion
            frente = new NodoCola(l);//creacion de Nodo
            ultimo = frente;//señalar a frente
        } else { //unir datos
            //se debe crear un nodo
            NodoCola aux = new NodoCola(l); //nuestro nodo que se llama auxiliar
            ultimo.setAtras(aux);//Indicar a último que va a tener atras al Nodo auxiliar
            ultimo = aux; //ahora el ultimo va a hacer auxiliar, de esta forma lo señalo
        }
    }

    public NodoCola atiende() {
        //se saca al primero
        //frente es de tipo Nodo
        NodoCola aux = frente;
        if (aux != null) {
            //sacar primer Nodo:
            frente = frente.getAtras();//Queda al frente 
            //auxiliar esta unido, entonces se necesita limpiar y borrar el puntero;
            aux.setAtras(null);//borrar donde esta el siguiente dato
            if (frente == null) { //si nadie señala, desaparece
                ultimo = null;//para que desaparezca todos los punteros
            }
        }
        return aux;
    }

    public String imprimir() { //inspecciono la cola (internamente) sin eliminar
        String s = ""; //Defino s como String Vacío
        NodoCola aux = frente; //pongo un auxiliar (aux) frente actual
        while (aux != null) { //mientras aux no sea nulo, se hace el ciclo
            s += aux + "\n"; //concateno aux a s (se llama al ToString de aux)
            aux = aux.getAtras(); //actualizando aux como el de atras
        }
        return s; //retorno s
    }
    
        public int cantidadElementos(){
        NodoCola aux = frente; //aux señala a frente
        int contador = 0; //contador de elementos existentes en la cola
        while (aux!= null){ //comprobar que haya informacion 
            contador ++; // si sí hay, se sumarán los datos
            aux = aux.getAtras();  //actualizando aux como el de atras
        }
        return contador; //retorno el valor del contador o cantidad de elementos
    }
      
}