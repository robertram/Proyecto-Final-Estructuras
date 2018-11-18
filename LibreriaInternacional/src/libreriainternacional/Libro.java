
package libreriainternacional;



public class Libro {
    
    private String nombreLibro, autor;
    private int publicacion, cantidadDisponible;
    

    public Libro(String nombreLibro, String autor) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.publicacion = publicacion;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    
    
    
    
}
