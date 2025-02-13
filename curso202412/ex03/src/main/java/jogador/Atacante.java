package jogador;

import clube.Clube;
import apetiteFinanceiro.ApetiteFinanceiro;

import java.math.BigDecimal;

public class Atacante extends Jogador {
    private int qtdGols;

    public Atacante(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco, int qtdGols) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.qtdGols = qtdGols;
    }

    @Override
    public BigDecimal calculaValorDeCompraEespecifico() {
        BigDecimal valorBase = super.calculaValorDeCompra();  // Valor base com base no preço e apetite financeiro

        // Acréscimo de 1% para cada gol
        BigDecimal incrementoGols = BigDecimal.valueOf(0.01).multiply(BigDecimal.valueOf(qtdGols));
        BigDecimal valorComGols = valorBase.multiply(BigDecimal.ONE.add(incrementoGols));

        // Desconto de 25% se a idade do atacante for maior que 30 anos
        if (this.getIdade() > 30) {
            BigDecimal desconto = BigDecimal.valueOf(0.25);
            valorComGols = valorComGols.multiply(BigDecimal.ONE.subtract(desconto));
        }

        return valorComGols;
    }

    @Override
    public void setClubeAtual(Clube clubeInteressado) {
        super.setClubeAtual(clubeInteressado);
    }

    public int getQtdGols() {
        return qtdGols;
    }

    @Override
    public boolean possuiInteresse(Clube clube) {
        return clube.getReputacaoHistorica() > this.getReputacaoHistorica();
    }
}
