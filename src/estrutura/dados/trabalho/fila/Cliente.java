package estrutura.dados.trabalho.fila;

public class Cliente {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean setIdade(int idade) {
        if (idade < 0) {
            return false;
        }

        this.idade = idade;
        return true;
    }

    public String getCliente() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
