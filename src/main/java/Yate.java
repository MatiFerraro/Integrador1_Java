public class Yate extends Barco{
    private int potenciaCV;
    private int cantCamarotes;

    public Yate(int matricula, int eslora, int anioFabricacion, int potenciaCV, int cantCamarotes){
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    protected int moduloEspecial() {
        int moduloAux = this.moduloNormal() + this.getPotenciaCV() + this.getCantCamarotes();
        return moduloAux;
    }

    public int getPotenciaCV(){
        return potenciaCV;
    }

    public int getCantCamarotes(){
        return cantCamarotes;
    }
}
