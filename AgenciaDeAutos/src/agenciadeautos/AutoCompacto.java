/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciadeautos;

/**
 *
 * @author yofac
 */
public class AutoCompacto extends Auto {

    private int cantidadPasajeros;
    
    //Constructor 

    public AutoCompacto(String marca, String numeroSerieMotor, double precio, int año, int cantidadPasajeros ) {
        super(marca, numeroSerieMotor, precio, año);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    // SETTER & GETTER

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerieMotor() {
        return numeroSerieMotor;
    }

    public void setNumeroSerieMotor(String numeroSerieMotor) {
        this.numeroSerieMotor = numeroSerieMotor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    // ---- TO STRING ----

    @Override
    public String toString() {
        return "Auto Compacto :" + "Marca = " + marca + " Numero Serie Motor = " + numeroSerieMotor + " Precio = $" + precio + " Año = " + año +  " cantidadPasajeros = " + cantidadPasajeros;
    }
    
    
    // ----- Metodo abst-------
    @Override
    public void setDescuento(double precio) {
        //descuento del 20 porciento para AutoCompacto
        this.precio = precio * 0.80;
    }
    
}
