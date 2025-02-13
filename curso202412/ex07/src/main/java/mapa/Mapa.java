package mapa;

import excessoes.PersonagemJaEstaNoMapaException;
import excessoes.PersonagemNaoEncontradoNoMapaException;
import excessoes.PosicaoOcupadaException;
import personagens.Personagem;

public class Mapa {
    private final Personagem[] posicoes = new Personagem[10];

    public String exibir() {
        StringBuilder sb = new StringBuilder("|");
        for (int i = 0; i < posicoes.length; i++) {
            Personagem p = posicoes[i];
            sb.append(p == null || p.getConstituicao() <= 0 ? " " : p.toString());  // Adiciona o caractere ou espaço
            if (i < posicoes.length - 1) {  // Não adiciona o separador | após o último elemento
                sb.append("|");
            }
        }
        sb.append("|");  // Adiciona a barra final
        return sb.toString();
    }




    public void inserir(int posicao, Personagem personagem) throws PosicaoOcupadaException, PersonagemJaEstaNoMapaException {
        if (posicoes[posicao] != null) {
            throw new PosicaoOcupadaException("Posição ocupada.");
        }
        for (Personagem p : posicoes) {
            if (p == personagem) {
                throw new PersonagemJaEstaNoMapaException("Personagem ja está no mapa.");
            }
        }
        posicoes[posicao] = personagem;
    }

    public int buscarPosicao(Personagem personagem) throws PersonagemNaoEncontradoNoMapaException {
        for (int i = 0; i < posicoes.length; i++) {
            if (posicoes[i] == personagem) {
                return i;
            }
        }
        throw new PersonagemNaoEncontradoNoMapaException("Personagem não encontrado.");
    }

    public Personagem buscarCasa(int posicao) {
        if (posicao < 0 || posicao >= posicoes.length) {
            throw new IndexOutOfBoundsException("Índice fora dos limites: " + posicao);
        }
        return posicoes[posicao];
    }

    public Personagem[] getPosicoes() {
        return posicoes;
    }

    public boolean todosInimigosDerrotados() {
        for (Personagem p : posicoes) {
            if (p != null && p.ehInimigo() && p.getConstituicao() > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean ultimaPosicaoSociedade() {
        // Verifica se a última posição do mapa não é nula e contém um personagem da sociedade
        Personagem ultimoPersonagem = posicoes[posicoes.length - 1];
        return ultimoPersonagem != null && ultimoPersonagem.ehSociedade() && ultimoPersonagem.getConstituicao() > 0;
    }

    public boolean todosSociedadeDerrotados() {
        for (Personagem p : posicoes) {
            if (p != null && p.ehSociedade() && p.getConstituicao() > 0) {
                return false;
            }
        }
        return true;
    }

}