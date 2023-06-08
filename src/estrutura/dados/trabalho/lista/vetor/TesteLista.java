package estrutura.dados.trabalho.lista.vetor;

import java.util.Scanner;

public class TesteLista {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Lista lista = new Lista();

        Contato temp;

        int opcao;

        System.out.print("Insira quantos contatos terão na lista: ");
        int tamanho = scan.nextInt();

        while (!lista.setMaxTam(tamanho)) {
            System.out.print("Valor inválido. Insira novamente: ");
            tamanho = scan.nextInt();
        }

        do {
            System.out.println("\n" + "Menu");
            System.out.println("Digite 0 - para sair");
            System.out.println("Digite 1 - para inserir um contato");
            System.out.println("Digite 2 - para retirar um contato");
            System.out.println("Digite 3 - para pesquisar um contato");
            System.out.println("Digite 4 - para mostrar o tamanho da lista");
            System.out.println("Digite 5 - para imprimir a lista");

            opcao = scan.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Saindo do menu");
                case 1 -> {
                    if (lista.listaCheia()) {
                        System.out.println("\n" + "A lista de contatos já está cheia!!!");
                    } else {
                        temp = criarContato();

                        System.out.println("\n" + "Contato inserido com sucesso!!!");
                        System.out.println(temp.getContato());

                        lista.insereFinal(temp);
                    }
                }
                case 2 -> {
                    if (lista.listaVazia()) {
                        System.out.println("\n" + "A lista já está vazia!!!");
                    } else {
                        System.out.print("Insira o cpf: ");
                        long cpf = scan.nextLong();

                        temp = new Contato("", "", cpf);
                        temp = lista.retira(temp);

                        if (temp == null) {
                            System.out.println("\n" + "O contato não existe na lista");
                        } else {
                            System.out.println("\n" + "O contato foi retirado com sucesso!!!");
                            System.out.println(temp.getContato());
                        }
                    }
                }
                case 3 -> {
                    if (lista.listaVazia()) {
                        System.out.println("\n" + "A lista está vazia!!!");
                    } else {
                        System.out.print("Insira o cpf: ");
                        long cpf = scan.nextLong();

                        temp = new Contato("", "", cpf);
                        temp = lista.pesquisa(temp);

                        if (temp == null) {
                            System.out.println("\n" + "O contato não existe na lista");
                        } else {
                            System.out.println("\n" + "O contato foi encontrado!!!");
                            System.out.println(temp.getContato());
                        }
                    }
                }
                case 4 -> {
                    System.out.println("\n" + "O tamanho máximo da fila é: " + lista.getMaxTam());
                }
                case 5 -> {
                    System.out.println("Lista: ");

                    String[] listaString = lista.getLista();

                    for (String tempString : listaString) {
                        System.out.println(tempString);
                    }
                }
            }
        } while (opcao != 0);
    }

    public static Contato criarContato() {
        System.out.print("Insira o nome do contato: ");
        String nome;

        do {
            nome = scan.nextLine();
        } while (nome.equals(""));

        System.out.print("Insira o endereço do contato: ");
        String endereco;

        do {
            endereco = scan.nextLine();
        } while (endereco.equals(""));

        System.out.print("Insira o cpf do contato: ");
        long cpf = scan.nextLong();

        Contato temp = new Contato(nome, endereco, cpf);

        return temp;
    }
}
