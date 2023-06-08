package estrutura.dados.arvore_binaria;

public class ResultadoBusca<T> {
    private ElementoArvore<T> paiAtual;
    private ElementoArvore<T> atual;

    public ResultadoBusca(ElementoArvore<T> paiAtual, ElementoArvore<T> atual) {
        this.paiAtual = paiAtual;
        this.atual = atual;
    }

    public ElementoArvore<T> getPaiAtual() {
        return paiAtual;
    }

    public void setPaiAtual(ElementoArvore<T> paiAtual) {
        this.paiAtual = paiAtual;
    }

    public ElementoArvore<T> getAtual() {
        return atual;
    }

    public void setAtual(ElementoArvore<T> atual) {
        this.atual = atual;
    }
}
