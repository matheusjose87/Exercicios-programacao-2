package Pratica05;

public class Exercicio4 {

    public static int[] contarParesImpares(int[] numeros) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        return new int[]{pares, impares};
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6};

        int[] resultado = contarParesImpares(valores);

        System.out.println("Quantidade de pares: " + resultado[0]);
        System.out.println("Quantidade de ímpares: " + resultado[1]);
    }
}