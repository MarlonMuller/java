import org.example.nave.Nave;
import org.example.planeta.Planeta;
import org.example.recurso.Recurso;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class NaveTest {


    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta() {
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(9);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }

    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso() {
        //Arrange
        int valorTotalEsperado = 0;
        Planeta jupter = new Planeta(5, new ArrayList<>());

        //Act
        int valorTotalResultante = jupter.getValorTotal();

        //Assert
        Assert.assertEquals(valorTotalEsperado, valorTotalResultante);
    }

    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta() {
        //Arrange
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 190, 6));
        recursos.add(new Recurso("Ouro", 110, 3));
        Planeta terra = new Planeta(2, recursos);

        int valorTotalEsperado = 300;

        //Act
        int valorTotalResultante = terra.getValorTotal();

        //Assert
        Assert.assertEquals(valorTotalEsperado, valorTotalResultante);
    }

    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso() {
        //Arrange
        Planeta saturno = new Planeta(3, new ArrayList<>());
        double valorPorPesoEsperado = 0;

        //Act
        double valorPorPesoResultante = saturno.getValorPorPeso();

        //Assert
        Assert.assertEquals(valorPorPesoEsperado, valorPorPesoResultante, 0);
    }

    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta(){
        //Arrange
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 110, 7));
        recursos.add(new Recurso("Ferro", 250, 8));
        Planeta saturno = new Planeta(3, recursos);

        double valorPorPesoEsperado = 46.964285714285715;

        //Act
        double valorPorPesoResultante = saturno.getValorPorPeso();

        //Assert
        Assert.assertEquals(valorPorPesoEsperado, valorPorPesoResultante, 0.1);
    }

    @Test
    public void deveRetornarUmErroAoCriarUmRecursoComValorZero(){
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            new Recurso("Agua", 0, 9);
        });
    }

    @Test
    public void deveRetornarOsRecursosExploradosSemSobrarCombustivelParaVoltar(){
        //Arrange
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Ouro", 100, 10));
        recursos.add(new Recurso("Ferro", 230, 7));
        Planeta terra = new Planeta(3,recursos);
        Nave naveEspacial = new Nave(9);

        List<String> recursosEsperados = new ArrayList<>();
        recursosEsperados.add("Ouro");
        recursosEsperados.add("Ferro");

        //Act
        List<String> recursosResultantes = naveEspacial.explorar(terra);

        //Assert
        Assert.assertEquals(recursosEsperados, recursosResultantes);
    }

    @Test
    public void deveRetornarOsRecursosExploradosSobrandoCombustivelParaVoltar(){
        //Arrange
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Ouro", 100, 10));
        recursos.add(new Recurso("Ferro", 230, 7));
        Planeta terra = new Planeta(3,recursos);
        Nave naveEspacial = new Nave(20);

        List<String> recursosEsperados = new ArrayList<>();
        recursosEsperados.add("Ouro");
        recursosEsperados.add("Ferro");

        //Act
        List<String> recursosResultantes = naveEspacial.explorar(terra);

        //Assert
        Assert.assertEquals(recursosEsperados, recursosResultantes);
    }


}
