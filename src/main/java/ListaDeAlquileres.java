import java.util.List;
import java.util.ArrayList;

public class ListaDeAlquileres {
    ArrayList<Alquiler> listaDeAlquileres = new ArrayList<Alquiler>();

    public ListaDeAlquileres(){
        ArrayList<Alquiler> listaDeAlquileres = new ArrayList<Alquiler>();
    }

    public Alquiler getMenorAlquiler(){
        Alquiler menorAlquilerAux = listaDeAlquileres.get(0);
        for(int i = 1; i < listaDeAlquileres.size(); i++){
            if(listaDeAlquileres.get(i).calcularAlquiler() < menorAlquilerAux.calcularAlquiler()){
                menorAlquilerAux = listaDeAlquileres.get(i);
            }
            // Alquiler menorAlquiler = Collections.max(listaDeAlquileres.calcularAlquiler());
        }
        return menorAlquilerAux;
    }

    public Alquiler getMayorAlquiler(){
        Alquiler mayorAlquilerAux = listaDeAlquileres.get(0);
        for(int i = 1; i < listaDeAlquileres.size(); i++){
            if(listaDeAlquileres.get(i).calcularAlquiler() > mayorAlquilerAux.calcularAlquiler()){
                mayorAlquilerAux = listaDeAlquileres.get(i);
            }
        }
        return mayorAlquilerAux;
    }

    public int getPromedioAlquilerMensual(int mes) {
        int acum = 0;
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j < listaDeAlquileres.size(); j++) {
                acum += listaDeAlquileres.get(j).calcularAlquiler();
            }
        }
        return acum;
    }
}