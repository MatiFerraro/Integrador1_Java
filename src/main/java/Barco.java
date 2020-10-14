public abstract class Barco {
    protected int matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco(int matricula, int eslora, int anioFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    protected int moduloNormal(){
        return this.eslora*10;
    }

    protected abstract int moduloEspecial();
}
