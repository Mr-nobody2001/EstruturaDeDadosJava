package estrutura.dados.pilha.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Livro> pilhaLivros = new Stack<>();

        int opcao;
        boolean encerrarPrograma = false;

        do {
            opcao = mostrarMenuOpcoes(scan);

            switch (opcao) {
                case 1:
                {
                    if (empilharLivro(pilhaLivros, scan)) {
                        System.out.println("Livro empilhado com sucesso");
                    } else {
                        System.out.println("Livro não pode ser empilhado");
                    }
                }
                    break;
                case 2:
                {
                    if(desempilharLivro(pilhaLivros)) {
                        System.out.println("Livro desempilhado com sucesso");
                    } else {
                        System.out.println("A pilha de livros já está vazia");
                    }
                }
                    break;
                case 3:
                {
                    if (!veriricarTopoPilha(pilhaLivros)) {
                        System.out.println("A pilha de livros está vazia");
                    }
                }
                    break;
                case 4:
                    System.out.println("O tamanho da pilha é de: " + verificarTamanhoPilha(pilhaLivros)
                            + " livros(s)");
                    break;
                case 5:
                    if (verificarPilhaVazia(pilhaLivros)) {
                        System.out.println("A pilha de livros está vazia");
                    } else {
                        System.out.println("A pilha de livros não está vazia");
                    }
                    break;
                case 6:
                    encerrarPrograma = true;
                    break;

            }

            scan.nextLine();
        } while (!encerrarPrograma);
    }

    public static int mostrarMenuOpcoes(Scanner scan) {
        System.out.println("\n" + "Escolha uma das opcções: ");

        System.out.println("1 - Inserir um livro na pilha");
        System.out.println("2 - Retirar um livro da pilha");
        System.out.println("3 - Verificar qual livro está no topo da pilha");
        System.out.println("4 - Veriricar qual o tamanho da pilha");
        System.out.println("5 - Verificar se a pilha está vazia");
        System.out.println("6 - Sair do programa");

        int opcao = tratarExecaoTipoInputNumerico(scan);

        if (opcao != 0) {
            if (!(opcao > 0 && opcao < 7)) {
                return tratarOpcaoInvalida(scan, 7);
            } else {
                return opcao;
            }
        } else {
            return opcao;
        }
    }

    public static boolean empilharLivro(Stack<Livro> pilhaLivros, Scanner scan) {
        System.out.println("Deseja editar as informações do livro?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int opcao = tratarExecaoTipoInputNumerico(scan);

        if (opcao == 0) {
            return false;
        } else {
             if (opcao == 1) {
                 return editarInformacoesLivro(pilhaLivros, scan);
             } else {
                 pilhaLivros.push(new Livro());
                 return true;
             }
        }
    }

    public static boolean editarInformacoesLivro(Stack<Livro> pilhaLivros, Scanner scan) {
        String nome, autor, isbn;
        int anoLancamento;

        System.out.print("Insira o ano de lançamento do livro: ");
        anoLancamento = tratarExecaoTipoInputNumerico(scan);

        if (anoLancamento == 0) {
            return false;
        }

        System.out.print("Insira o nome do livro: ");
        nome = scan.next();

        System.out.print("Insira o nome do autor: ");
        autor = scan.next();

        System.out.print("Insira o isbn: ");
        isbn = scan.next();

        pilhaLivros.push(new Livro(nome, autor, isbn, anoLancamento));

        return true;
    }

    public static boolean desempilharLivro(Stack<Livro> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            return false;
        }

        pilhaLivros.pop();
        return true;
    }

    public static boolean veriricarTopoPilha(Stack<Livro> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            return false;
        }

        System.out.println(pilhaLivros.peek());
        return true;
    }

    public static int verificarTamanhoPilha(Stack<Livro> pilhaLivros) {
        return pilhaLivros.size();
    }

    public static boolean verificarPilhaVazia(Stack<Livro> pilhaLivros) {
        return pilhaLivros.isEmpty();
    }

    public static int tratarOpcaoInvalida(Scanner scan, int limiteSuperior) {
        int opcaoValida;

        do {
            System.out.print("Opcao não disponível no menu. Escolha outra: ");
            opcaoValida = tratarExecaoTipoInputNumerico(scan);
        } while (!(opcaoValida > 0 && opcaoValida < limiteSuperior));

        return opcaoValida;
    }

    public static int tratarExecaoTipoInputNumerico(Scanner scan) {
        int opcao;

        try {
            opcao = scan.nextInt();
            return opcao;
        } catch (InputMismatchException e) {
            System.out.println("Apenas caracteres númericos são válidos" + "\n");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Houve um erro inesperado" + "\n");
            e.printStackTrace();
        }

        return 0;
    }
}
