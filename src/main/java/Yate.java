public class Yate extends Barco{
    int potenciaCV;
    int cantCamarotes;

    public Yate(int matricula, int eslora, int anioFabricacion, int potenciaCV, int cantCamarotes){
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int modulo(int matricula, int eslora, int anioFabricacion, int potenciaCV, int cantCamarotes){
        int modulo = matricula + eslora + anioFabricacion + potenciaCV + cantCamarotes;
        return modulo;
    }
}
