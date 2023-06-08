package estrutura.dados.fila.dinamica;

import estrutura.dados.lista.Elemento;
import estrutura.dados.lista.Iterator;
import estrutura.dados.lista.ListaEncadeada;

public class FilaDinamica<T> {
    private ListaEncadeada<T> elementos;

    public FilaDinamica() {
        this.elementos = new ListaEncadeada<>();
    }

    public void enfileirar(T elemento) {
        this.elementos.adicionar(elemento);
    }

    public Elemento<T> desenfileirar() {
        return this.elementos.deletarElementoIndex(0);
    }

    public void deletarFila() {
        this.elementos.deletarLista();
    }

    public String imprimirFila() {
        return this.elementos.imprimirLista();
    }

    public int tamanho() {
        return this.elementos.getTamanho();
    }

    public Elemento<T> frente() {
        return this.elementos.getPrimeiro();
    }

    public Iterator<T> getIterator() {
        return this.elementos.getIterator();
    }
}
