package estrutura.dados.pilha.dinamica;

import estrutura.dados.lista.Elemento;
import estrutura.dados.lista.Iterator;
import estrutura.dados.lista.ListaEncadeada;

public class PilhaDinamica<T> {
    private ListaEncadeada<T> elementos;

    public PilhaDinamica() {
        this.elementos = new ListaEncadeada<>();
    }

    public void empilhar(T elemento) {
        this.elementos.adicionar(elemento);
    }

    public Elemento<T> desempilhar() {
        return this.elementos.deletarElementoIndex(this.elementos.getTamanho() - 1);
    }

    public void deletarPilha() {
        this.elementos.deletarLista();
    }

    public String imprimirPilha() {
       return this.elementos.imprimirLista();
    }

    public int tamanho() {
        return this.elementos.getTamanho();
    }

    public Elemento<T> topo() {
        return this.elementos.getUltimo();
    }

    public Iterator<T> getIterator() {
        return this.elementos.getIterator();
    }
}
