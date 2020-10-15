public class Deportivo extends Barco{
    private int potenciaCV;

    public Deportivo(String matricula, int eslora, int anioFabricacion, int potenciaCV){
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int moduloBarco() {
        int moduloAux = super.moduloBarco() + this.getPotenciaCV();
        return moduloAux;
    }

    public int getPotenciaCV(){
        return potenciaCV;
    }
}
