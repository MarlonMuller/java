import org.junit.Assert;
import org.junit.Test;

public class GalaxyS20Test {
    @Test
    public void deveAtivarWifiQuandoAcionada(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.ativarWifi();

        //Assert
        Assert.assertTrue(galaxyS20.isWifiAtivo());
    }

    @Test
    public void deveDesativarWifiQuandoEncerrado(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.desativarWifi();

        //Assert
        Assert.assertFalse(galaxyS20.isWifiAtivo());
    }

    @Test
    public void deveAtivarDadosMoveisQuandoAcionada(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.ativarDadosMoveis();

        //Assert
        Assert.assertTrue(galaxyS20.isDadosMoveisAtivo());
    }

    @Test
    public void deveDesativarDadosMoveisQuandoEncerrado(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.desativarDadosMoveis();

        //Assert
        Assert.assertFalse(galaxyS20.isWifiAtivo());
    }

    @Test
    public void deveAtualizarNivelBateriaQuandoConsumirDados(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");
        double nivelBateriaEsperado = 95;

        //Act
        galaxyS20.consumirDadosInternet();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, galaxyS20.getNilveBateria(), 0.001);
    }

    @Test
    public void deveAtualizarProporcionalmenteNivelBateriaQuandoConsumirDaosDeUmaVez(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");
        double nivelBateriaEsperado = 90;
        //Act
        galaxyS20.consumirDadosInternet();
        galaxyS20.consumirDadosInternet();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, galaxyS20.getNilveBateria(), 0.001);
    }


    @Test
    public void deveAtivarCameraQuandoAcionada(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.ativarCamera();

        //Assert
        Assert.assertTrue(galaxyS20.isCameraAtiva());
    }
    @Test
    public void deveDesativarCameraQuandoEncerrada(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.desativarCamera();

        //Assert
        Assert.assertFalse(galaxyS20.isCameraAtiva());
    }
    @Test
    public void deveAtualizarNivelBateriaQuandoCapturarUmaFoto(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");
        double nivelBateriaEsperado = 97;

        //Act
        galaxyS20.capturarFotografia();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, galaxyS20.getNilveBateria(), 0.001);
    }
    @Test
    public void deveAtualizarProporcionalmenteNivelBateriaQuandoCapturarMaisDeUmaFoto(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");
        double nivelBateriaEsperado = 94;

        //Act
        galaxyS20.capturarFotografia();
        galaxyS20.capturarFotografia();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, galaxyS20.getNilveBateria(), 0.001);
    }

    @Test
    public void deveConectarNaOperadoraQuandoAcionado(){
        //Arrange
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");

        //Act
        galaxyS20.conectarOperadora();

        //Assert
        Assert.assertTrue(galaxyS20.isConectadoOperadora());
    }

}
