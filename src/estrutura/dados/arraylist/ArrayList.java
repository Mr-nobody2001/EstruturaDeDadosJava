package estrutura.dados.arraylist;

public class ArrayList<T> {
    private T[] elementos;
    private int tamanhoVetor; // Guarda a quantidade de elementos inseridos no vetor

    public ArrayList(int quantidadeElementosDesejada) {
        this.elementos = (T[]) new Object[quantidadeElementosDesejada];
        this.tamanhoVetor = 0;
    }

    public ArrayList() {
       this(10);
    }

    public void adicionaElemento(T elemento) {
        aumentarVetor();

        this.elementos[tamanhoVetor] = elemento;
        tamanhoVetor++;
    }

    public void adicionaElemento(int indiceElemento, T elemento) {
        if (!(indiceElemento >= 0 && indiceElemento < this.elementos.length * 2)) {
            System.out.println("Essa posição não existe no vetor");
        } else {
            boolean v;

            aumentarVetor(indiceElemento);

            v = this.elementos[indiceElemento] == null;

            if (!v) {
                int i;

                for (i = indiceElemento; i < this.elementos.length && this.elementos[i] != null; i++) ;

                if (i == this.elementos.length) {
                    for (i = indiceElemento; i >= 0 && this.elementos[i] != null; i--) ;

                    for (; i < indiceElemento; i++) {
                        this.elementos[i] = this.elementos[i + 1];
                    }
                } else {
                    for (; i > indiceElemento; i--) {
                        this.elementos[i] = this.elementos[i - 1];
                    }
                }
            }

            this.elementos[indiceElemento] = elemento;
            this.tamanhoVetor++;
        }
    }

    public void removerElemento(int indiceElemento) {
        if (!(indiceElemento >= 0 && indiceElemento < this.elementos.length)) {
            System.out.println("Essa posição não existe no vetor");
        } else {
            remover(indiceElemento);
        }
    }

    public void removerElemento(T elemento) {
        int indiceElemento = this.encontrarElemento(elemento);

        if (indiceElemento == -1) {
            System.out.println("Essa elemento não existe no vetor");
        } else {
            remover(indiceElemento);
        }
    }

    private void remover(int indiceElemento) {
        boolean v;

        v = this.elementos[indiceElemento] == null;

        if (!v) {
            if (indiceElemento == this.elementos.length - 1) {
                this.elementos[indiceElemento] = null;
            } else {
                int i;

                for (i = indiceElemento; i < this.elementos.length && this.elementos[i] != null; i++) {
                    this.elementos[i] = this.elementos[i + 1];
                }

                this.elementos[i] = null;
            }

            this.tamanhoVetor--;
        }
    }

    private void aumentarVetor() {
        if (this.tamanhoVetor == this.elementos.length) {
            T[] auxiliar = (T[]) new Object[this.elementos.length * 2];

            System.arraycopy(this.elementos, 0, auxiliar, 0, this.elementos.length);

            this.elementos = auxiliar;
        }
    }

    private void aumentarVetor(int indiceElemento) {
        if (this.elementos.length - 1 < indiceElemento) {
            T[] auxiliar = (T[]) new Object[this.elementos.length * 2];

            System.arraycopy(this.elementos, 0, auxiliar, 0, this.elementos.length);

            this.elementos = auxiliar;
        }
    }

    public T encontrarElemento(int indiceElemento) {
        if (!(indiceElemento >= 0 && indiceElemento < this.elementos.length)) {
            return null;
        } else {
            return this.elementos[indiceElemento];
        }
    }

    public int encontrarElemento(T elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null && this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public int encontrarUltimoIndice(T elemento) {
        for (int i = this.elementos.length - 1; i >= 0; i--) {
            if (this.elementos[i] != null && this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contem(T elemento) {
        return this.encontrarElemento(elemento) != -1;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }

    public void limparVetor() {
        for (T temporario : this.elementos) {
            temporario = null;
        }

        this.tamanhoVetor = 0;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();

        int cont = 0;

        sBuilder.append("[ ");

        if (this.tamanhoVetor > 0) {
            for (T temporario : this.elementos) {
                if (temporario != null) {
                    sBuilder.append(temporario);
                    cont++;

                    if (cont < this.tamanhoVetor) {
                        sBuilder.append(", ");
                    }
                }
            }
        }

        sBuilder.append(" ]");

        return sBuilder.toString();
    }
}