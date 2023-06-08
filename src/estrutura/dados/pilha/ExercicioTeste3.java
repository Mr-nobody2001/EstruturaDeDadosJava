package estrutura.dados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioTeste3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        int entrada, base;
        String resposta;

        System.out.print("Insira um número para ser convertido: ");
        entrada = scan.nextInt();

        System.out.print("Insira para qual base o número será convertido: ");
        base = scan.nextInt();

        resposta = converterNumero(pilha ,entrada, base);

        System.out.println("O número " + entrada + " convertido para a base " + base + " é igual a: " + resposta);
    }

    public static String converterNumero(Stack<Integer> pilha, int entrada, int base) {
        while (entrada != 0 && entrada != 1) {
            pilha.push(entrada % base);
            entrada /= base;
        }

        if (entrada > 0) {
            pilha.push(entrada);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!pilha.isEmpty()) {
            stringBuilder.append(pilha.peek());
            pilha.pop();
        }

        return stringBuilder.toString();
    }
}
