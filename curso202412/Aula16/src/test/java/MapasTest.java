import org.junit.Assert;
import org.junit.Test;


import java.util.Map;
import java.util.HashMap;

public class MapasTest {
    @Test
    public void criandoMapa(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
    }

    @Test
    public void adicionandoElementoNoMapa(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        System.out.println("Tamanho do mapa: " + jogadores.size());
    }

    @Test
    public void buscandoElementoNoMapa(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        System.out.println("Tamanho do mapa: " + jogadores.size());
        System.out.println(jogadores.get(10));

        Integer numeroCamisa = 10;
        String nomeEsperado = "Dalessandro";
        String nomeCorrespondente = jogadores.get(numeroCamisa);

        Assert.assertEquals(nomeEsperado, nomeCorrespondente);
    }

    @Test
    public void buscandoElementoNaoExistenteNoMapa(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        System.out.println("Tamanho do mapa: " + jogadores.size());
        System.out.println(jogadores.get(10));

        Integer numeroCamisa = 11;
        String nomeCorrespondente = jogadores.get(numeroCamisa);

        Assert.assertNull(nomeCorrespondente);
    }

    @Test
    public void excluindoElementoNoMapa(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        System.out.println("Tamanho do mapa: " + jogadores.size());

        Integer numeroCamisaAExcluir = 10;
        jogadores.remove(numeroCamisaAExcluir);

        System.out.println("Tamanho do mapa: " + jogadores.size());
    }

    @Test
    public void iterandoUmMapa(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        System.out.println("Tamanho do mapa: " + jogadores.size());
        for(Integer chave : jogadores.keySet()){
            System.out.println("Chave/Camisa: " + chave + " | Nome: " + jogadores.get(chave));
        }
    }

    @Test
    public void exemploContainsKeyEncontrandoChavePesquisada(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        jogadores.put(9, "Nico Lopez");

        boolean contemJogadorPesquisado = jogadores.containsKey(10);

        Assert.assertTrue(contemJogadorPesquisado);
    }

    @Test
    public void exemploContainsKeyNaoEncontrandoChavePesquisada(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        jogadores.put(9, "Nico Lopez");

        boolean contemJogadorPesquisado = jogadores.containsKey(11);

        Assert.assertFalse(contemJogadorPesquisado);
    }

    @Test
    public void exemploContainsValueEncontrandoValorCorrespondente(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        jogadores.put(9, "Nico Lopez");

        boolean contemJogadorPesquisado = jogadores.containsValue("Dalessandro");

        Assert.assertTrue(contemJogadorPesquisado);
    }

    @Test
    public void exemploContainsValueNaoEncontrandoValorCorrespondente(){
        Map<Integer, String> jogadores = new HashMap<Integer, String>();
        jogadores.put(10, "Dalessandro");
        jogadores.put(1, "Tafarel");
        jogadores.put(9, "Nico Lopez");

        boolean contemJogadorPesquisado = jogadores.containsValue("Dale");

        Assert.assertFalse(contemJogadorPesquisado);
    }
}
