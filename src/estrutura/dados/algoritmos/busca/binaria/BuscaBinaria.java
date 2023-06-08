package estrutura.dados.algoritmos.busca.binaria;

public class BuscaBinaria<T extends Comparable<T>> {
    // Complexidade O(log n)

    public boolean buscarIterativamente(T[] vetor, T elemento) {
        int inicio, metade, fim;
        T valor;

        inicio = 0;
        fim = vetor.length - 1;

        while (inicio <= fim) {
            metade = (inicio + fim) / 2;
            valor = vetor[metade];

            if (valor.equals(elemento)) {
                return true;
            } else {
                if (valor.compareTo(elemento) > 0) {
                    // O valor do elemento é menor
                    fim = metade - 1;
                } else {
                    // O valor do elemento é maior
                    inicio = metade + 1;
                }
            }
        }

        return false;
    }

    public boolean buscarRecursivamente(T[] vetor, T elemento) {
        return fazerBuscaRecursiva(vetor, elemento, 0, vetor.length - 1);
    }

    private boolean fazerBuscaRecursiva(T[] vetor, T elemento, int inicio, int fim) {
        if (inicio > fim)
            return false;

        int metade = (inicio + fim) / 2;
        T valor = vetor[metade];

        if (valor.equals(elemento)) {
            return true;
        } else {
            if (valor.compareTo(elemento) > 0) {
                // O valor do elemento é menor
                return fazerBuscaRecursiva(vetor, elemento, inicio, metade - 1);
            }

            // O valor do elemento é maior
            return fazerBuscaRecursiva(vetor, elemento, metade + 1, fim);
        }
    }
}
