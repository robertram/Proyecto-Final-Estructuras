
package libreriainternacional;

public class User {
    
    
    private String correo, password, puesto;
    private int id; //id 1= cliente, id 2= administrador

    public User(String correo, String password, int id) {
        this.correo = correo;
        this.password = password;
        this.id= id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
