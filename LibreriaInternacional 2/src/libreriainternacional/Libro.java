
package libreriainternacional;



public class Libro {   
    private String nombre, autor, sede, cantidad;


    public Libro(String nombre, String autor, String sede, String cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.sede = sede;
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "\nLibro: " + nombre + ", autor: " + autor + ", sede: "+sede+", cantidad entrando: " + cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    
}
