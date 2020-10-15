import java.util.Date;

public class Alquiler {
    private int valorFijo = 2;

    private String nombre;
    private double dni;
    private Date fechaInicial;   // YYYY/MM/DD
    private Date fechaFinal;     // YYYY/MM/DD
    private int posicionAmarre;

    Cliente cliente = new Cliente(nombre, dni);
    Barco barco = cliente.getBarco();

    public Alquiler(String nombre, double dni, Date fechaInicial, Date fechaFinal, int posicionAmarre, Barco barco){
        this.nombre = nombre;
        this.dni = dni;
        this.setFechaInicial(fechaInicial);
        this.setFechaFinal(fechaFinal);
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int calcularAlquiler(){
        int duracionAlquiler = getFechaFinal().getDay() - getFechaInicial().getDay();
        int moduloBarco = barco.moduloNormal();
        int valorAlquiler = duracionAlquiler * moduloBarco * valorFijo;
        return valorAlquiler;
    }


}
