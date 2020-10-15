public class Cliente {
    private String nombre;
    private double dni;

    public Cliente(String nombre, double dni){
        this.setNombre(nombre);
        this.setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }
}
