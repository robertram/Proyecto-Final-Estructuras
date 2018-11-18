package libreriainternacional;

import InterfacesGraficas.*;
import javax.swing.JOptionPane;

public class Login {

    public static User[] usuarios = new User[10];
    public static String correo;
    public static String password;
    public static int id; // id 1= cliente,  id 2= admin
    
    
    public Login() {
        usuarios[0] = new User("katherine@gmail.com", "katherine", 1);
        usuarios[1] = new User("arturo@gmail.com", "arturo", 1);
        usuarios[2] = new User("robert@gmail.com", "robert", 1);
        usuarios[3] = new User("laura@libreriainternacional.com", "laura", 2);
    }

    public void credenciales() {

        for (int i = 0; i < usuarios.length; i++) { 
            if (usuarios[i] != null && usuarios[i].getCorreo().equals(correo) && usuarios[i].getPassword().equals(password) && usuarios[i].getId() == 1) {
                InterfazSede sede = new InterfazSede();
                sede.setVisible(true);
            } else {
                if (usuarios[i] != null && usuarios[i].getCorreo().equals(correo) && usuarios[i].getPassword().equals(password) && usuarios[i].getId() == 2) {
                    InterfazCola cola = new InterfazCola();
                    cola.setVisible(true);
            }
        }
    }
}
}
