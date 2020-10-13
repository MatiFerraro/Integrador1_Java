public class Deportivo extends Barco{
    int potenciaCV;

    public Deportivo(int matricula, int eslora, int anioFabricacion, int potenciaCV){
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int modulo(int matricula, int eslora, int anioFabricacion, int potenciaCV){
        int modulo = matricula + eslora + anioFabricacion + potenciaCV;
        return modulo;
    }
}
