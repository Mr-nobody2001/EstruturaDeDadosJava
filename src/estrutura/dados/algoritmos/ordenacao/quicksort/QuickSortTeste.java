package estrutura.dados.algoritmos.ordenacao.quicksort;

public class QuickSortTeste {
    public static void main(String[] args) {
        Integer[] vetorAleatorio = new Integer[10];

        for (int i = 0; i < vetorAleatorio.length; i++) {
            vetorAleatorio[i] = (int) (Math.random() * vetorAleatorio.length);
        }

        QuickSort<Integer> quickSort = new QuickSort<>();

        for (Integer temp : vetorAleatorio) {
            System.out.println(temp);
        }

        System.out.println();

        quickSort.ordenar(vetorAleatorio, 0, vetorAleatorio.length - 1);

        for (Integer temp : vetorAleatorio) {
            System.out.println(temp);
        }
    }
}
