package personagens;

import mapa.Mapa;

public class Urukhai extends Personagem {
    public Urukhai() {
        super(8, 6, 3, 45, "We are the fighting Uruk-hai!");
    }

    @Override
    public void atacar(Mapa mapa) {
        // Ataca o inimigo à frente, se houver um
        int posicaoAtual = mapa.buscarPosicao(this);
        int posicaoAlvo = posicaoAtual - 1; // movendo para a esquerda

        // Verifica se a posição do alvo está dentro dos limites do mapa
        if (posicaoAlvo >= 0) {
            Personagem alvo = mapa.buscarCasa(posicaoAlvo);

            if (alvo != null && !alvo.getClass().equals(this.getClass()) && alvo.getConstituicao() > 0 && !alvo.ehInimigo()) {
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

        // Verifica se o Orc pode se mover para a posição à esquerda sem ultrapassar o limite
        if (posicaoAtual > 0 && mapa.buscarCasa(posicaoAtual - 1) == null) {
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
        return "U";
    }
}
