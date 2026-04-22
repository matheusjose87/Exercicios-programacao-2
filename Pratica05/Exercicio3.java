package Pratica05;

public class Exercicio3 {

    public static boolean elementoExiste(String[] array, String busca) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Maria", "João"};

        String busca = "Maria";

        boolean resultado = elementoExiste(nomes, busca);

        System.out.println("Elemento existe? " + resultado);
    }
}