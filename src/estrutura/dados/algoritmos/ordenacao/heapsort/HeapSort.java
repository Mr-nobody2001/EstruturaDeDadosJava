package estrutura.dados.algoritmos.ordenacao.heapsort;

public class HeapSort<T extends Comparable<T>> {
    // Representando um vetor no formato de uma árvore
    // 2 * 1 + 1 Filho a esquerda
    // 2 * 1 + 2 Filho a direita

    public void ordenar(T[] vetor) {
        for (int i = (vetor.length / 2) - 1; i >= 0; i--) {
            this.algoritmoOrdernador(vetor, vetor.length, i);
        }

        for (int i = vetor.length - 1; i > 0; i--) {
            T aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;

            algoritmoOrdernador(vetor, i, 0);
        }
    }

    private void algoritmoOrdernador(T[] vetor, int tamanho, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanho && vetor[esquerda].compareTo(vetor[raiz]) > 0) {
            raiz = esquerda;
        }

        if (direita < tamanho && vetor[direita].compareTo(vetor[raiz]) > 0) {
            raiz = direita;
        }

        if (raiz != i) {
            T aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            algoritmoOrdernador(vetor, tamanho, raiz);
        }
    }
}
