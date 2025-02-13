package personagens;

import mapa.Mapa;

public class Goblim extends Personagem {
    public Goblim() {
        super(3, 6, 1, 20, "The darkness is my ally.");
    }

    @Override
    public void atacar(Mapa mapa) {
        // Ataca o inimigo mais distante (até 3 posições à frente)
        int posicaoAtual = mapa.buscarPosicao(this);

        // Garante que a posição do alvo está dentro dos limites do mapa
        for (int i = 3; i > 0; i--) {
            int posicaoAlvo = posicaoAtual - i;

            if (posicaoAlvo >= 0) {
                Personagem alvo = mapa.buscarCasa(posicaoAlvo);
                if (alvo != null && alvo.getConstituicao() > 0 && !alvo.getClass().equals(this.getClass()) && !alvo.ehInimigo()) {
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

        // Verifica se o Goblim pode se mover duas casas para a esquerda sem ultrapassar o limite
        if (posicaoAtual > 1 && mapa.buscarCasa(posicaoAtual - 2) == null && mapa.buscarCasa(posicaoAtual - 1) == null) {
            mapa.getPosicoes()[posicaoAtual - 2] = this;
            mapa.getPosicoes()[posicaoAtual] = null;
        }
        // Se não for possível mover 2 casas, tenta mover 1
        else if (posicaoAtual > 0 && mapa.buscarCasa(posicaoAtual - 1) == null) {
            mapa.getPosicoes()[posicaoAtual - 1] = this;
            mapa.getPosicoes()[posicaoAtual] = null;
        }
    }

    @Override
    public boolean ehInimigo() {
        return true;
    }

    @Override
    public boolean ehSociedade() {
        return false;
    }


    @Override
    public String toString() {
        return "M";
    }
}
