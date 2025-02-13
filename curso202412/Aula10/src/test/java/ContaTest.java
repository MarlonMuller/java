import org.example.conta.Conta;
import org.example.pessoa.Pessoa;
import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmSaque(){
        //Arrange
        Pessoa marlon = new Pessoa("Marlon Muller", "010101", "101010");
        Conta contaMarlon = new Conta(1, marlon, 1000);
        double saldoEsperado = 700;

        //Act
        contaMarlon.sacar(300);

        //Assert
        Assert.assertEquals(saldoEsperado, contaMarlon.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmDeposito(){
        //Arrange
        Pessoa marlon = new Pessoa("Marlon Muller", "010101", "101010");
        marlon.setNome("Marlon Muller");
        Conta contaMarlon = new Conta(2, marlon);
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
        Pessoa marlon = new Pessoa("Marlon Muller", "010101", "101010");
        marlon.setNome("Marlon Muller");
        Conta contaMarlon = new Conta(3, marlon);
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
        Pessoa marlon = new Pessoa("Marlon Muller", "010101", "101010");
        marlon.setNome("Marlon Muller");
        Conta contaMarlon = new Conta(4, marlon);
        contaMarlon.depositar(1000);

        //Act
        boolean foiPossivelSacar = contaMarlon.sacar(300);

        //Assert
        Assert.assertTrue(foiPossivelSacar);
    }

    @Test
    public void deveImpedirOSaqueQuandoOcorrerUmaTentativaDeSaqueSemSaldoSuficiente(){
        //Arrange
        Pessoa marlon = new Pessoa("Marlon Muller", "010101", "101010");
        marlon.setNome("Marlon Muller");
        Conta contaMarlon = new Conta(5, marlon);
        contaMarlon.depositar(1000);

        //Act
        boolean foiPossivelSacar = contaMarlon.sacar(1300);

        //Assert
        Assert.assertFalse(foiPossivelSacar);
    }

    @Test
    public void deveAtualizarSaldoDaContaOrigemQuandoOcorrerUmaTransferencia(){
        //arrange
        Pessoa marlon = new Pessoa("Marlon Muller", "010101", "101010");
        marlon.setNome("Marlon Muller");
        Conta contaMarlon = new Conta(6, marlon);
        contaMarlon.depositar(1000);

        Pessoa maria = new Pessoa("Maria Silva", "010101", "101010");
        Conta contaMaria = new Conta(7, maria);
        contaMaria.depositar(2500);

        double saldoEsperadoContaOrigem = 400;

        //act
        contaMarlon.transferir(contaMaria, 600);

        //assert
        Assert.assertEquals(saldoEsperadoContaOrigem, contaMarlon.getSaldo(), 0.01);
    }

}
