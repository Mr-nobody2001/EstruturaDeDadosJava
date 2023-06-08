package estrutura.dados.fila.dinamica;

import estrutura.dados.lista.Iterator;

public class FilaDinamicaTeste {
    public static void main(String[] args) {
        FilaDinamica<String> filaDinamica = new FilaDinamica<>();

        filaDinamica.enfileirar("Gabriel");
        filaDinamica.enfileirar("Daniel");
        filaDinamica.enfileirar("Adriana");

        filaDinamica.desenfileirar();
        filaDinamica.desenfileirar();

        System.out.println(filaDinamica.imprimirFila());
    }
}
