package estrutura.dados.trabalho.lista.vetor;


public class Lista {
    private Contato[] vetor;
    private int maxTam;
    private int ultimo;

    public Lista() {
        vetor = null;
        this.maxTam = 0;
        this.ultimo = 0;
    }

    public boolean setMaxTam(int tam) {
        if (tam < 2) {
            return false;
        }

        vetor = new Contato[tam];
        this.maxTam = tam;
        return true;
    }

    public int getMaxTam() {
        return maxTam;
    }

    public boolean insereFinal(Contato contato) {
        if (ultimo == maxTam || vetor == null) {
            return false;
        }

        this.vetor[this.ultimo] = contato;
        this.ultimo++;
        return true;
    }

    public Contato retira(Contato contato) {
        if (listaVazia()) {
            return null;
        }

        int parar, i;

        parar = this.ultimo;

        for (i = 0; i < parar; i++) {
            if (contato.getCpf() == vetor[i].getCpf()) {
                break;
            }
        }

        if (i == parar) {
            return null;
        }

        contato = vetor[i];
        parar = this.ultimo - 1;

        if (i != this.vetor.length - 1) {
            for (; i < parar; i++) {
                this.vetor[i] = this.vetor[i + 1];
            }
        }

        this.ultimo--;
        return contato;
    }

    public Contato pesquisa(Contato contato) {
        if (listaVazia()) {
            return null;
        }

        int parar = this.ultimo;

        for (int i = 0; i < parar; i++) {
            if (contato.getCpf() == vetor[i].getCpf()) {
                return vetor[i];
            }
        }

        return null;
    }

    public String[] getLista() {
        String[] retorno = new String[this.ultimo];

        for (int i = 0; i < this.ultimo; i++) {
            retorno[i] = this.vetor[i].getContato();
        }

        return retorno;
    }

    public boolean listaVazia() {
        return this.ultimo == 0;
    }

    public boolean listaCheia() {
        return this.ultimo == this.maxTam;
    }
}
