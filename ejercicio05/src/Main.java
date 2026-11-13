import java.util.Scanner;

public class InvertirCadena {

    public static String invertir(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        } else {
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una palabra o frase: ");
        String texto = scanner.nextLine();
        
        String resultado = invertir(texto);
        
        System.out.println("La cadena al revés es: " + resultado);
        
        scanner.close();
    }
}
