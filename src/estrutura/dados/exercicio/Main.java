package estrutura.dados.exercicio;

public class Main {
    public static void main(String[] args) {
        Item[] itens = new Item[5];

        String nome = "Item ";

        for (int i = 0; i < itens.length; i++) {
            nome += Integer.toString(i + 1);
            itens[i] = new Item(nome, i, i);
            nome = "Item ";
        }

        for (Item temp : itens) {
            System.out.println(temp);
        }
    }
}
