package estrutura.dados.recursividade;

public class RecursividadeTeste {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 1; i < vetor.length - 1; i++) {
            vetor[i] = i;
        }

        for (int temp : vetor) {
            System.out.print(temp + " ");
        }

        System.out.println();

        Recursividade.chegarElementosParaFrente(vetor, 0, 8);

        for (int temp : vetor) {
            System.out.print(temp + " ");
        }
    }
}
