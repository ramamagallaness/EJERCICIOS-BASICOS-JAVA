
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese la operación que desee realizar (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Operacion no válida");
        }

        scanner.close();
    }
}
