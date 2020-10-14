public class Deportivo extends Barco{
    private int potenciaCV;

    public Deportivo(int matricula, int eslora, int anioFabricacion, int potenciaCV){
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    protected int moduloEspecial() {
        int moduloAux = this.moduloNormal() + this.getPotenciaCV();
        return moduloAux;
    }

    public int getPotenciaCV(){
        return potenciaCV;
    }
}
