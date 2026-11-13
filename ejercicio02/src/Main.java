import java.util.Scanner;

public class Main {

    public static int suma(int n) {
        if (n <= 1) {
            return n;
        }
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
