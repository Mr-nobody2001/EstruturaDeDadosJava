package estrutura.dados.algoritmos.ordenacao.heapsort;

public class HeapSortTeste {
    // n log n

    public static void main(String[] args) {
        Integer[] vetorAleatorio = new Integer[10];

        for (int i = 0; i < vetorAleatorio.length; i++) {
            vetorAleatorio[i] = (int) (Math.random() * vetorAleatorio.length);
        }

        System.out.print("Desordenado: ");

        for (Integer temp : vetorAleatorio) {
            System.out.print(temp + " ");
        }

        // Heap sort
        HeapSort<Integer> heapSort = new HeapSort<>();

        heapSort.ordenar(vetorAleatorio);

        System.out.println();

        System.out.print("Ordenado: ");

        for (Integer temp : vetorAleatorio) {
            System.out.print(temp + " ");
        }
    }
}
