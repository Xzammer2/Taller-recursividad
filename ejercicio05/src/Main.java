import java.util.Scanner;

public class InvertirSimple {

    public static String invertir(String cadena) {
        
        if (cadena.length() <= 1) {
            return cadena;
        }
        
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escribe una palabra: ");
        String palabra = teclado.nextLine();
    
        String resultado = invertir(palabra);
        
        System.out.println("Tu palabra al revés es: " + resultado);
    }
}
