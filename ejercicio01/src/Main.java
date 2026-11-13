 import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        int resultado = factorial(numero);
        
        System.out.println("El factorial de " + numero + " es: " + resultado);
        
        scanner.close();
    }
}
