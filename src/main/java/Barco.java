public abstract class Barco {
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco(String matricula, int eslora, int anioFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int moduloBarco(){
        return this.eslora * 10;
    }
}
