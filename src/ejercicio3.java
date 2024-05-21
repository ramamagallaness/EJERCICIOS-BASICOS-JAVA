
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce un número:");
            numero = scanner.nextInt();
        } while (!esMayorACien(numero) || !esPrimo(numero));
        
        System.out.println("El número " + numero + " es mayor que 100 y es primo.");
    }
    
    public static boolean esMayorACien(int numero) {
        return numero > 100;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
