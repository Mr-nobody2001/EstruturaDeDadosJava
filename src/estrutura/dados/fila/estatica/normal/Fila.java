package estrutura.dados.fila.estatica.normal;

import estrutura.dados.estrutura.EstruturaGenerica;

public class Fila<T> extends EstruturaGenerica<T> {
    public Fila(int quantidadeElementosDesejada) {
        super(quantidadeElementosDesejada);
    }

    public Fila() {
        super();
    }

    public void enfileirarElemento(T elemento) {
        this.adicionaElemento(elemento);
    }

    public T desenfileirarElemento() {
        if (this.estaVazia()) {
            return null;
        }

        T elemento = this.elementos[0];

        this.romoveElemento(0);

        return elemento;
    }

    public T verificarFronte() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }
}
