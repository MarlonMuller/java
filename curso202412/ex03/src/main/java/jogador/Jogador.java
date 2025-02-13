package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public abstract class Jogador {
    private String nome;
    private int idade;
    private Clube clubeAtual;
    private int reputacaoHistorica;
    private ApetiteFinanceiro apetiteFinanceiro;
    private BigDecimal preco;

    public Jogador(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetiteFinanceiro, BigDecimal preco) {
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        this.reputacaoHistorica = Math.max(0, Math.min(10,reputacaoHistorica));
        this.apetiteFinanceiro = apetiteFinanceiro;
        this.preco = preco;
    }

    public String getClubeAtual(){
        return clubeAtual == null ? "Sem Clube" : clubeAtual.getNome();
    }

    public void setReputacaoHistorica(int reputacao){
        if(reputacao >= 0 && reputacao <= 10){
            this.reputacaoHistorica = reputacao;
        }
    }

    public BigDecimal calculaValorDeCompra(){
        return preco.multiply(apetiteFinanceiro.calcularMultiplicador());
    }

    public boolean possuiInteresse(Clube clube){
        return clube.getReputacaoHistorica() >= 1;
    }

    public abstract BigDecimal calculaValorDeCompraEespecifico();


    public void setClubeAtual(Clube clubeInteresado) {
        this.clubeAtual = clubeInteresado;
    }

    public int getIdade() {
        return idade;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }
}
