import org.junit.Assert;
import org.junit.Test;

public class OperadoraTest {
    @Test
    public void deveAtualizarQuantidadeAparelhosConectadosQuandoAparelhoForConectado(){
        //Arrange
        Nokia6101 nokia6101 = new Nokia6101("Nokia 6101");
        Operadora operadora = new Operadora();
        int quantidadeAparelhosEsperados = 1;

        //Act
        operadora.conectarAparelho(nokia6101);
        int quantidadeAparelhosConectados = operadora.getQuantidadeAparelhosConectados();

        //Assert
        Assert.assertEquals(quantidadeAparelhosEsperados, quantidadeAparelhosConectados);
    }

    @Test
    public void deveAtualizarQuantidadeAparelhosConectadosQuandoMaisDeUmAparelhoForConectado(){
        //Arrange
        Nokia6101 nokia6101 = new Nokia6101("Nokia 6101");
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");
        Operadora operadora = new Operadora();
        int quantidadeAparelhosEsperados = 2;

        //Act
        operadora.conectarAparelho(nokia6101);
        operadora.conectarAparelho(galaxyS20);
        int quantidadeAparelhosConectados = operadora.getQuantidadeAparelhosConectados();

        //Assert
        Assert.assertEquals(quantidadeAparelhosEsperados, quantidadeAparelhosConectados);
    }

    @Test
    public void deveAtualizarQuantidadeAparelhosConectadosQuandoTresAparelhosForConectado(){
        //Arrange
        Nokia6101 nokia6101 = new Nokia6101("Nokia 6101");
        GalaxyS20 galaxyS20 = new GalaxyS20("Galaxy S20");
        GalaxyS20 galaxyS21 = new GalaxyS20("Galaxy S21");
        Operadora operadora = new Operadora();
        int quantidadeAparelhosEsperados = 3;

        //Act
        operadora.conectarAparelho(nokia6101);
        operadora.conectarAparelho(galaxyS20);
        operadora.conectarAparelho(galaxyS21);
        int quantidadeAparelhosConectados = operadora.getQuantidadeAparelhosConectados();

        //Assert
        Assert.assertEquals(quantidadeAparelhosEsperados, quantidadeAparelhosConectados);
    }

}
