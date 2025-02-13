public abstract class Celular {

    private final double NIVEL_INICIAL_BATERIA = 100;
    private final double CUSTO_ENERGETICO_LIGACAO = 2;
    private final double NIVEL_CRITICO_BATERIA = 10;

    private String nome;
    private TipoAparelho tipoAparelho;
    private double nivelBateria;
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

    protected void consumirBateria(double percentualASerDescontado){
        if(this.nivelBateria <= NIVEL_CRITICO_BATERIA){
            throw new NivelCriticoBateriaException();
        }
        this.nivelBateria -= percentualASerDescontado;
    }
}
