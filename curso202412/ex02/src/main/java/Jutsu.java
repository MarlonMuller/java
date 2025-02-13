public class Jutsu {

    private int qtdChakra;
    private int dano;

    public Jutsu(int qtdChakra, int dano){
        this.qtdChakra = Math.min(qtdChakra, 5);
        this.dano = Math.min(dano, 10);
    }

    public int getDano(){
        return dano;
    }

    public int getQtdChakra() {
        return qtdChakra;
    }
}
