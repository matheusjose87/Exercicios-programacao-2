import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "1234";
        String senhaDigitada = "";

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Acesso permitido");

        scanner.close();
    }
}