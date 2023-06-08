package estrutura.dados.algoritmos.busca.binaria;

public class BuscaBinariaTeste {
    public static void main(String[] args) {
        BuscaBinaria<Integer> buscaBinaria = new BuscaBinaria<>();

        Integer[] vetor = new Integer[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        System.out.println(buscaBinaria.buscarRecursivamente(vetor, 88));
    }
}
