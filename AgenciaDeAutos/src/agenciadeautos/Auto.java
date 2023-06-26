// CLASE ABSTRACTA
package agenciadeautos;

/**
 *
 * @author yofac
 */
public abstract class Auto {
    
    protected String marca;
    protected String numeroSerieMotor;
    protected double precio;
    protected int año;
//----------------------------------------
    public Auto() {
    }

    public Auto(String marca, String numeroSerieMotor, double precio, int año) {
        this.marca = marca;
        this.numeroSerieMotor = numeroSerieMotor;
        this.precio = precio;
        this.año = año;
    }
    
    //Metodo abstracto: Descuento
    public abstract void setDescuento(double precio);
    
    
    
}
