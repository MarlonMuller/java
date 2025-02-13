package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class MeioCampo extends Jogador {

    public MeioCampo(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
    }

    @Override
    public BigDecimal calculaValorDeCompraEespecifico() {
        BigDecimal valorBase = super.calculaValorDeCompra();

        if (this.getIdade() > 30) {
            BigDecimal desconto = BigDecimal.valueOf(0.30);
            valorBase = valorBase.multiply(BigDecimal.ONE.subtract(desconto));
        }

        return valorBase;
    }

    @Override
    public void setClubeAtual(Clube clubeInteressado) {
        super.setClubeAtual(clubeInteressado);
    }

    @Override
    public boolean possuiInteresse(Clube clube) {

        return clube.getReputacaoHistorica() <= this.getReputacaoHistorica() - 2;
    }
}

