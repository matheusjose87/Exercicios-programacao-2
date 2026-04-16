
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("Você é obrigado a votar.");
        } else {
            System.out.println("Você NÃO é obrigado a votar.");
        }

        scanner.close();
    }
}