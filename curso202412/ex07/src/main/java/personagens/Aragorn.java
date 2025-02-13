package personagens;

import interfaces.SociedadeDoAnel;
import mapa.Mapa;

public class Aragorn extends Personagem implements SociedadeDoAnel {
    public Aragorn() {
        super(10, 7, 6, 60, "A day may come when the courage of men fails… but it is not THIS day.");
    }

    @Override
    public void atacar(Mapa mapa) {
        // Ataca o inimigo à frente, se houver um
        int posicaoAtual = mapa.buscarPosicao(this);
        int posicaoAlvo = posicaoAtual + 1; // movendo para a direita

        // Verifica se a posição do alvo está dentro dos limites do mapa
        if (posicaoAlvo < mapa.getPosicoes().length) {
            Personagem alvo = mapa.buscarCasa(posicaoAlvo);

            if (alvo != null && !alvo.getClass().equals(this.getClass()) && alvo.getConstituicao()  > 0 && !alvo.ehSociedade()) {
                int dano = 2 * this.getForca();
                alvo.reduzirConstituicao(dano);
                if (alvo.getConstituicao() <= 0) {
                    mapa.getPosicoes()[posicaoAlvo] = null; // Remove o inimigo derrotado
                }
            }
        }
    }

    @Override
    public void mover(Mapa mapa) {
        int posicaoAtual = mapa.buscarPosicao(this);
        if (posicaoAtual < mapa.getPosicoes().length - 1 && mapa.buscarCasa(posicaoAtual + 1) == null) {
            mapa.getPosicoes()[posicaoAtual + 1] = this;
            mapa.getPosicoes()[posicaoAtual] = null;
        }
    }


    @Override
    public boolean ehInimigo() {
        return false;
    }

    @Override
    public boolean ehSociedade() {
        return true;
    }

    public void envelhecer() {
        reduzirConstituicao(1);
    }

    @Override
    public String toString() {
        return "A";
    }
}
