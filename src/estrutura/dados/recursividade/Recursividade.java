package estrutura.dados.recursividade;

public class Recursividade {
    public static void chegarElementosParaFrente(int[] vetor, int indiceInicial, int indiceFinal) {
        if (indiceInicial <= indiceFinal) {
            vetor[indiceFinal + 1] = vetor[indiceFinal];
            chegarElementosParaFrente(vetor, indiceInicial, indiceFinal - 1);
        }
    }
}
