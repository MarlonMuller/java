import org.junit.Assert;
import org.junit.Test;

public class CelularTest {

    @Test
    public void deveReduzirONivelDaBateriaQuandoEfetuarUmaChamada(){
        //Arrange
        Celular nokia = new Nokia6101("Nokia 5120");
        double nivelBateriaEsperado = 98;

        //Act
        nokia.chamar();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, nokia.getNilveBateria(), 0.001);
    }

    @Test
    public void deveReduzirProporcionalmenteONivelDaBateriaQuandoEfetuarMaisUmaChamada(){
        //Arrange
        Celular nokia = new GalaxyS20("Nokia 5120");
        double nivelBateriaEsperado = 96;

        //Act
        nokia.chamar();
        nokia.chamar();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, nokia.getNilveBateria(), 0.001);
    }

    @Test
    public void deveDescontarDoNivelDaBateriaOValorInformado(){
        //Arrange
        Celular nokia = new GalaxyS20("Nokia 5120");
        double nivelBateriaEsperado = 90;

        //Act
        nokia.consumirBateria(10);

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, nokia.getNilveBateria(), 0.001);
    }

    @Test(expected = NivelCriticoBateriaException.class)
    public void deveManterNivelBateriaQuandoTentarDescontarUmValorAposNivelCritico(){
        //Arrange
        Celular nokia = new GalaxyS20("Nokia 5120");
        double nivelBateriaEsperado = 10;

        //Act
        nokia.consumirBateria(90);
        nokia.consumirBateria(5);

    }

    @Test(expected = NivelCriticoBateriaException.class)
    public void deveNegarOperacaoBateriaQuandoTentarDescontarUmValorAposNivelCritico(){
        //Arrange
        Celular nokia = new GalaxyS20("Nokia 5120");

        //Act
        nokia.consumirBateria(90);
        nokia.consumirBateria(5);

    }

}
