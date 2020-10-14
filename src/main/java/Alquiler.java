import java.util.Date;

public class Alquiler {
    private int valorFijo = 2;

    private  String nombre;
    private double dni;
    private int fechaInicial;   // YYYY/MM/DD
    private int fechaFinal;     // YYYY/MM/DD
    private int posicionAmarre;
    private Date fechaFactura;

    Cliente cliente = new Cliente(nombre, dni);
    Barco barco = cliente.getBarco();

    public Alquiler(String nombre, double dni, int fechaInicial, int fechaFinal, int posicionAmarre, Barco barco){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public int calcularAlquiler(){
        int duracionAlquiler = fechaFinal - fechaInicial;
        int moduloBarco = barco.moduloNormal();
        int valorAlquiler = duracionAlquiler * moduloBarco * valorFijo;
        return valorAlquiler;
    }
}
