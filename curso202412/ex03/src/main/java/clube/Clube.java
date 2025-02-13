package clube;

import java.math.BigDecimal;

public class Clube {
    private String nome;
    private int reputacaoHistorica;
    private BigDecimal disponivelEmCaixa;

    public Clube(String nome, int reputacaoHistorica, BigDecimal disponivelEmCaixa) {
        this.nome = nome;
        this.reputacaoHistorica = reputacaoHistorica;
        this.disponivelEmCaixa = disponivelEmCaixa;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public void reduzirSaldo(BigDecimal valor){
        if(valor.compareTo(disponivelEmCaixa) > 0) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.disponivelEmCaixa = this.disponivelEmCaixa.subtract(valor);
    }

    public void incrementarSaldo(BigDecimal valor) {
        this.disponivelEmCaixa = this.disponivelEmCaixa.add(valor);
    }

    public String getNome(){
        return nome;
    }

    public BigDecimal getDisponivelEmCaixa() {
        return disponivelEmCaixa;
    }

    public void setDisponivelEmCaixa(BigDecimal disponivelEmCaixa) {
        this.disponivelEmCaixa = disponivelEmCaixa;
    }


}
