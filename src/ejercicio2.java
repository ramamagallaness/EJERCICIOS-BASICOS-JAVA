public class ejercicio2 {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println("primo");
            } else {
                System.out.print(i + " = ");
                imprimirDivisores(i);
                System.out.println();
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirDivisores(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}