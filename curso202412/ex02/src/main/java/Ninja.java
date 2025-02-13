public class Ninja {
    private String nome;
    private int chakra = 100;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu){
        this.nome = nome;
        this.jutsu = jutsu;
    }

    public void atacar(Ninja oponente){
        oponente.receberGolpe(jutsu.getDano());
        chakra = chakra - jutsu.getQtdChakra();
    }

    public void receberGolpe(int danoRecebido){
        chakra = chakra - danoRecebido;
    }

    public int getChakra(){
        return chakra;
    }

    public String getNome(){
        return nome;
    }
}
