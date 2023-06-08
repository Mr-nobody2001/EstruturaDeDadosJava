package estrutura.dados.lista;

public class ListaEncadeada<T> {
    private Elemento<T> primeiro;
    private Elemento<T> ultimo;

    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public Elemento<T> getPrimeiro() {
        return primeiro;
    }

    public Elemento<T> getUltimo() {
        return ultimo;
    }

    public void adicionar(T elemento) {
        Elemento<T> auxiliar = new Elemento<>(elemento);

        if (this.primeiro == null) {
            this.primeiro = auxiliar;
        } else {
            this.ultimo.setProximo(auxiliar);
        }

        this.ultimo = auxiliar;
        this.tamanho++;
    }

    private Elemento<T> get(int posicao) {
        if (posicao < 0 || posicao > this.tamanho - 1) {
            return null;
        }

        Elemento<T> atual = this.primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    public Elemento<T> deletarElemento(T elemento) {
        Elemento<T> atual = this.primeiro;

        int posicao = -1;

        for (int i = 0; i < this.tamanho; i++) {
            if (atual.getValor().equals(elemento)) {
                posicao = i;
                break;
            }

            atual = atual.getProximo();
        }

        if (posicao == -1) {
            return null;
        } else {
            return deletarElementoIndex(posicao);
        }
    }

    public Elemento<T> deletarElementoIndex(int posicao) {
        Elemento<T> anteriorDel;
        Elemento<T> del;

        if (posicao == 0) {
            del = this.primeiro;
            this.primeiro = this.primeiro.getProximo();
            del.setProximo(null);
        } else {
            if (this.tamanho == 1) {
                del = this.primeiro;
                this.primeiro = null;
                this.ultimo = null;
            } else {
                anteriorDel = get(posicao - 1);

                if (anteriorDel == null)
                    return null;

                del = anteriorDel.getProximo();
                anteriorDel.setProximo(del.getProximo());

                if (posicao != this.tamanho - 1) {
                    del.setProximo(null);
                } else {
                    this.ultimo = anteriorDel;
                }
            }
        }

        this.tamanho--;
        return del;
    }

    public void deletarLista() {
        for (Elemento<T> atual = this.primeiro; atual.getProximo() != null; ) {
            Elemento<T> proximo = atual.getProximo();
            atual.setValor(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public String imprimirLista() {
        if (this.primeiro == null) {
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        Elemento<T> atual = this.primeiro;

        stringBuilder.append("[");

        while (atual.getProximo() != null) {
            stringBuilder.append(atual).append(", ");
            atual = atual.getProximo();
        }

        stringBuilder.append(atual);

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public int getTamanho() {
        return tamanho;
    }

    public Iterator<T> getIterator() {
        return new Iterator<>(this.primeiro);
    }
}
