package estrutura.dados.trabalho.lista.encadeada;

public class ItemCompra {
    private String descricao;
    private int qde;
    private double preco;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean setQde(int qde) {
        if (qde < 0) {
            return false;
        }

        this.qde = qde;
        return true;
    }

    public boolean setPreco(double preco) {
        if (preco <= 0) {
            return false;
        }

        this.preco = preco;
        return true;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQde() {
        return qde;
    }

    public double getPreco() {
        return preco;
    }

    public String getItemCompra() {
        return "ItemCompra{" +
                "descricao='" + descricao + '\'' +
                ", qde=" + qde +
                ", preco=" + preco +
                '}';
    }
}
