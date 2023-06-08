package estrutura.dados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioTeste2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        String entrada;

        System.out.print("Insira uma expressão matemática: ");
        entrada = scan.next();

        System.out.print("\n");

        int i;

        for (i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == '(') {
                pilha.push('(');
            } else  {
                if (entrada.charAt(i) == ')') {
                    if (!pilha.isEmpty()) {
                        pilha.pop();
                    } else {
                        break;
                    }
                }
            }
        }

        if (i == entrada.length() && pilha.isEmpty()) {
            System.out.println("Os parênteses da expressão estão corretos");
        } else {
            System.out.println("Os parênteses da expressão estão errados");
        }
    }
}
