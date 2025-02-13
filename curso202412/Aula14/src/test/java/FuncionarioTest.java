import org.example.pessoa.Gerente;
import org.example.pessoa.Vendedor;
import org.junit.Assert;
import org.junit.Test;
import org.example.pessoa.Funcionario;

public class FuncionarioTest {


    @Test
    public void deveCalcularSalarioAcrescidoDe10PorCentoQuandoConsultadoOSalarioComBonificacao(){
        // deve calcular o salário com acréscimo de 10% quando consultado salário com bonificação

        //Arrange
        Funcionario joao = new Funcionario("Joao Paulo Oliveira", "151515", "515151", "007");
        joao.setNome("Joao Paulo Oliveira");
        joao.setSalario(1000);
        double salarioComBonificacaoEsperado = 1100;

        //Act
        double salarioComBonus = joao.getSalarioComBonus();

        //Assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonus, 0.01);
    }

    @Test
    public void deveCalcularSalarioCorretamenteQuandoOBonusForDinamico(){
        // deve calcular o salário com acréscimo de percentual dinâmico

        //Arrange
        Funcionario joao = new Funcionario("Joao Oliveira", "151515", "515151", "007");
        joao.setSalario(1000);
        double salarioComBonificacaoEsperado = 1150;

        //Act
        double salarioComBonus = joao.getSalarioComBonus(15);

        //Assert
        Assert.assertEquals(salarioComBonificacaoEsperado, salarioComBonus, 0.01);
    }

    @Test
    public void exemploVender(){
        Funcionario carlos = new Gerente("Carlos Silva", "156185156", "156156", "003");

    }
}
