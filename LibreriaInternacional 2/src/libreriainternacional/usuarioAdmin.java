
package libreriainternacional;

/**
 *
 * @author Katherine
 */
public class usuarioAdmin {
        
    private String nombre, apellidos, cedula, correo, password; //atributos que se utilizarán para crear usuarios de la libreria
    private int posicion;
    
    public usuarioAdmin(int posicion, String nombre, String apellidos, String cedula, String correo) { //constructor en donde se guardarán los datos
        this.posicion=posicion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "\nUsuario agregado: " + "Nombre: " + nombre+ " " +apellidos + ", cédula: " + cedula + ", correo: " + correo;
    }

    //getters and setters para obtener y establecer datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
