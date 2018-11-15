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
public class Comida {

    private String cliente, nombre;
    private int precio;

    public Comida(String cliente, String nombre, int precio) {
        this.cliente=cliente;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Comida " + "cliente: " + cliente + ", nombre: " + nombre + ", precio: " + precio + "\n";
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
