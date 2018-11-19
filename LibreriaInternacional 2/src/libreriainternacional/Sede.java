
package libreriainternacional;

import java.awt.HeadlessException;
import InterfacesGraficas.*;

public class Sede {
    
    public void seleccionSede(int opcion) {
            try {
                switch (opcion) {
                    case 1:
                        InterfazSanJose sanjose = new InterfazSanJose();
                        sanjose.setVisible(true);
                        break;
                    case 2:
                        InterfazHeredia heredia = new InterfazHeredia();
                        heredia.setVisible(true);
                        break;
                    case 3:
                        InterfazCartago cartago = new InterfazCartago();
                        cartago.setVisible(true);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("El error se produce por: " + e.getMessage());
        }
    }
}
