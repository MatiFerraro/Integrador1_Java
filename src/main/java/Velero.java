public class Velero extends Barco{
    private int cantMastiles;

    public Velero(String matricula, int eslora, int anioFabricacion, int cantMastiles){
        super(matricula, eslora, anioFabricacion);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles(){
        return cantMastiles;
    }

    @Override
    public int moduloBarco() {
        int moduloAux = super.moduloBarco() + this.getCantMastiles();
        return moduloAux;
    }
}
