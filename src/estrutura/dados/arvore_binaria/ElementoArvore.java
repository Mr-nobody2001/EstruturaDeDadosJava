package estrutura.dados.arvore_binaria;

public class ElementoArvore<T> {
    private T valor;
    private ElementoArvore<T> esquerda;
    private ElementoArvore<T> direita;

    public ElementoArvore(T valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public ElementoArvore<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(ElementoArvore<T> esquerda) {
        this.esquerda = esquerda;
    }

    public ElementoArvore<T> getDireita() {
        return direita;
    }

    public void setDireita(ElementoArvore<T> direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }
}
