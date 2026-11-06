import java.util.Scanner;

public class Main {

    // Función recursiva para calcular la potencia
    public static int potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: base * potencia(base, exponente - 1)
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