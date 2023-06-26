/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciadeautos;

/**
 *
 * @author yofac
 */
public class Camioneta extends Auto{

    private float capacidadCargaKgs;
    private int cantidadEjes;
    private int cantidadRodadas;
    
    
    // Constructor

    public Camioneta(String marca, String numeroSerieMotor, double precio, int año, float capacidadCargaKgs, int cantidadEjes, int cantidadRodadas) {
        super(marca, numeroSerieMotor, precio, año);
        this.capacidadCargaKgs = capacidadCargaKgs;
        this.cantidadEjes = cantidadEjes;
        this.cantidadRodadas = cantidadRodadas;
    }
    
    // SETTER & GETTER

    public float getCapacidadCargaKgs() {
        return capacidadCargaKgs;
    }

    public void setCapacidadCargaKgs(float capacidadCargaKgs) {
        this.capacidadCargaKgs = capacidadCargaKgs;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getCantidadRodadas() {
        return cantidadRodadas;
    }

    public void setCantidadRodadas(int cantidadRodadas) {
        this.cantidadRodadas = cantidadRodadas;
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
    
    
    
    // To String
    
       @Override
    public String toString() {
        return "Camioneta :" + "Marca = " + marca + " Numero Serie = " + numeroSerieMotor + " Precio = $" + precio + " Año = " + año + " CapacidadCarga = " + capacidadCargaKgs + "kgs" +" CantidadEjes = " + cantidadEjes + " CantidadRodados = "+ cantidadRodadas;
    } 
    
    
    //Set descuento 
    @Override
    public void setDescuento(double precio) {
    }
    
}
