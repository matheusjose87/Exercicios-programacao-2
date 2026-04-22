package Pratica05;

public class Exercicio2 {

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0]; // assume o primeiro como maior

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] valores = {10, 25, 7, 42, 3, 18};

        int maiorValor = encontrarMaior(valores);

        System.out.println("Maior valor: " + maiorValor);
    }
}
