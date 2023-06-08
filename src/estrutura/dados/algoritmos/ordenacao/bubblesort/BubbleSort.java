package estrutura.dados.algoritmos.ordenacao.bubblesort;

public class BubbleSort<T extends Comparable<T>> {
    // Complexidade O(n ^ 2)
    public void ordenar(T[] vetor) {
        T auxiliar;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i].compareTo(vetor[j]) > 0) {
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
    }
}
