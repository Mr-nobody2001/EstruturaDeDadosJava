package estrutura.dados.recursividade;

public class SomaTeste {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (i * Math.random());
        }

        for (int temp : vetor) {
            System.out.println(temp);
        }

        System.out.println(somar(vetor, vetor.length));
    }

    public static int somar(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            return vetor[0];
        }

        return somar(vetor, --tamanho) + vetor[tamanho];
    }
}
