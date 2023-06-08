package estrutura.dados.trabalho.fila;

public class Fila {
    private Cliente[] vetor;
    private int maxTam;
    private int fim;

    public Fila() {
        vetor = null;
        this.maxTam = 0;
        this.fim = 0;

    }

    public boolean setMaxTam(int tam) {
        if (tam < 2) {
            return false;
        }

        vetor = new Cliente[tam];
        this.maxTam = tam;
        return true;
    }

    public int getMaxTam() {
        return maxTam;
    }

    protected boolean enfileirar(Cliente cliente) {
        if (fim == maxTam || vetor == null) {
            return false;
        }

        this.vetor[this.fim] = cliente;
        this.fim++;
        return true;
    }

    public Cliente desenfileirar() {
        Cliente retorno;

        if (this.filaVazia() || this.filaCheia()) {
            return null;
        }

        retorno = vetor[0];

        int parar = this.fim;

        if (this.fim == this.vetor.length) {
            parar = this.fim - 1;
        }

        for (int i = 0; i < parar; i++) {
            this.vetor[i] = this.vetor[i + 1];
        }

        this.fim--;
        return retorno;
    }

    public boolean filaVazia() {
        return this.fim == 0;
    }

    public boolean filaCheia() {
        return this.fim == this.maxTam;
    }
}

