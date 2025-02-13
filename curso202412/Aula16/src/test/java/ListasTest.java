import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListasTest {
    @Test
    public void criarLista() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Marlon");
        nomes.add("Iury");
        System.out.println(nomes.size());
    }

    @Test
    public void imprimirLista() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Marlon");
        nomes.add("Iury");
        nomes.add(1, "Maria");
        System.out.println("Tamanho lista: " + nomes.size());

        System.out.println("Imprimindo manualmente: ");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));

        System.out.println("Imprimindo com for: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("Imprimindo via for each");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    @Test
    public void excluirElementoLista() {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Marlon");
        nomes.add("Iury");
        nomes.add(1, "Maria");
        System.out.println("Tamanho lista: " + nomes.size());


        System.out.println("Imprimindo antes da exclusão: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(1);

        System.out.println("Imprimindo depois da exclusão: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.clear();

        System.out.println("Imprimindo depois de limpar a lista: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}