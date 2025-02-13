import org.example.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        //Arrenge
        Calculadora calculadora = new Calculadora();
        double valor1 = 10;
        double valor2 = 5;
        double valorEsperado = 15;

        // Act
        double valorCalculado = calculadora.somar(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        //Arrenge
        Calculadora calculadora = new Calculadora();
        double valor1 = 10;
        double valor2 = 5;
        double valorEsperado = 2;

        // Act
        double valorCalculado = calculadora.dividir(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        //Arrenge
        Calculadora calculadora = new Calculadora();
        double valor1 = 10;
        double valor2 = 5;
        double valorEsperado = 50;

        // Act
        double valorCalculado = calculadora.multiplicar(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        //Arrenge
        Calculadora calculadora = new Calculadora();
        double valor1 = 10.5;
        double valor2 = 5.3;
        double valorEsperado = 1.98;

        // Act
        double valorCalculado = calculadora.dividir(valor1, valor2);

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
}
