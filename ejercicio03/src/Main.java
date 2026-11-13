import java.util.Scanner;

public class Main {

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        System.out.println(base + " elevado a la " + exponente + " es: " + potencia(base, exponente));
        scanner.close();
    }
}
