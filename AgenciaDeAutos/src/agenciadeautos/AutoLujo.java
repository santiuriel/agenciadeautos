
package agenciadeautos;

/**
 *
 * @author yofac
 */
public class AutoLujo extends Auto {

    private int cantidadPasajeros;
    
    //Constructor

    public AutoLujo(String marca, String numeroSerieMotor, double precio, int año, int cantidadPasajeros) {
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
        return "Auto de Lujo :" + "Marca = " + marca + " Numero Serie = " + numeroSerieMotor + " Precio = $" + precio + " Año = " + año +  " CantidadPasajeros = " + cantidadPasajeros;
    } 
    
    // SetDescuento
    @Override
    public void setDescuento(double precio) {
        // Descuento del 15% porciento para AutoLujo
        this.precio = precio * 0.85;
    }
    
    
    
    
}
