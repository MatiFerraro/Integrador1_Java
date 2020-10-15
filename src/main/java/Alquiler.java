import java.util.Date;

public class Alquiler {
    private int valorFijo = 2;

    private String nombre;
    private double dni;
    private Date fechaInicial;   // YYYY/MM/DD
    private Date fechaFinal;     // YYYY/MM/DD
    private int posicionAmarre;
    private Barco barco;

    Cliente cliente = new Cliente(nombre, dni);

    public Alquiler(String nombre, double dni, Date fechaInicial, Date fechaFinal, int posicionAmarre, Barco barco){
        this.setNombre(nombre);
        this.dni = dni;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
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

    public long calcularAlquiler() {
        long duracionAlquiler = fechaFinal.getTime() - fechaInicial.getTime();
        int moduloBarco = barco.moduloBarco();
        long valorAlquiler = (duracionAlquiler * moduloBarco * valorFijo) / (24 * 60 * 60 * 1000);
        return valorAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
