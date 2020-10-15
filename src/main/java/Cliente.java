public class Cliente {
    private String nombre;
    private double dni;
    private Barco barco;

    public Cliente(String nombre, double dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public Barco getBarco(){
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
}
