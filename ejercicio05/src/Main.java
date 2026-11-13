import java.util.Scanner;

public class Principal {

    public static String invertir(String s) {
        if (s.isEmpty()) return "";
        return invertir(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        System.out.println("Al revés: " + invertir(sc.nextLine()));
    }
}
