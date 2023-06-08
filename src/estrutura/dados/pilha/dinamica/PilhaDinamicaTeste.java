package estrutura.dados.pilha.dinamica;

public class PilhaDinamicaTeste {
    public static void main(String[] args) {
        PilhaDinamica<Integer> pilhaDinamica = new PilhaDinamica<>();

        pilhaDinamica.empilhar(59);
        pilhaDinamica.empilhar(63);
        pilhaDinamica.empilhar(48);

        pilhaDinamica.deletarPilha();

        System.out.println(pilhaDinamica.imprimirPilha());
    }
}
