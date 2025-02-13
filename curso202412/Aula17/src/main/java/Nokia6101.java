public class Nokia6101 extends Celular implements Camera{

    private final double CUSTO_ENERGETICO_CAPTURA_FOTO = 1;
    private boolean cameraAtiva;

    public Nokia6101(String nome){
        super(nome);
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
        this.nivelBateria -= CUSTO_ENERGETICO_CAPTURA_FOTO;
    }

    public boolean isCameraAtiva() {
        return cameraAtiva;
    }
}
