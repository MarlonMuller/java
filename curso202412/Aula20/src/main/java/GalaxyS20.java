public class GalaxyS20 extends Celular implements ConexaoInternet, Camera{

    private final double CUSTO_ENERGETICO_NAVEGACAO = 5;
    private final double CUSTO_ENERGETICO_CAPTURA_FOTO = 3;

    private boolean wifiAtivo;
    private boolean dadosMoveisAtivo;
    private boolean cameraAtiva;

    public GalaxyS20(String nome){
        super(nome, TipoAparelho.SMARTPHONE);
    }

    @Override
    public void conectarOperadora() {
        this.conectadoOperadora = true;
    }

    @Override
    public void ativarWifi() {
        this.wifiAtivo = true;
    }

    @Override
    public void desativarWifi() {
        this.wifiAtivo = false;
    }

    @Override
    public void ativarDadosMoveis() {
        this.dadosMoveisAtivo = true;
    }

    @Override
    public void desativarDadosMoveis() {
        this.dadosMoveisAtivo = false;
    }

    @Override
    public void consumirDadosInternet() {
        super.consumirBateria(CUSTO_ENERGETICO_NAVEGACAO);
    }

    public boolean isWifiAtivo() {
        return wifiAtivo;
    }

    public boolean isDadosMoveisAtivo() {
        return dadosMoveisAtivo;
    }

    @Override
    public void ativarCamera() {
        this.cameraAtiva = true;
    }

    @Override
    public void desativarCamera() {
        this.cameraAtiva = false;
    }

    @Override
    public void capturarFotografia() {
        super.consumirBateria(CUSTO_ENERGETICO_CAPTURA_FOTO);
    }

    public boolean isCameraAtiva() {
        return this.cameraAtiva;
    }
}
