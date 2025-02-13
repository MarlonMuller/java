import apetiteFinanceiro.Conservador;
import apetiteFinanceiro.Indiferente;
import clube.Clube;
import jogador.Atacante;
import jogador.Goleiro;
import jogador.MeioCampo;
import negociacao.Negociacao;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class NegociacaoTest {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, BigDecimal.valueOf(100000000));
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, new Indiferente(), BigDecimal.valueOf(800500), 12);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, BigDecimal.valueOf(100000000));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, new Conservador(), BigDecimal.valueOf(800500), 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Flamengo", 8, BigDecimal.valueOf(1000000));
        Goleiro goleiro = new Goleiro("Diego Alves", 37, null, 9, new Indiferente(), BigDecimal.valueOf(5000000), 8); // Goleiro com preço maior que o caixa disponível

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos() {
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("São Paulo", 7, BigDecimal.valueOf(50000000));
        MeioCampo meioCampo = new MeioCampo("Fernandinho", 28, null, 8, new Indiferente(), BigDecimal.valueOf(7000000));

        BigDecimal precoCalculado = meioCampo.calculaValorDeCompraEespecifico().setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal precoEsperado = BigDecimal.valueOf(7000000).setScale(2, BigDecimal.ROUND_HALF_UP);

        Assert.assertEquals(precoEsperado, precoCalculado);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos() {
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Palmeiras", 9, BigDecimal.valueOf(60000000));
        MeioCampo meioCampo = new MeioCampo("Gustavo Scarpa", 31, null, 9, new Indiferente(), BigDecimal.valueOf(6000000));

        BigDecimal precoCalculado = meioCampo.calculaValorDeCompraEespecifico().setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal precoEsperado = BigDecimal.valueOf(6000000).multiply(BigDecimal.valueOf(0.7)).setScale(2, BigDecimal.ROUND_HALF_UP);

        Assert.assertEquals(precoEsperado, precoCalculado);
    }
}
