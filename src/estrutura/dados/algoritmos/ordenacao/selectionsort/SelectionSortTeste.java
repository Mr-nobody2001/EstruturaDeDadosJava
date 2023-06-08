package estrutura.dados.algoritmos.ordenacao.selectionsort;

import estrutura.dados.algoritmos.ordenacao.selectionsort.SelectionSort;

public class SelectionSortTeste {
    public static void main(String[] args) {
        Integer[] vetorAleatorio = new Integer[100];

        for (int i = 0; i < vetorAleatorio.length; i++) {
            vetorAleatorio[i] = (int) (Math.random() * vetorAleatorio.length);
        }

        SelectionSort<Integer> selectionSort = new SelectionSort<>();

        for (Integer temp : vetorAleatorio) {
            System.out.println(temp);
        }

        System.out.println();

        selectionSort.ordenar(vetorAleatorio);

        for (Integer temp : vetorAleatorio) {
            System.out.println(temp);
        }
    }
}
