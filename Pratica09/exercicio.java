package Pratica09;

import java.util.*;

// --- CLASSES ---
class Funcionario {
    String nome, cpf, dataNasc; double salario;
    Funcionario(String n, String c, double s, String d) { nome=n; cpf=c; salario=s; dataNasc=d; }
    double getSalario() { return salario; }
    public String toString() { return nome + " (CPF: " + cpf + ") - Salário: R$" + getSalario(); }
}

class Gerente extends Funcionario {
    Gerente(String n, String c, double s, String d) { super(n, c, s, d); }
    @Override double getSalario() { return super.getSalario() + 2000; }
}

class Atendente extends Funcionario {
    double comissao;
    Atendente(String n, String c, double s, String d, double com) { super(n, c, s, d); comissao=com; }
    @Override double getSalario() { return super.getSalario() + comissao; }
}

// --- CLASSE PRINCIPAL ---
public class exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        int op = 0;

        while (op != 5) {
            System.out.print("\n1-Add Gerente | 2-Add Atendente | 3-Listar | 4-Buscar por CPF | 5-Sair\nOpção: ");
            if (in.hasNextInt()) {
                op = in.nextInt(); in.nextLine();
            } else {
                System.out.println("Opção inválida."); in.nextLine(); continue;
            }

            if (op == 1 || op == 2) {
                System.out.print("Nome: "); String n = in.nextLine();
                System.out.print("CPF: "); String c = in.nextLine();
                System.out.print("Data Nasc: "); String d = in.nextLine();
                System.out.print("Salário Base: "); double s = in.nextDouble();
                
                if (op == 1) lista.add(new Gerente(n, c, s, d));
                else {
                    System.out.print("Comissão: ");
                    lista.add(new Atendente(n, c, s, d, in.nextDouble()));
                }
                in.nextLine(); 
                System.out.println("Cadastrado!");
                
            } else if (op == 3) {
                if (lista.isEmpty()) System.out.println("Nenhum funcionário cadastrado.");
                for (Funcionario f : lista) System.out.println(f);
                
            } else if (op == 4) {
                System.out.print("Digite o CPF: "); String busca = in.nextLine();
                Funcionario encontrado = null;
                for (Funcionario f : lista) if (f.cpf.equals(busca)) encontrado = f;
                System.out.println(encontrado != null ? "Salário Total: R$" + encontrado.getSalario() : "Não encontrado.");
            }
        }
        in.close();
    }
}