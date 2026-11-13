public class InvertirPalabraFor {
    public static void main(String[] args) {
        String texto = "Java";
        String textoInvertido = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        
        System.out.println("Original: " + texto);
        System.out.println("Invertida: " + textoInvertido); // Salida: avaJ
    }
}
