package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Lateral extends Jogador {
    private int cruzamentosCerteiros;

    public Lateral(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco, int cruzamentosCerteiros) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.cruzamentosCerteiros = cruzamentosCerteiros;
    }

    @Override
    public BigDecimal calculaValorDeCompraEespecifico() {
        BigDecimal valorBase = super.calculaValorDeCompra();

        BigDecimal incrementoCruzamentos = BigDecimal.valueOf(0.02).multiply(BigDecimal.valueOf(cruzamentosCerteiros));
        BigDecimal valorComCruzamentos = valorBase.multiply(BigDecimal.ONE.add(incrementoCruzamentos));

        if (this.getIdade() > 28) {
            BigDecimal desconto = BigDecimal.valueOf(0.30);
            valorComCruzamentos = valorComCruzamentos.multiply(BigDecimal.ONE.subtract(desconto));
        }

        return valorComCruzamentos;
    }

    @Override
    public void setClubeAtual(Clube clubeInteressado) {
        super.setClubeAtual(clubeInteressado);
    }

    public int getCruzamentosCerteiros() {
        return cruzamentosCerteiros;
    }

    public void setCruzamentosCerteiros(int cruzamentosCerteiros) {
        this.cruzamentosCerteiros = cruzamentosCerteiros;
    }
}