package estrutura.dados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPalindromoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> pilha1 = new Stack<>();
        Stack<Character> pilha2 = new Stack<>();

        String entrada;

        System.out.print("Insira uma String: ");
        entrada = scan.next();

        System.out.print("\n");

        int tamanho = entrada.length();

        for (int i = 0; i < tamanho / 2; i++) {
            pilha1.push(entrada.charAt(i));
        }

        for (int i = tamanho - 1, j = 0; j < pilha1.size(); i--, j++) {
            pilha2.push(entrada.charAt(i));
        }


        while (!pilha1.isEmpty()) {
            if (pilha1.peek() != pilha2.peek()) {
                break;
            }

            pilha1.pop();
            pilha2.pop();
        }

        if (pilha1.isEmpty()) {
            System.out.println("A string é um palíndromo");
        } else {
            System.out.println("A String não é um palíndromo");
        }

}
}
