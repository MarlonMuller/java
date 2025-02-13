import org.junit.Assert;
import org.junit.Test;

public class Nokia6101Test {

    @Test
    public void deveAtivarCameraQuandoAcionada(){
        //Arrange
        Nokia6101 nokia = new Nokia6101("Nokia 6101");

        //Act
        nokia.ativarCamera();

        //Assert
        Assert.assertTrue(nokia.isCameraAtiva());
    }
    @Test
    public void deveDesativarCameraQuandoEncerrada(){
        //Arrange
        Nokia6101 nokia = new Nokia6101("Nokia 6101");

        //Act
        nokia.desativarCamera();

        //Assert
        Assert.assertFalse(nokia.isCameraAtiva());
    }
    @Test
    public void deveAtualizarNivelBateriaQuandoCapturarUmaFoto(){
        //Arrange
        Nokia6101 nokia = new Nokia6101("Nokia 6101");
        double nivelDeBateriaEsperado = 99;

        //Act
        nokia.capturarFotografia();

        //Assert
        Assert.assertEquals(nivelDeBateriaEsperado, nokia.getNilveBateria(), 0.001);
    }
    @Test
    public void deveAtualizarProporcionalmenteNivelBateriaQuandoCapturarMaisDeUmaFoto(){
        //Arrange
        Nokia6101 nokia6101 = new Nokia6101("Nokia 6101");
        double nivelDeBateriaEsperado = 98;

        //Act
        nokia6101.capturarFotografia();
        nokia6101.capturarFotografia();

        //Assert
        Assert.assertEquals(nivelDeBateriaEsperado, nokia6101.getNilveBateria(), 0.001);
    }

    @Test
    public void deveConectarNaOperadoraQuandoAcionado(){
        //Arrange
        Nokia6101 nokia6101 = new Nokia6101("Nokia 6101");

        //Act
        nokia6101.conectarOperadora();

        //Assert
        Assert.assertTrue(nokia6101.isConectadoOperadora());
    }
}
