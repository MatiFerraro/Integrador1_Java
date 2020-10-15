import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ListaDeAlquileres alquileres = new ListaDeAlquileres();
        Scanner entrada = new Scanner(System.in);
        int anio;
        int mes;

        Cliente juan = new Cliente("Juan", 20784915);       // Alquila x $3060
        Velero veleroJuan = new Velero("ABC123", 10, 1994, 2);
        Date fechaInitJuan = new Date(2020,1,15);
        Date fechaFinJuan = new Date(2020,1,30);
        Alquiler alquilerJuan = new Alquiler(juan.getNombre(), juan.getDni(), fechaInitJuan, fechaFinJuan, 5, veleroJuan);
        alquileres.agregarAlquiler(alquilerJuan);

        Cliente mati = new Cliente("Mati", 407221599);      // Alquila x $5880
        Deportivo deportivoMati = new Deportivo("MAF722", 15, 2017, 60);
        Date fechaInitMati = new Date(2020,1,3);
        Date fechaFinMati = new Date(2020, 1, 17);
        Alquiler alquilerMati = new Alquiler(mati.getNombre(), mati.getDni(), fechaInitMati, fechaFinMati, 7, deportivoMati);
        alquileres.agregarAlquiler(alquilerMati);

        Cliente licha = new Cliente("Licha", 30151515);     // Alquila x $8840
        Yate yateLicha = new Yate("LIS915", 30, 2002, 30, 10);
        Date fechaInitLicha = new Date(2020,1,9);
        Date fechaFinLicha = new Date(2020, 1, 22);
        Alquiler alquilerLicha = new Alquiler(licha.getNombre(), licha.getDni(), fechaInitLicha, fechaFinLicha, 9, yateLicha);
        alquileres.agregarAlquiler(alquilerLicha);

        System.out.println("Ingrese el anio a consultar: ");
        anio = entrada.nextInt();
        System.out.println("Ingrese el numero de mes a consultar: ");
        mes = entrada.nextInt();
        System.out.println("El mayor alquiler fue: " + alquileres.getMayorAlquiler().calcularAlquiler() + "\n" +
                "El menor alquiler fue: " + alquileres.getMenorAlquiler().calcularAlquiler() + "\n" +
                "El promedio mensual del mes " + mes + " fue: " + alquileres.getPromedioAlquilerMensual(anio, mes) + "\n" +
                "El promedio anual del anio " + anio + " fue: " + alquileres.getPromedioAlquilerAnual(anio) + "\n");
    }
}
