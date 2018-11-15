/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

import javax.swing.JOptionPane;

/**
 *
 * @author robertramirez
 */
public class Menu {

    Lista lista = new Lista();

    public int showMenu() {
        int decision = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Alquilar un cuarto.\n"
                + "2. Pedir Consola\n"
                + "3. Eliminar Consola\n"
                + "4. Pedir Comida\n"
                + "5. Pagar una cuenta.\n"
                + "6.Salir"));
        return decision;
    }

    public void Menu() {
        int cuartos = 5;
        boolean salir = false;
        boolean letra = true;
        
        while (true) {
            try{
            int des = showMenu();
            switch (des) {
                case 1://Alquilar un cuarto
                    try {
                        if (cuartos > 0) {
                            String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre"); //Pide el nombre del usuario
                            int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Por cuantas horas desea el cuarto?"));
                            if (horas >= 3) {
                                if (horas == 3) {
                                    lista.dineroCuarto = 20000; //Asigna el valor de 3 horas de cuarto 
                                } else if (horas > 3) {
                                    int dineroPagar = horas - 3;
                                    lista.dineroCuarto = dineroPagar * 8000 + 20000; //Multiplica la cantidad de horas por el precio
                                }
                                lista.insertar(new Cuartos(nombre, horas, lista.dineroCuarto));//Agrega cuartos
                                cuartos--;  //Resta la cantidad de cuartos
                                JOptionPane.showMessageDialog(null, "Cuarto Agregado"); 
                            } else {
                                JOptionPane.showMessageDialog(null, "Tiempo minimo es de 3 horas");
                                Menu();
                            }
                            System.out.println(lista);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Todos los cuartos estan llenos!");
                            Menu();
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error opcion 1");
                        System.out.println("Error opcion 1");
                    }
                case 2://Solicitar una consola
                    try {
                        int largo = lista.largoLista();
                        if (largo == 0) {
                            JOptionPane.showMessageDialog(null, "No has alquilado el cuarto");
                            Menu();
                        } else {
                            Cola.cola.escogerConsola(); //Escoge consolas
                            //cola.escogerConsola();
                        }
                        break;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error opcion 2");
                        System.out.println("Error opcion 2");
                    }
                case 3://Eliminar consola
                    Cola.cola.atiende(); //Elimina la primera consola que pidio
                    JOptionPane.showMessageDialog(null, Cola.cola); 
                    System.out.println(Cola.cola); //imprime las consolas
                    break;
                case 4://Pedir Comida
                    int largo = lista.largoLista(); //Chequea el largo de la lista
                    if (largo == 0) {
                        JOptionPane.showMessageDialog(null, "No has alquilado el cuarto"); //Si la lista esta vacia entonces lo devuelve
                        Menu(); //Devuelve al menu
                    } else {
                        ListasCirculares.circ.escogerComida(); //Escogen la comida
                    }
                    break;
                case 5://Pagar una cuenta
                    largo = lista.largoLista(); //Chequea el largo de la lista
                    String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre"); //Pide el nombre del usuario
                    if (largo == 0) {
                        JOptionPane.showMessageDialog(null, "No has alquilado el cuarto"); //Si la lista esta vacia entonces lo devuelve
                        Menu();
                    } else {
                        if (lista.existe(nombre)) {
                            System.out.println("Los pagos de " + nombre + " son los siguientes");
                            System.out.println("Lo que pidio de comida es: " + ListasCirculares.circ); //Imprime los pagos
                            //System.out.println(lista.sumDinero(nombre));
                            JOptionPane.showMessageDialog(null, "Los pagos de " + nombre + " son los siguientes: \n"
                                    + "Lo que pidio de comida es: " + ListasCirculares.circ + "\n"
                                    + "El dinero que gasto es: "+lista.sumDinero(nombre)+"\n"
                                    + "Consolas: " + Cola.cola);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe usuario de cuarto con ese nombre"); //Si no hay usuario con ese nombre, lo devuelve
                        }
                    }
                    ListasCirculares.circ.elimina(nombre); //Elimina la comida
                    Cola.cola.atiende(); //Elimina las consolas
                     
                    break;
                case 6://Salir
                    System.out.println("Salir");
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Vuelva Pronto"); //Sale del programa
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escoja otra opcion"); //Si escoger otro numero diferente le pide otra opcion
                    break;
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Introduzca una opcion valida");
            }
        }
    }

}
