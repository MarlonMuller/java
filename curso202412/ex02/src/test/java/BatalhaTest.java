import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        //Assert
        Assert.assertSame(ninjaUm,ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(4, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(3, 8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        int chakraEsperado = 90;

        //Act
        ninjaUm.atacar(ninjaDois);

        //Assert
        Assert.assertEquals(chakraEsperado, ninjaDois.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(3, 8);
        Ninja ninjaItachi = new Ninja("Itachi", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(3, 9);
        Ninja ninjaDois = new Ninja("Boruto", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaItachi, ninjaDois);

        //Assert
        Assert.assertSame(ninjaItachi,ninjaVencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(2, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 2);
        Ninja ninjaItachi = new Ninja("Itachi", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaItachi);

        //Assert
        Assert.assertSame(ninjaItachi, ninjaVencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(5, 6);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 6);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        //Assert
        Assert.assertSame(ninjaUm, ninjaVencedor);
    }
}
