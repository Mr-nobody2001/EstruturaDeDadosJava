package estrutura.dados.fila.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class BatataQuenteTeste {
    public static void main(String[] args) {
        Queue<Integer> roda = new LinkedList<>();

        int tamanhoRoda = 10;

        System.out.println("Temos " + tamanhoRoda + " crianças na roda");

        for (int i = 0; i < tamanhoRoda; i++) {
            roda.add(i + 1);
        }

        int queimar;

        do {
            do {
                queimar = (int) Math.ceil((Math.random() * tamanhoRoda));
            } while (queimar == 0);

            System.out.println("\n" + "Bata quente quente quente");
            System.out.println("Queimou!!!");

            for (int i = 0; i < queimar; i++) {
                roda.add(roda.remove());
            }

            System.out.println("Criança número " + roda.peek() + " foi queimada e saiu do jogo");
            roda.remove();

        } while (roda.size() > 1);

        System.out.println("\n" + "Criança " + roda.peek() + " ganhou o jogo!!!");
    }
}
