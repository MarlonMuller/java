import org.example.Conta;
import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmSaque(){
        //Arrange
        Conta contaMarlon = new Conta(1, 1000);
        double saldoEsperado = 700;

        //Act
        contaMarlon.sacar(300);

        //Assert
        Assert.assertEquals(saldoEsperado, contaMarlon.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmDeposito(){
        //Arrange
        Conta contaMarlon = new Conta(2);
        contaMarlon.depositar(1000);
        double saldoEsperado = 1500;

        //Act
        contaMarlon.depositar(500);

        //Assert
        Assert.assertEquals(saldoEsperado, contaMarlon.getSaldo(), 0.01);
    }

    @Test
    public void deveManterOSaldoQuandoOcorrerUmaTentativaDeSaqueSemSaldoSuficiente(){
        //arrange
        Conta contaMarlon = new Conta(3);
        contaMarlon.depositar(1000);
        double saldoEsperado = 1000;
        //act
        contaMarlon.sacar(1200);

        //assert
        Assert.assertEquals(saldoEsperado, contaMarlon.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarComSucessoQuandoOcorrerUmSaqueComSaldoSuficiente(){
        //Arrange
        Conta contaMarlon = new Conta(4);
        contaMarlon.depositar(1000);

        //Act
        boolean foiPossivelSacar = contaMarlon.sacar(300);

        //Assert
        Assert.assertTrue(foiPossivelSacar);
    }

    @Test
    public void deveImpedirOSaqueQuandoOcorrerUmaTentativaDeSaqueSemSaldoSuficiente(){
        //Arrange
        Conta contaMarlon = new Conta(5);
        contaMarlon.depositar(1000);

        //Act
        boolean foiPossivelSacar = contaMarlon.sacar(1300);

        //Assert
        Assert.assertFalse(foiPossivelSacar);
    }

    @Test
    public void deveAtualizarSaldoDaContaOrigemQuandoOcorrerUmaTransferencia(){
        //arrange
        Conta contaMarlon = new Conta(6);
        contaMarlon.depositar(1000);
        Conta contaMaria = new Conta(7);
        contaMaria.depositar(2500);
        double saldoEsperadoContaOrigem = 400;

        //act
        contaMarlon.transferir(contaMaria, 600);

        //assert
        Assert.assertEquals(saldoEsperadoContaOrigem, contaMarlon.getSaldo(), 0.01);
    }

    @Test
    public void exemploEncapsulamento(){
        Conta contaMarlon = new Conta(777);
        contaMarlon.depositar(1000);
    }
}
