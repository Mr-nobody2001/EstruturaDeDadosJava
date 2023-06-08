package estrutura.dados.trabalho.lista.encadeada;

public class Lista {
    private No primeiro;
    private int qde;

    public void inserirInicio(ItemCompra itemCompra) {
        No auxiliar = this.primeiro;

        this.primeiro = new No(itemCompra);

        this.primeiro.setProximo(auxiliar);

        this.qde++;
    }

    public ItemCompra buscar(ItemCompra itemCompra) {
        if (this.primeiro == null) {
            return null;
        }

        No auxiliar = this.primeiro;

        do {
            if (auxiliar.getDados().getDescricao().equals(itemCompra.getDescricao())
                    && auxiliar.getDados().getQde() == itemCompra.getQde()
                    && auxiliar.getDados().getPreco() == itemCompra.getPreco()) {
                return auxiliar.getDados();
            }

            auxiliar = auxiliar.getProximo();
        } while (auxiliar != null);

        return null;
    }

    public ItemCompra retirar(ItemCompra itemCompra) {
        if (this.primeiro == null) {
            return null;
        }

        No postAnt = null;
        No auxiliar = this.primeiro;

        do {
            if (auxiliar.getDados().getDescricao().equals(itemCompra.getDescricao())
                    && auxiliar.getDados().getQde() == itemCompra.getQde()
                    && auxiliar.getDados().getPreco() == itemCompra.getPreco()) {
                break;
            }

            postAnt = auxiliar;
            auxiliar = auxiliar.getProximo();
        } while (auxiliar != null);

        if (auxiliar == null) {
            return null;
        } else {
            if (this.primeiro == auxiliar) {
                this.primeiro = auxiliar.getProximo();
            } else {
                postAnt.setProximo(auxiliar.getProximo());
            }
        }

        auxiliar.setProximo(null);

        this.qde--;

        return auxiliar.getDados();
    }

    public boolean vazia () {
        return this.qde == 0;
    }

    public int getQde() {
        return this.qde;
    }

    public String getLista() {
        StringBuilder stringBuilder = new StringBuilder();

        if (this.primeiro == null) {
            return null;
        }

        No auxiliar = this.primeiro;

        do {
            stringBuilder.append(auxiliar.getDados().getItemCompra()).append("\n");
            auxiliar = auxiliar.getProximo();
        } while (auxiliar != null);

        return stringBuilder.toString();
    }
}
