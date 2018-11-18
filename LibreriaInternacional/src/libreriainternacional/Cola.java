package libreriainternacional;

public class Cola {

    private NodoCola frente, ultimo;
    Object cola[] = new Object[15]; //15 elementos se utilizarán
    int libro = 0;

    //ATRAS, es el que los une
    //EL SET, me permite fijar y cambiar informacion
    public void encola(Libro f) { //la factura se debe guardar DENTRO de un nodo
        if (frente == null) {//comprobar si hay informacion
            frente = new NodoCola(f);//creacion de Nodo para guadar la factura en el nodo
            ultimo = frente;//señalar a frente
        } else { //unir datos, Nodo con una factura
            //se debe crear un nodo
            NodoCola aux = new NodoCola(f); //nuestro nodo que se llama auxiliar
            ultimo.setAtras(aux);//Indicar a último que va a tener atras al Nodo auxiliar (Unión de EPA-WALMART)
            ultimo = aux; //ahora el ultimo va a hacer auxiliar, de esta forma lo señalo
        }
    }

    public NodoCola atiende() {
        //se saca al primero
        //frente es de tipo Nodo
        NodoCola aux = frente;
        if (aux != null) {
            //sacar primer Nodo:
            frente = frente.getAtras();//Queda al frente Walmart
            //auxiliar esta unido, entonces se necesita limpiar y borrar el puntero;
            aux.setAtras(null);//borrar donde esta el siguiente dato
            //SI NADIE SEÑALA AL NODO EPA, ESTE MUERE

            if (frente == null) {
                ultimo = null;//para que desaparezca todos los punteros
            }
        }
        return aux;
    }

    public NodoCola atiendeCola() {
        NodoCola aux = frente;
        if (aux != null) {
            if (libro > 0) {
                cola[0] = null;
                for (int i = 1; i < libro; i++) {
                    cola[i - 1] = cola[i];
                }
                libro--;
            }
        }
    }

    public String toString() { //inspecciono la cola (internamente) sin eliminar
        String s = ""; //Defino s como String Vacío
        NodoCola aux = frente; //pongo un auxiliar (aux) frente actual
        while (aux != null) { //mientras aux no sea nulo, se hace el ciclo
            s += aux + "\n"; //concateno aux a s (se llama al ToString de aux)
            aux = aux.getAtras(); //actualizando aux como el de atras
        }
        return s; //retorno s
    }

    public void Push(String a) {
        if (libro < 15) {
            cola[libro] = a;
            libro++;
        }
    }

    public String VerCola() {
        String s = "";
        if (libro == 0) {
            s = "Elementos: ";
        } else {
            for (int j = 0; j < libro; j++) {
                s += ("Libro: " + (j + 1) + " " + cola[j] + "\n");
            }
        }
        return s;
    }

    public String Elementos() {
        String elementos = "";
        elementos = ("Cantidad de libros: " + libro);
        return elementos;
    }

    public String Primero() {
        String primero = " ";
        if (cola[0] != null) {
            primero = ("Primero: " + cola[0]);
        } else {
            primero = ("No hay elementos");
        }
        return primero;
    }

    public String Ultimo() {
        String ultimo = " ";
        if (cola[0] != null) {
            ultimo = ("Último: " + cola[libro - 1]);
        } else {
            ultimo = ("No hay elementos");
        }
        return ultimo;
    }

    public void VaciarCola() {
        for (int m = libro - 1; m >= 0; m--) {
            cola[m] = null;
            libro = 0;
        }
    }
}
