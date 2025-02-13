import org.example.CalculadorComissao;
import org.example.Conta;
import org.example.Pessoa;
import org.junit.Assert;
import org.junit.Test;

public class ExemploAula09 {
    @Test
    public void abstracao(){
        // Qual o problema? Criar uma pessao que se apresente
        // Quais os dados necessários?
        // Quais as operações necessárias?
        String nome = "Marlon";
        int idade = 28;
        double altura = 1.72;
        char sexo = 'M';
        boolean possuiDeficienca = false;

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos");
    }

    @Test
    public void exemplosClassePessoa(){
        Pessoa marlon = new Pessoa();
        marlon.nome = "Marlon";
        marlon.idade = 28;
        marlon.apresentarse();

        Pessoa maria = new Pessoa();
        maria.nome = "Maria";
        maria.idade = 29;
        maria.apresentarse();
    }

    @Test
    public void exemploTesteComissao(){
        // Qual é o problema? Criar um sistema que calcule o valor de comissão de um vendedor a partir do valor vendido
        // Quais são os dados necessários? Valor vendido e o percentual de comissão
        // Quais as operações necessárias? Calcular o valor da comissão com a fómula = (valorVendido * percentualComissão) / 100

        //Arrange
        CalculadorComissao calculadorComissao = new CalculadorComissao();
        calculadorComissao.valorVendido = 1000;
        calculadorComissao.percentualComissao = 30;
        double valorEsperado = 300;

        //Act
        double valorCalculado = calculadorComissao.calcularValorComissao();

        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void exemploConta(){
        // Qual é o problema? Criar um sistema de software que efetue as operações e contas bancárias
        // Quais as operações necessárias? sacar, depositar
        // Quais são os dados necessários? sacar (valor a sacar, saldo na conta, quem é a pessoa) depositar (valor a depositar, conta destino)

        Conta contaMarlon = new Conta(03);
        contaMarlon.depositar(1000);
        contaMarlon.sacar(300);
        contaMarlon.depositar(500);
    }

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmSaque(){
        //Arrange
        Conta contaMarlon = new Conta(02);
        contaMarlon.depositar(1000);
        double saldoEsperado = 700;

        //Act
        contaMarlon.sacar(300);

        //Assert
        Assert.assertEquals(saldoEsperado, contaMarlon.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmDeposito(){
        //Arrange
        Conta contaMarlon = new Conta(01);
        contaMarlon.depositar(1000);
        double saldoEsperado = 1500;

        //Act
        contaMarlon.depositar(500);

        //Assert
        Assert.assertEquals(saldoEsperado, contaMarlon.getSaldo(), 0.01);
    }
}
