public class Yate extends Barco{
    private int potenciaCV;
    private int cantCamarotes;

    public Yate(String matricula, int eslora, int anioFabricacion, int potenciaCV, int cantCamarotes){
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int moduloBarco() {
        int moduloAux = super.moduloBarco() + this.getPotenciaCV() + this.getCantCamarotes();
        return moduloAux;
    }

    public int getPotenciaCV(){
        return potenciaCV;
    }

    public int getCantCamarotes(){
        return cantCamarotes;
    }
}
