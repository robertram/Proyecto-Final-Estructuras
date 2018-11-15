/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

/**
 *
 * @author robertramirez
 */
public class Cuartos {

    private String cliente;
    private int horasSolicitadas, dinero=0;
    Cola cola = new Cola(); //Consolas
    ListasCirculares circ = new ListasCirculares();
    
    public Cuartos(String cliente, int horasSolicitadas, int dinero) {
        this.cliente = cliente;
        this.horasSolicitadas = horasSolicitadas;
        this.dinero = dinero;
        this.cola = new Cola();
        this.circ= new ListasCirculares();
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Horas Solicitadas: " + horasSolicitadas + ", Dinero: " + dinero;
    }
    
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getHorasSolicitadas() {
        return horasSolicitadas;
    }

    public void setHorasSolicitadas(int horasSolicitadas) {
        this.horasSolicitadas = horasSolicitadas;
    }

}
