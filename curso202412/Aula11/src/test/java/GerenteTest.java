import org.example.pessoa.Funcionario;
import org.example.pessoa.Gerente;
import org.junit.Assert;
import org.junit.Test;

public class GerenteTest {
    @Test
    public void deveCalcularSalarioComBonusPadraoQuandoNaoForGerenteRegional(){
        //Arrange
        Gerente joao = new Gerente("Joao Paulo Oliveira", "151515", "515151", "007", false);
        joao.setNome("Joao Paulo Oliveira");
        joao.setSalario(1000);
        double salarioComBonificacaoEsperado = 1100;

        //Act
        double salarioComBonus = joao.getSalarioComBonus();

        //Assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonus, 0.01);
    }

    @Test
    public void deveCalcularSalarioComBonusEspecificoQuandoForGerenteRegional(){
        //Arrange
        Gerente joao = new Gerente("Joao Paulo Oliveira", "151515", "515151", "007", true);
        joao.setNome("Joao Paulo Oliveira");
        joao.setSalario(1000);
        double salarioComBonificacaoEsperado = 1200;

        //Act
        double salarioComBonus = joao.getSalarioComBonus();

        //Assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonus, 0.01);
    }
}
