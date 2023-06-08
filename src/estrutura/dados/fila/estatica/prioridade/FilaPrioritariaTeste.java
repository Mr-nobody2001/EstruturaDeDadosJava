package estrutura.dados.fila.estatica.prioridade;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPrioritariaTeste {
    public static void main(String[] args) {
        Queue<String> filaPrioritaria = new LinkedList<>();
        Queue<String> filaNormal = new LinkedList<>();

        filaPrioritaria.add("Roberto");
        filaPrioritaria.add("Silvia");
        filaPrioritaria.add("Linda");

        filaPrioritaria.add("Igor");
        filaPrioritaria.add("Sintia");

        filaNormal.add("Ana");

        filaNormal.add("Joaquim");
        filaNormal.add("Pedro");

        int contadorPrioritario = 0;

        do {
            while (!filaPrioritaria.isEmpty()) {
                System.out.println(filaPrioritaria.peek());
                filaPrioritaria.remove();
                contadorPrioritario++;

                if (contadorPrioritario % 3 == 0) {
                    break;
                }
            }

            System.out.print("\n");

            while (!filaNormal.isEmpty()) {
                System.out.println(filaNormal.peek());
                filaNormal.remove();

                if (!filaPrioritaria.isEmpty()) {
                    break;
                }
            }

            System.out.print("\n");

        } while (!filaPrioritaria.isEmpty());

    }
}
