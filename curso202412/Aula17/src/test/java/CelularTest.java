import org.junit.Assert;
import org.junit.Test;

public class CelularTest {

    @Test
    public void deveReduzirONivelDaBateriaQuandoEfetuarUmaChamada(){
        //Arrange
        Celular nokia = new Celular("Nokia 5120");
        double nivelBateriaEsperado = 98;

        //Act
        nokia.chamar();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, nokia.getNilveBateria(), 0.001);
    }

    @Test
    public void deveReduzirProporcionalmenteONivelDaBateriaQuandoEfetuarMaisUmaChamada(){
        //Arrange
        Celular nokia = new Celular("Nokia 5120");
        double nivelBateriaEsperado = 96;

        //Act
        nokia.chamar();
        nokia.chamar();

        //Assert
        Assert.assertEquals(nivelBateriaEsperado, nokia.getNilveBateria(), 0.001);
    }
}
