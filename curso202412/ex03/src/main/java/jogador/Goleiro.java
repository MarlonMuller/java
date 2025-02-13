package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Goleiro extends Jogador{
    private int penaltisDefendidos;

    public Goleiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco, int penaltisDefendidos) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.penaltisDefendidos = penaltisDefendidos;
    }

    @Override
    public BigDecimal calculaValorDeCompraEespecifico() {
        BigDecimal valorBase = super.calculaValorDeCompra();
        BigDecimal incrementoPenaltis = BigDecimal.valueOf(0.04).multiply(BigDecimal.valueOf(penaltisDefendidos));
        return valorBase.multiply(BigDecimal.ONE.add(incrementoPenaltis));
    }

    @Override
    public void setClubeAtual(Clube clubeInteressado) {
        super.setClubeAtual(clubeInteressado);
    }

    public int getPenaltisDefendidos() {
        return penaltisDefendidos;
    }
}
