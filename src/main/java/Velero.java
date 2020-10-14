public class Velero extends Barco{
    private int cantMastiles;

    public Velero(int matricula, int eslora, int anioFabricacion, int cantMastiles){
        super(matricula, eslora, anioFabricacion);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles(){
        return cantMastiles;
    }

    @Override
    protected int moduloEspecial() {
        int moduloAux = this.moduloNormal() + this.getCantMastiles();
        return moduloAux;
    }
}
