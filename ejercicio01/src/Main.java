import java.util.Scanner;

public class Main {

    // Función recursiva para calcular el factorial
    public static int factorial(int n) {
        // Caso base: el factorial de 0 o 1 es 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = scanner.nextInt();

        System.out.println("El factorial de " + n + " es: " + factorial(n));
        scanner.close();
    }
}