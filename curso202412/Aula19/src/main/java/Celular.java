public abstract class Celular {

    private final double NIVEL_INICIAL_BATERIA = 100;
    private final double CUSTO_ENERGETICO_LIGACAO = 2;

    private String nome;
    private TipoAparelho tipoAparelho;
    protected double nivelBateria;
    protected boolean conectadoOperadora;

    public Celular(String nome, TipoAparelho tipoAparelho) {
        this.nome = nome;
        this.nivelBateria = NIVEL_INICIAL_BATERIA;
        this.tipoAparelho = tipoAparelho;
    }

    public void chamar(){
        this.nivelBateria -= CUSTO_ENERGETICO_LIGACAO;
    }

    public abstract void conectarOperadora();

    public String getNome() {
        return nome;
    }

    public double getNilveBateria() {
        return nivelBateria;
    }

    public boolean isConectadoOperadora() {
        return conectadoOperadora;
    }

    public TipoAparelho getTipoAparelho() {
        return this.tipoAparelho;
    }
}
