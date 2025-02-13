package personagens;

import mapa.Mapa;

public class Saruman extends Personagem {
    public Saruman() {
        super(2, 2, 9, 70, "Against the power of Mordor there can be no victory.");
    }

    @Override
    public void atacar(Mapa mapa) {
        // Gandalf ataca todos os inimigos
        int posicaoAtual = mapa.buscarPosicao(this);
        for (int i = 0; i < 10; i++) {
            Personagem alvo = mapa.buscarCasa(i);
            if (alvo != null && alvo.getConstituicao() > 0 && !alvo.getClass().equals(this.getClass())) {
                int dano = this.getInteligencia();
                alvo.reduzirConstituicao(dano);
                if (alvo.getConstituicao() <= 0) {
                    mapa.getPosicoes()[i] = null; // Remove o inimigo derrotado
                }
            }
        }
    }

    @Override
    public void mover(Mapa mapa) {
        // Verifica se o mapa está vazio (exceto o próprio mago)
        boolean vazio = true;
        for (Personagem personagem : mapa.getPosicoes()) {
            if (personagem != null && personagem != this) {
                vazio = false;
                break;
            }
        }

        // Se o mapa está vazio, o mago avança uma posição para a esquerda
        if (vazio) {
            int posicaoAtual = mapa.buscarPosicao(this);
            if (posicaoAtual > 0 && mapa.buscarCasa(posicaoAtual - 1) == null) {
                mapa.getPosicoes()[posicaoAtual - 1] = this; // Move para a posição anterior
                mapa.getPosicoes()[posicaoAtual] = null; // Limpa a posição anterior
            }
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
        return "S";
    }
}
