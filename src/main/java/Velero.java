public class Velero extends Barco{
    int cantMastiles;

    public Velero(int matricula, int eslora, int anioFabricacion, int cantMastiles){
        super(matricula, eslora, anioFabricacion);
        this.cantMastiles = cantMastiles;
    }

    @Override
    public int modulo(int matricula, int eslora, int anioFabricacion, int cantMastiles){
        int modulo = matricula + eslora + anioFabricacion + cantMastiles;
        return modulo;
    }
}
