package personagens;

import interfaces.Ressucitavel;
import interfaces.SociedadeDoAnel;
import mapa.Mapa;

public class Gandalf extends Personagem implements Ressucitavel, SociedadeDoAnel {
    public Gandalf() {
        super(2, 3, 10, 80, "A Wizard is never late, nor is he early. He arrives precisely when he means to.");
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

        // Se o mapa está vazio, o mago avança uma posição para a direita
        if (vazio) {
            int posicaoAtual = mapa.buscarPosicao(this);
            if (posicaoAtual < mapa.getPosicoes().length - 1 && mapa.buscarCasa(posicaoAtual + 1) == null) {
                mapa.getPosicoes()[posicaoAtual + 1] = this; // Move para a próxima posição
                mapa.getPosicoes()[posicaoAtual] = null; // Limpa a posição anterior
            }
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
    public Personagem ressuscitar() {
        return constituicao == 0 ? new Gandalf() : null;
    }

    @Override
    public String toString() {
        return "G";
    }
}
