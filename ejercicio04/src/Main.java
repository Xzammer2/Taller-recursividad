import java.util.Scanner;

public class Main {

    // Función recursiva para contar dígitos dividiendo entre 10
    public static int contarDigitos(int n) {
        // Manejamos negativos convirtiéndolos a positivos
        if (n < 0) {
            n = -n;
        }
        // Caso base: si el número es menor a 10, tiene 1 solo dígito
        if (n < 10) {
            return 1;
        }
        // Caso recursivo: 1 dígito más el resultado de quitarle el último dígito (n / 10)
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