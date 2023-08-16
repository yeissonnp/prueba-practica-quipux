
import java.util.Scanner;
import models.equipo;


public class EquipoDeFutbol {

    // clase principal
    public static void main(String[] args) {
        // instancia de la clase equipo
        equipo equipo1= new equipo();
        // instancia de la clase Scanner para el ingreso por teclado
        Scanner sc = new Scanner(System.in);
        
        // lectura de valores nombre, estadio y titulos del objeto equipo
        System.out.println("Introduce el nombre del equipo: ");
        equipo1.setNombre(sc.nextLine());
        System.out.println("Introduce el estadio del equipo: ");
        equipo1.setEstadio(sc.nextLine());
        System.out.println("Introduce la cantidad de títulos del equipo: ");
        equipo1.setTitulos(sc.nextInt());
        
        // lectura de integrantes del equipo
        // solicitud del tamaño del grupo de titulares
        System.out.println(" ------------------------- ");
        System.out.println("Introduce la cantidad de jugadores titulares: ");
        // cantidad de jugadores titulares del equipo
        int numTitulares = sc.nextInt();
        
        // declaración de variables para almacenar datos de los jugadores
        String nombre;
        String pos;
        // ciclo para adicionar registros al grupo de titurales del objeto equipo
        for (int i=1; i<=numTitulares; i++){
            // lectura de datos
            System.out.println("Introduce el nombre del jugador " + i + " : ");
            nombre=sc.next();
            System.out.println("Introduce la posición del jugador " + i + " : ");
            pos=sc.next();
            // adicion del jugador a la lista de titulares, con el metodo agregarTitular de la clase equipo
            equipo1.agregarTitular(nombre, pos);
        }
        
        // solicitud del tamaño del grupo de suplentes
        System.out.println(" ------------------------- ");
        System.out.println("Introduce la cantidad de jugadores Suplentes: ");
        // cantidad de jugadores suplentes del equipo
        int numSuplentes = sc.nextInt();
        // ciclo para adicionar registros al grupo de suplentes del objeto equipo
        for (int i=1; i<=numSuplentes; i++){
            // lectura de datos
            System.out.println("Introduce el nombre del jugador " + i + " : ");
            nombre=sc.next();
            System.out.println("Introduce la posición del jugador " + i + " : ");
            pos=sc.next();
            // adicion del jugador a la lista de suplentes, con el metodo agregarSuplente de la clase equipo
            equipo1.agregarSuplente(nombre, pos);
        }
        
        // menú de reportes
        String op;
        while (true){
            // solicitud tipo de reporte
            System.out.println("Ingrese una opción : 1- Reporte basico, 2- Reporte detallado, 0- Salir");
            op = sc.next();
            if ("0".equals(op)) break;
            switch (op){
                case "1":
                    // reporte básico ejecutado con el metodo reportebasico de la clase equipo
                    System.out.println(equipo1.reportebasico());
                    break;
                case "2":
                    // reporte detallado ejecutado con el metodo reporteDetallado de la clase equipo
                    System.out.println(equipo1.reporteDetallado());
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
