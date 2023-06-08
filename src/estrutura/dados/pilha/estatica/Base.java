package estrutura.dados.pilha.estatica;

public class Base {
    public static void main(String[] args) {
        Pilha<Contato> pilha = new Pilha<>();
        Contato[] contatos = new Contato[10];

        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Contato();
            pilha.empilharElemento(contatos[i]);
        }

        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilharElemento());
        }
    }
}
