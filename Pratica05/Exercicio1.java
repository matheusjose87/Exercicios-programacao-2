package Pratica05;

public class Exercicio1 {

    public static double calcularHipotenusa(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        double cateto1 = 3.0;
        double cateto2 = 4.0;

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);

        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
