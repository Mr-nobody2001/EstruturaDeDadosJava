package estrutura.dados.lista;

public class Iterator<T> {
    private Elemento<T> elemento;
    private boolean primeiroElemento;

    public Iterator(Elemento<T> elemento) {
        this.elemento = elemento;
        primeiroElemento = true;
    }

    public boolean temProximo() {
        return this.elemento.getProximo() != null;
    }

    public Elemento<T> getProximo() {
        if (this.primeiroElemento) {
            this.primeiroElemento = false;
            return this.elemento;
        }

        this.elemento = this.elemento.getProximo();
        return this.elemento;
    }
}
