package pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        boolean rodando = true;
        Scanner in = new Scanner(System.in);
        while (rodando) {
            System.out.println("----------------------------------");
            System.out.println("-------- Lista de Pessoas --------");
            System.out.println("----------------------------------");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Checar se está vazia");
            System.out.println("4 - Listar");
            System.out.print("Escolha: ");
            int escolha = in.nextInt();
            String nome = "";
            String cpf = "";

            switch (escolha) {
                case 1:
                    in = new Scanner(System.in);
                    System.out.print("Escreva o nome da pessoa: ");
                    nome = in.nextLine();
                    System.out.print("Escreva o CPF da pessoa: ");
                    cpf = in.nextLine();
                    Pessoa p1 = new Pessoa(nome, cpf);
                    pilha.empilhar(p1);
                    break;
                case 2:
                    in = new Scanner(System.in);
                    System.out.println(pilha.desempilhar());
                    break;
                case 3:
                    in = new Scanner(System.in);
                    System.out.println("A pilha está vazia?");
                    System.out.println(pilha.vazia());
                    break;
                case 4:
                    pilha.listar();
                    break;
                default:
                    System.out.println("Sistema encerrado.");
                    rodando = false;
            }
        }
    }
}
