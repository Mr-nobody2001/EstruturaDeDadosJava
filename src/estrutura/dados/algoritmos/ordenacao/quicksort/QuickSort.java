package estrutura.dados.algoritmos.ordenacao.quicksort;

public class QuickSort<T extends Comparable<T>> {

    public void ordenar(T[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particao(vetor, esquerda, direita);
            ordenar(vetor, esquerda, pivo);
            ordenar(vetor, pivo + 1, direita);
        }
    }

    private int particao(T[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2; // Pega o número do meio do vetor
        T pivo = vetor[meio]; // Pega o valor do número do meio
        int i = esquerda - 1;
        int j = direita + 1;

        // Esse laço só para quando retornar j
        while (true) {
            do {
                i++;
            } while (vetor[i].compareTo(pivo) < 0);

            do {
                j--;
            } while (vetor[j].compareTo(pivo) > 0);

            if (i >= j) {
                return j;
            }

            T auxiliar = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = auxiliar;
        }
    }
}
