package estrutura.dados.fila;

public class Documentos {
    private String nome;
    private int quantidadeFolhas;

    public Documentos() {
    }

    public Documentos(String nome, int quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public void setQuantidadeFolhas(int quantidadeFolhas) {
        this.quantidadeFolhas = quantidadeFolhas;
    }

    @Override
    public String toString() {
        return "Documentos: " + "\n" +
                "Nome = " + nome + "\n" +
                "Quantidade de Folhas = " + quantidadeFolhas;
    }
}
