package estrutura.dados.algoritmos.ordenacao.insertsort;

public class InsertSortTeste {
    public static void main(String[] args) {
        Integer[] vetorAleatorio = new Integer[10000];

        for (int i = 0; i < vetorAleatorio.length; i++) {
            vetorAleatorio[i] = (int) (Math.random() * vetorAleatorio.length);
        }

        InsertSort<Integer> insertSort = new InsertSort<>();

        insertSort.ordenar(vetorAleatorio);

        for (Integer temp : vetorAleatorio) {
            System.out.println(temp);
        }
    }
}
