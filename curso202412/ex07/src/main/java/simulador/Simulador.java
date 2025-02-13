package simulador;

import excessoes.SauronDominaOMundoException;
import mapa.Mapa;
import personagens.Personagem;

import java.util.HashSet;
import java.util.Set;

public class Simulador {
    private final Mapa mapa;

    public Simulador(Mapa mapa) {
        this.mapa = mapa;
    }

    public void simular() throws SauronDominaOMundoException {
        while (true) {
            // Cria um clone das posições do mapa para usar na rodada atual
            Personagem[] personagensRodada = mapa.getPosicoes().clone();
            Set<Personagem> personagensJaAgiram = new HashSet<>();

            for (int i = 0; i < personagensRodada.length; i++) {
                Personagem personagem = personagensRodada[i];

                // Verifica se o personagem ainda está no mapa e não agiu na rodada
                if (personagem != null
                        && personagem.getConstituicao() > 0
                        && mapa.buscarCasa(mapa.buscarPosicao(personagem)) == personagem
                        && !personagensJaAgiram.contains(personagem)) {

                    // O personagem tenta realizar o ataque
                    personagem.atacar(mapa);

                    // Marca o personagem como já tendo agido
                    personagensJaAgiram.add(personagem);

                    // O personagem tenta se mover
                    personagem.mover(mapa);

                    // Verifica se a sociedade venceu
                    if (mapa.ultimaPosicaoSociedade()) {
                        System.out.println("A sociedade venceu! Todos os inimigos foram derrotados.");
                        return;
                    }

                    // Verifica se Sauron dominou o mundo
                    if (mapa.todosSociedadeDerrotados()) {
                        throw new SauronDominaOMundoException("Sauron venceu! A sociedade foi derrotada.");
                    }
                }
            }
        }
    }
}
