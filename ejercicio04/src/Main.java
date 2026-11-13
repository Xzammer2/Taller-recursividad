import java.util.Scanner;

public class Main {

    public static int contarDigitos(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();

        System.out.println("El número tiene " + contarDigitos(n) + " dígitos.");
        scanner.close();
    }
}
