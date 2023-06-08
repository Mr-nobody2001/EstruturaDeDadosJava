package estrutura.dados.trabalho.lista.encadeada;

import java.util.Scanner;

public class Base {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Lista lista = new Lista();

        ItemCompra temp;

        int opcao;

        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Menu");
            System.out.println("Digite 0 - para sair");
            System.out.println("Digite 1 - para inserir um item");
            System.out.println("Digite 2 - para retirar um item");
            System.out.println("Digite 3 - para pesquisar um item");
            System.out.println("Digite 4 - para mostrar a quantidade de itens na lista");
            System.out.println("Digite 5 - para imprimir a lista");

            opcao = scan.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Saindo do menu");
                case 1 -> {
                    temp = criarItem();

                    System.out.println("\n" + "Item inserido com sucesso!!!");
                    System.out.println(temp.getItemCompra());

                    lista.inserirInicio(temp);
                }
                case 2 -> {
                    if (lista.vazia()) {
                        System.out.println("\n" + "A lista já está vazia!!!");
                    } else {
                        temp = criarItem();

                        temp = lista.retirar(temp);

                        if (temp == null) {
                            System.out.println("\n" + "O item não existe na lista");
                        } else {
                            System.out.println("\n" + "O item foi retirado com sucesso!!!");
                            System.out.println(temp.getItemCompra());
                        }
                    }
                }
                case 3 -> {
                    if (lista.vazia()) {
                        System.out.println("\n" + "A lista está vazia!!!");
                    } else {
                        temp = criarItem();

                        temp = lista.buscar(temp);

                        if (temp == null) {
                            System.out.println("\n" + "O item não existe na lista");
                        } else {
                            System.out.println("\n" + "O item foi encontrado!!!");
                            System.out.println(temp.getItemCompra());
                        }
                    }
                }
                case 4 ->
                    System.out.println("\n" + "A quantidade de itens na lista é de: " + lista.getQde());
                case 5 -> {
                    System.out.println("Lista: ");

                    System.out.println(lista.getLista());
                }
            }
        } while (opcao != 0);
    }

    public static String[] inserirDadosItemCompra() {
        String[] retorno = new String[3];

        System.out.print("Insira a descrição do item: ");
        String descricao;

        do {
            descricao = scan.nextLine();
        } while (descricao.equals(""));

        System.out.print("Insira a quantidade do item: ");
        int quantidade;

        do {
            quantidade = scan.nextInt();
        } while (quantidade < 0);

        System.out.print("Insira o preço do item: ");
        double preco;

        do {
            preco = scan.nextDouble();
        } while (preco <= 0);

        retorno[0] = descricao;
        retorno[1] = Integer.toString(quantidade);
        retorno[2] = Double.toString(preco);

        return retorno;
    }

    public static ItemCompra criarItem() {
         String[] dados = inserirDadosItemCompra();

        ItemCompra temp = new ItemCompra();
        temp.setDescricao(dados[0]);
        temp.setQde(Integer.parseInt(dados[1]));
        temp.setPreco(Double.parseDouble(dados[2]));

        return temp;
    }
}
