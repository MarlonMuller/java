package personagens;

import interfaces.FalaElfica;
import interfaces.SociedadeDoAnel;
import mapa.Mapa;

public class Legolas extends Personagem implements FalaElfica, SociedadeDoAnel {
    public Legolas() {
        super(5, 10, 6, 80, "They're taking the Hobbits to Isengard!");
    }

    @Override
    public void atacar(Mapa mapa) {
        // Ataca o inimigo mais distante (até 3 posições à frente)
        int posicaoAtual = mapa.buscarPosicao(this);

        // Garante que a posição do alvo está dentro dos limites do mapa
        for (int i = 3; i > 0; i--) {
            int posicaoAlvo = posicaoAtual + i;

            // Verifica se a posição do alvo está dentro dos limites do mapa
            if (posicaoAlvo < mapa.getPosicoes().length) {
                Personagem alvo = mapa.buscarCasa(posicaoAlvo);
                if (alvo != null && alvo.getConstituicao() > 0 && !alvo.getClass().equals(this.getClass()) && !alvo.ehSociedade()) {
                    int dano = i * this.getAgilidade();
                    alvo.reduzirConstituicao(dano);
                    if (alvo.getConstituicao() <= 0) {
                        mapa.getPosicoes()[posicaoAlvo] = null; // Remove o inimigo derrotado
                    }
                    break;  // Ataque realizado, não tenta atacar mais perto
                }
            }
        }
    }

    @Override
    public void mover(Mapa mapa) {
        int posicaoAtual = mapa.buscarPosicao(this);

        // Verifica se as duas posições à frente estão livres
        if (posicaoAtual < mapa.getPosicoes().length - 2
                && mapa.buscarCasa(posicaoAtual + 1) == null
                && mapa.buscarCasa(posicaoAtual + 2) == null) {
            mapa.getPosicoes()[posicaoAtual + 2] = this;
            mapa.getPosicoes()[posicaoAtual] = null;
        }
        // Verifica se a posição imediatamente à frente está livre
        else if (posicaoAtual < mapa.getPosicoes().length - 1
                && mapa.buscarCasa(posicaoAtual + 1) == null) {
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


    @Override
    public String falarElfico() {
        return "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
    }

    @Override
    public String toString() {
        return "L";
    }
}
