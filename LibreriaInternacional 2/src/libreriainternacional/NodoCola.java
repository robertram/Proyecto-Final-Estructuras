
package libreriainternacional;


public class NodoCola {
        
    //CARACTERISTICAS
    
    private Libro dato;
    private NodoCola atras;//permite unir todos los datos

    public NodoCola(Libro dato) { //EL CONSTRUCTOR NUNCA RECIBE EL PUNTERO
        this.dato = dato;
    }

    @Override
    public String toString() { //TAMPOCO SE MUESTRA EL PUNTERO, PORQUE PUEDE SER RECURSIVIDAD Y CONSUMIR TODA LA MEMORIA
        return "" + dato ;
    }

    public Libro getDato() { //SETTERS AND GETTERS SI OCUPAN TODOS LOS DATOS
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }
    
    
}
