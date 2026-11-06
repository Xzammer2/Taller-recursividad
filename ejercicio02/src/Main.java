import java.util.Scanner;

public class Main {

    // Función recursiva para sumar de 1 a N
    public static int suma(int n) {
        // Caso base: si n es 1, la suma es 1 (o 0 si llega a 0)
        if (n <= 1) {
            return n;
        }
        // Caso recursivo: n + suma(n - 1)
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese N para sumar de 1 a N: ");
        int n = scanner.nextInt();

        System.out.println("La suma de 1 a " + n + " es: " + suma(n));
        scanner.close();
    }
}