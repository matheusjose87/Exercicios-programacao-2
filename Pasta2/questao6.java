import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a palavra que deseja buscar: ");
        String palavra = scanner.nextLine();

        int posicao = frase.indexOf(palavra);

        if (posicao != -1) {
            System.out.println("A palavra foi encontrada na posição: " + posicao);
        } else {
            System.out.println("A palavra não foi encontrada. Resultado: " + posicao);
        }

        scanner.close();
    }
}