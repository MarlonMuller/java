package negociacao;

import clube.Clube;
import jogador.Jogador;

import java.math.BigDecimal;

public class Negociacao {

    public boolean negociar(Clube clubeInteresado, Jogador jogadorDeInteresse) {
        if (jogadorDeInteresse.possuiInteresse(clubeInteresado)) {
            BigDecimal valorDeCompra = jogadorDeInteresse.calculaValorDeCompra();

            if (clubeInteresado.getDisponivelEmCaixa().compareTo(valorDeCompra) >= 0) {
                clubeInteresado.reduzirSaldo(valorDeCompra);
                jogadorDeInteresse.setClubeAtual(clubeInteresado);
                return true;
            }
        }
        return false;
    }
}
