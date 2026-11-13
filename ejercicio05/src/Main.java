import java.util.Scanner;

public class Main {

    public static String invertir(String cadena) {
        
        if (cadena.length() <= 1) {
            return cadena;
        }
        
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine();
        
        String resultado = invertir(palabra);
        
        System.out.println("Al revés: " + resultado);
        
        sc.close();
    }
}
