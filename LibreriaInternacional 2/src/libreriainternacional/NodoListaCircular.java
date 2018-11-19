
package libreriainternacional;


public class NodoListaCircular {
    
       
    private NodoListaCircular next;
    private usuarioAdmin dato;

    public NodoListaCircular(usuarioAdmin dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString() { 
        return "" + dato ;
    }

    public NodoListaCircular getNext() {
        return next;
    }

    public void setNext(NodoListaCircular next) {
        this.next = next;
    }

    public usuarioAdmin getDato() {
        return dato;
    }

    public void setDato(usuarioAdmin dato) {
        this.dato = dato;
    }
    
    
    
}
