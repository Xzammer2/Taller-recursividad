import java.util.Scanner;

public class Main {

    // Función recursiva para invertir una cadena
    public static String invertir(String cadena) {
        // Caso base: si la cadena está vacía o tiene 1 solo carácter, se devuelve a sí misma
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        // Caso recursivo: toma el último carácter y le suma la inversión del resto de la cadena
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