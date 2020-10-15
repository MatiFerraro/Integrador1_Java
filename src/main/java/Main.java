import java.util.Date;

public class Main {
    public static void main(String args[]){
        ListaDeAlquileres alquileres = new ListaDeAlquileres();

        Cliente juan = new Cliente("Juan", 20784915);
        Velero veleroJuan = new Velero("ABC123", 10, 1994, 2);
        Date fechaInitJuan = new Date(2020,1,15);
        Date fechaFinJuan = new Date(2020,1,30);
        Alquiler alquilerJuan = new Alquiler(juan.getNombre(), juan.getDni(), fechaInitJuan, fechaFinJuan, 5, veleroJuan);
        alquileres.agregarAlquiler(alquilerJuan);

        Cliente mati = new Cliente("Mati", 407221599);
        Deportivo deportivoMati = new Deportivo("MAF722", 15, 2017, 60);
        Date fechaInitMati = new Date(2020,1,03);
        Date fechaFinMati = new Date(2020, 1, 17);
        Alquiler alquilerMati = new Alquiler(mati.getNombre(), mati.getDni(), fechaInitMati, fechaFinMati, 7, deportivoMati);
        alquileres.agregarAlquiler(alquilerMati);

        Cliente licha = new Cliente("Licha", 30151515);
        Yate yateLicha = new Yate("LIS915", 30, 2002, 30, 10);
        Date fechaInitLicha = new Date(2020,1,9);
        Date fechaFinLicha = new Date(2020, 1, 22);
        Alquiler alquilerLicha = new Alquiler(licha.getNombre(), licha.getDni(), fechaInitLicha, fechaFinLicha, 9, yateLicha);
        alquileres.agregarAlquiler(alquilerLicha);
    }
}
