package personagens;

import interfaces.Bebivel;
import interfaces.SociedadeDoAnel;
import mapa.Mapa;

public class Gimli extends Personagem implements Bebivel, SociedadeDoAnel {
    private int quantidadeBebida = 0;
    private boolean bebado = false;

    public Gimli() {
        super(9, 2, 4, 60, "Let them come. There is one Dwarf yet in Moria who still draws breath.");
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

    @Override
    public void beber() {
        quantidadeBebida++;
        if (quantidadeBebida >= 3) {
            bebado = true;
        }
    }

    @Override
    public String falar() {
        return bebado ? "What did I say? He can't hold his liquor!" : super.falar();
    }

    @Override
    public String toString() {
        return "I";
    }
}
