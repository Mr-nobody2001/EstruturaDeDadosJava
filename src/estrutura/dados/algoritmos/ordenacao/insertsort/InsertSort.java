package estrutura.dados.algoritmos.ordenacao.insertsort;

public class InsertSort<T extends Comparable<T>> {
    public void ordenar(T[] vetor) {
        // Complexidade O(n ^ 2)

        T auxiliar;
        int j;

        for (int i = 1; i < vetor.length; i++) {

            auxiliar = vetor[i];

            for (j = i - 1; j >= 0 && auxiliar.compareTo(vetor[j]) < 0; j--) {
                vetor[j + 1] = vetor[j];
            }

            vetor[j + 1] = auxiliar;
        }
    }
}
