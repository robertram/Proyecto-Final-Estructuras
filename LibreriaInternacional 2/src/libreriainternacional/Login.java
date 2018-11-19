package libreriainternacional;

import InterfacesGraficas.*;

public class Login {
    
    private String correo, password;
    private int id; //Si id = 1, es cliente, si id=2, es administrador
    

    public Login(String correo, String password, int id) {
        this.correo = correo;
        this.password = password;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Login: " + "correo: " + correo + ", password: " + password ;
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
