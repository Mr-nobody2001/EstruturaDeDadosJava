package estrutura.dados.estrutura;

public abstract class EstruturaGenerica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaGenerica(int quantidadeElementosDesejada) {
        this.elementos = (T[]) new Object[quantidadeElementosDesejada];
        this.tamanho = 0;
    }

    public EstruturaGenerica() {
        this(10);
    }

    protected void adicionaElemento(T elemento) {
        this.aumentaCapacidade();

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    protected void adicionaElemento(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            System.out.println("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    protected void romoveElemento(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            System.out.println("Posição inválida");
            return;
        } else {
            if (this.elementos.length == 1) {
                this.tamanho--;
                return;
            }
        }

        int parar = this.tamanho;

        if (this.tamanho == this.elementos.length) {
            parar = this.tamanho - 1;
        }

        for (int i = posicao; i < parar; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);

            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
