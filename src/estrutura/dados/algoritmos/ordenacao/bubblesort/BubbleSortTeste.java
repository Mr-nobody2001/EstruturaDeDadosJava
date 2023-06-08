package estrutura.dados.algoritmos.ordenacao.bubblesort;

public class BubbleSortTeste {
    public static void main(String[] args) {
        Integer[] vetorAleatorio = new Integer[100];

        for (int i = 0; i < vetorAleatorio.length; i++) {
            vetorAleatorio[i] = (int) (Math.random() * vetorAleatorio.length);
        }

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        bubbleSort.ordenar(vetorAleatorio);

        for (Integer temp : vetorAleatorio) {
            System.out.println(temp);
        }
    }
}
