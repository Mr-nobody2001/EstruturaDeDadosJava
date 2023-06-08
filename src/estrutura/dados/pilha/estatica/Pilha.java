package estrutura.dados.pilha.estatica;

import estrutura.dados.estrutura.EstruturaGenerica;

public class Pilha<T> extends EstruturaGenerica<T> {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilharElemento(T elemento) {
        this.adicionaElemento(elemento);
    }

    public T verificarElementoTopo() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public T desempilharElemento() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[--tamanho];
    }
}
