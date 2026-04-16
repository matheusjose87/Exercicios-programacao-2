public class Exercicio5 {
    public static void main(String[] args) {

        int[] notas = {7, 8, 6, 10, 9};

        int soma = 0;

        // Calculando a soma
        for (int nota : notas) {
            soma += nota;
        }

        // Calculando a média
        double media = (double) soma / notas.length;

        int acimaMedia = 0;
        for (int nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média: " + acimaMedia);
    }
}
