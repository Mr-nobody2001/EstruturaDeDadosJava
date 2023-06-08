package estrutura.dados.trabalho.fila;

import java.util.Scanner;

public class Base {

    private static Scanner scan = new Scanner(System.in);
    private static Fila fila = new Fila();

    public static void main(String[] args) {
        Cliente temp;

        int opcao;

        System.out.print("Insira quantos clientes terão na fila: ");
        int tamanho = scan.nextInt();

        while (!fila.setMaxTam(tamanho)) {
            System.out.print("Valor inválido. Insira novamente: ");
            tamanho = scan.nextInt();
        }

        do {
            System.out.println("\n" + "Menu");
            System.out.println("Digite 0 - para sair");
            System.out.println("Digite 1 - para enfileira um cliente");
            System.out.println("Digite 2 - para desenfileirar um cliente");
            System.out.println("Digite 3 - para mostra o tamanho da fila");

            opcao = scan.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Saindo do menu");
                case 1 -> {
                    if (fila.filaCheia()) {
                        System.out.println("\n" + "A fila de clientes já está cheia!!!");
                    } else {
                        temp = criarCliente();

                        System.out.println("\n" + "Cliente enfileirado com sucesso!!!");
                        System.out.println(temp.getCliente());

                        fila.enfileirar(temp);
                    }
                }
                case 2 -> {
                    if (fila.filaVazia()) {
                        System.out.println("\n" + "A fila já está vazia!!!");
                    } else {
                        System.out.println("Cliente desenfileirado com sucesso!!!");
                        System.out.println(fila.desenfileirar().getCliente());
                    }
                }
                case 3 -> {
                    System.out.println("\n" + "O tamanho máximo da fila é: " + fila.getMaxTam());
                }
            }
        } while (opcao != 0);
    }

    public static Cliente criarCliente() {
        Cliente temp = new Cliente();

        System.out.print("Insira o nome do cliente: ");
        String nome;

        do {
            nome = scan.nextLine();
        } while (nome.equals(""));

        System.out.print("Insira a idade do cliente: ");
        int idade = scan.nextInt();

        while (idade < 0) {
            System.out.print("Idade inválida. Insira novamente: ");
            idade = scan.nextInt();
        }

        temp.setNome(nome);
        temp.setIdade(idade);

        return temp;
    }
}
