package estrutura.dados.trabalho.lista.encadeada;

public class No {
    private ItemCompra dados;
    private No proximo;

    public No(ItemCompra dados) {
        this.dados = dados;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public ItemCompra getDados() {
        return dados;
    }
}
