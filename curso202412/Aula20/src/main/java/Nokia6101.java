public class Nokia6101 extends Celular implements Camera{

    private final double CUSTO_ENERGETICO_CAPTURA_FOTO = 1;
    private static final int TIPO_APARELHO = 1;

    private boolean cameraAtiva;

    public Nokia6101(String nome){
        super(nome, TipoAparelho.COMUM);
    }

    @Override
    public void conectarOperadora() {
        this.conectadoOperadora = true;
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
//        try {
            super.consumirBateria(CUSTO_ENERGETICO_CAPTURA_FOTO);
            System.out.println("Mensagem na tela: foto capturada com sucesso");
//        } catch (NivelCriticoBateriaException erro){
//            System.out.println("Mensagem na tela: Não é possível tirar foto porque o nível da bateria está baixo");
//       }

    }

    public boolean isCameraAtiva() {
        return cameraAtiva;
    }
}
