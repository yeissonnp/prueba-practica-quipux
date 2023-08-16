
import java.util.InputMismatchException;
import java.util.Scanner;


/**
1. Dado un número entero, lleve a cabo las siguientes condiciones:
 ● Si es impar, imprimir “Quipux” 
 ● Si es par y está en el rango inclusivo de 2 y 5, imprima “No Quipux” 
 ● Si es par y está en el rango inclusivo de 6 y 20, imprima “Quipux” 
 ● Si es par y es mayor que 20, imprima “No Quipux”
Formato de entrada
    Una sola línea que contiene un entero positivo.
Restricciones
    1≤𝑛≤100
Formato de salida
    Imprimir “Quipux” o “No Quipux” basado en las restricciones anteriores
 * 
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        // instancia de la clase Scanner para el ingreso por teclado
        Scanner sc = new Scanner(System.in);
        // declaración de variables
        int num = 0;
        boolean entrada=true;
        // lectura y validación de tipo de dato entero para la variable num: valor entero solicitado
        while (entrada) {
            try {
                System.out.println("Introduce un número entero desde 1 hasta 100: ");
                num = Integer.parseInt(sc.nextLine());
                entrada = false;
            }
            catch (NumberFormatException e){
                System.out.println("¡¡ entrada no valida !!");
            }
        }
        
        // logica de desición según lineamientos del enunciado
        if(num >= 1 && num <= 100 ){
            if (num % 2 != 0){
                System.out.println("Quipux");
            }
            else{
                if(num >= 2 && num <= 5 ){
                    System.out.println("No Quipux");
                }
                else{
                    if(num >= 6 && num <= 20 ){
                    System.out.println("Quipux");
                    }
                    else{
                        if(num > 20){
                            System.out.println("No Quipux");
                        }
                    }
                }
            }
        }
        else{
            System.out.println(" ¡ Número fuera del rango [1-100] ! ");
        }
    }
    
}
