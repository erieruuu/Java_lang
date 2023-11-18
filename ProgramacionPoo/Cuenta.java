package ProgramacionPoo;

public class Cuenta {
    
    //Definir los atributos
    private String titular;
    private double cantidad;

    //Constructor: "Construye" el objeto. Es el primer metodo que se usa.
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        
        if(cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    //Metodos
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "La cuenta del titular: "+ titular + " tiene una cantidad de " + "$" + cantidad + " en la cuenta.";
    }
}