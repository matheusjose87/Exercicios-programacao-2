public class questao4 {
    public static void main(String[] args) {
        String texto = "Programação";
        
        String parte1 = texto.substring(0, 8);

        // "ação" vai do índice 8 até o final
        String parte2 = texto.substring(8);

        System.out.println("Parte 1: " + parte1);
        System.out.println("Parte 2: " + parte2);
    }
}