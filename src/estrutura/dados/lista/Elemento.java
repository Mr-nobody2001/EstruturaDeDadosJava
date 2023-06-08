package estrutura.dados.lista;

public class Elemento<T> {
    private T valor;
    private Elemento<T> proximo;

    public Elemento(T elemento) {
        this.valor = elemento;
        this.proximo = null;
    }

    public Elemento(T elemento, Elemento<T> proximo) {
        this.valor = elemento;
        this.proximo = proximo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Elemento<T> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }
}
