package Pratica07;

class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    // Método para calcular média
    public double calcularMedia() {
        return (nota1 + nota2 + notaTrabalho) / 3;
    }

    public void verificarSituacao() {
        double media = calcularMedia();
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        System.out.println("----------------------");
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        // Criando dois alunos
        Aluno aluno1 = new Aluno("João", "2023001", 8.0, 7.5, 9.0);
        Aluno aluno2 = new Aluno("Maria", "2023002", 5.0, 6.0, 4.5);

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}