import java.util.Scanner;

public class Main {

    public static String invertir(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + invertir(cadena.substring(0, cadena.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto o palabra: ");
        String texto = scanner.nextLine();

        System.out.println("Texto invertido: " + invertir(texto));
        scanner.close();
    }
}
