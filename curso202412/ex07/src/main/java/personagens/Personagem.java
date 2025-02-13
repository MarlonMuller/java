package personagens;

import mapa.Mapa;

public abstract class Personagem {
    protected int forca;
    protected int agilidade;
    protected int inteligencia;
    protected int constituicao;
    protected final int constituicaoInicial;
    protected final String fala;

    public Personagem(int forca, int agilidade, int inteligencia, int constituicao, String fala) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
        this.constituicaoInicial = constituicao;
        this.fala = fala;
    }

    public String falar() {
        return fala;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void reduzirConstituicao(int dano) {
        if (constituicao > 0) {
            constituicao = Math.max(0, constituicao - dano);
        }
    }

    public int getForca() {
        return forca;
    }

    public int getAgilidade() {
        return agilidade;
    }


    @Override
    public abstract String toString();

    public abstract void atacar(Mapa mapa);

    public abstract void mover(Mapa mapa);

    protected int getInteligencia() {
        return inteligencia;
    }

    // Método abstrato para definir se o personagem é um inimigo
    public abstract boolean ehInimigo();

    // Método abstrato para membros da sociedade
    public abstract boolean ehSociedade();
}

