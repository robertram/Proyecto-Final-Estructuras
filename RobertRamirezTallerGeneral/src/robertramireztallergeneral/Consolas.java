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
public class Consolas {
    private String cliente, consola;
    private int precio;
    
    public Consolas(String cliente, String consola, int precio) {
        this.cliente=cliente;
        this.consola = consola;
        this.precio=precio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "cliente: " + cliente + ", consola: " + consola + ", precio: " + precio;
    }
    
    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    
    
}
