
import java.util.Scanner;

/*
2. Dado una hora en números, debemos convertirla en palabras de la forma:
6:00 → seis en punto
6:02 → seis y dos minutos
6:10 → seis y diez minutos
6:30 → seis y media
6:45 → seis y cuarenta y cinco minutos
6:55 → seis y cincuenta y cinco minutos
Escribe un programa que imprima el tiempo en palabras para la entrada dada en el formato mencionado arriba.
Formato de entrada
Se requieren dos líneas de entrada:
H, representando las horas
M, representando los minutos
Requisitos
1 ≤𝐻<12
0≤𝑀< 60
Formato de salida
Mostrar el tiempo en palabras
Ejemplo entrada
2
40
Ejemplo salida
dos y cuarenta minutos
 */

public class TiempoEnPalabras {

    public static void main(String[] args) {
        // intancia de la clase Scanner para el ingreso por teclado
        Scanner sc = new Scanner(System.in);
        // declaración de variables
        int h = 0;
        int m = 0;
        boolean entrada = true;
        
        // lectura y validación de tipo de dato entero para la variable h: hora
        while (entrada) {
            try {
                System.out.println("Introduce la hora, en el rango [1-12]: ");
                h = Integer.parseInt(sc.nextLine());
                entrada = false;
            }
            catch (NumberFormatException e){
                System.out.println("¡¡ entrada no valida, repitela de nuevo !!");
            }
        }
        
        // lectura y validación de tipo de dato entero para la variable m: minutos
        entrada = true;
        while (entrada) {
            try {
                System.out.println("Introduce los minutos, en el rango [0-60]: ");
                m = Integer.parseInt(sc.nextLine());
                entrada = false;
            }
            catch (NumberFormatException e){
                System.out.println("¡¡ entrada no valida, repitela de nuevo !!");
            }
        }
        
        // logica para la convertir a texto
        if (h >=1 && h<=12){
            String hora= cadenaenhora(h);
            if (m >=0 && m<60){
                if (m==0){
                    System.out.println(hora + " en punto");
                }
                else {
                    String min= cadenaenminutos(m);
                    System.out.println(hora + " y " + min + " minutos");
                }
            }
            else System.out.println("Minutos invalidos");
        }
        else System.out.println("Hora invalida");
    }
    
    /**
     * 
     * @param h : hora tipo int
     * @return cadena con la hora en letras 
     * partiendo de un entero (h) entre 1 a 12 devuelve el número en letras 
     */
    private static String cadenaenhora(int h) {
        switch (h) {
            case 1:
                return ("Una");
            case 2:
                return ("Dos");
            case 3:
                return ("Tres");
            case 4:
                return ("Cuatro");
            case 5:
                return ("Cinco");
            case 6:
                return ("Seis");
            case 7:
                return ("Siete");
            case 8:
                return ("Ocho");
            case 9:
                return ("Nueve");
            case 10:
                return ("Diez");
            case 11:
                return ("Once");
            case 12:
                return ("Doce");
        }
        return null;
    }

    /**
     * 
     * @param m : minutos, entero entre 0 y 60
     * @return cadena con los minutos en letras
     * esta funcion separa los minutos de decenas y unidades e invoca a las funciones que devuelven el numero en letras
     */
    private static String cadenaenminutos(int m) {
        // separacion en decenas y unidades
        int decena = m/10;
        int unidad = m%10;
        
        // loguica para invocación de funciones
        switch (decena) {
            case 1:
                return numerosDel10al20(m);
            case 0:
                return unidades(unidad);
            default:
                if (unidad==0)
                    return decenas(decena) + unidades(unidad);
                else
                    return decenas(decena) + " y" + unidades(unidad);
        }
    }

    /**
     * 
     * @param m: minutos
     * @return cadena con el respectivo numero entre 10 y 19 convertido a letras
     */
    private static String numerosDel10al20(int m) {
        switch (m) {
            case 10:
                return ("Diez");
            case 11:
                return ("Once");
            case 12:
                return ("Doce");
            case 13:
                return ("Trece");
            case 14:
                return ("Catorce");
            case 15:
                return ("Quice");
            case 16:
		return "Dieciseis";
            case 17:
                    return "Diecisiete";
            case 18:
                    return "Dieciocho";
            case 19:
                    return "Diecinueve";
        }
        return null;
    }

    /**
     * 
     * @param unidad: valor de las unidades entre 0 y 9
     * @return cadena correspondiente a un número entre 0 y 9
     */
    private static String unidades(int unidad) {
        switch(unidad){
	case 1:
		return " un";
	case 2:
		return " dos";
	case 3:
		return " tres";
	case 4:
		return " cuatro";
	case 5:
		return " cinco";
	case 6:
		return " seis";
	case 7:
		return " siete";
	case 8:
		return " ocho";
	case 9:
		return " nueve";
	case 0:
		return "";
        }
        return null;
    }

    /**
     * 
     * @param decena: entero, entre 2 y 5 valor de las decenas correspondiente a los minutos ingresados
     * @return cadena con el valor de la decena de los minutos en letras 
     */
    private static String decenas(int decena) {
        switch (decena){
	case 2:
		return "Veinte";
	case 3:
		return "Treinta";
	case 4:
		return "Cuarenta";
	case 5:
		return "Cincuenta";		
	default:
		return "";
        }
    }
    
}
