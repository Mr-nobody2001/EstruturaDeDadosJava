package estrutura.dados.arvore.binaria;

public class ArvoreBinariaTeste {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();

        arvoreBinaria.adicionarElemento(50);
        arvoreBinaria.adicionarElemento(17);
        arvoreBinaria.adicionarElemento(72);
        arvoreBinaria.adicionarElemento(12);
        arvoreBinaria.adicionarElemento(23);
        arvoreBinaria.adicionarElemento(54);
        arvoreBinaria.adicionarElemento(76);
        arvoreBinaria.adicionarElemento(67);
        arvoreBinaria.adicionarElemento(19);
        arvoreBinaria.adicionarElemento(9);
        arvoreBinaria.adicionarElemento(14);

        System.out.println(arvoreBinaria.imprimirEmOrdem());

        System.out.println(arvoreBinaria.buscarElemento(9));

        arvoreBinaria.removerElemento(9);

        System.out.println(arvoreBinaria.imprimirEmOrdem());

        System.out.println(arvoreBinaria.buscarElemento(9));

        arvoreBinaria.deletarArvore();

        System.out.println(arvoreBinaria.imprimirEmOrdem());
    }
}
