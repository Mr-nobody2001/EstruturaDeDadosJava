package estrutura.dados.lista;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
    }
}
