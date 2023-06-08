package estrutura.dados.algoritmos.ordenacao.selectionsort;

public class SelectionSort<T extends Comparable<T>> {
    public void ordenar(T[] vetor) {
        // Complexidade O(n ^ 2)

        T auxiliar;
        int index;

        for (int i = 0; i < vetor.length; i++) {

            index = i;

            for (int j = i; j < vetor.length; j++) {
                if (vetor[index].compareTo(vetor[j]) > 0) {
                    index = j;
                }
            }

            auxiliar = vetor[i];
            vetor[i] = vetor[index];
            vetor[index] = auxiliar;
        }
    }
}
