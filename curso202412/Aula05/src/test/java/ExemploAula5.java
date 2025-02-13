import org.junit.Assert;
import org.junit.Test;

public class ExemploAula5 {
    @Test
    public void exemploVariavel(){
        System.out.println(25);

        /*
            A variável de nome idade que é do tipo inteiro deve ter o valor 28
        */
        int idade = 28;

        //Imprimindo o valor da variável idade
        System.out.println(idade);
    }

    @Test
    public void exemploCalculoAreaQuadrado(){
        int ladoA = 2;
        int ladoB = 3;
        int area = ladoA * ladoB;
        System.out.println(area);
    }

    @Test
    public void exemploCalculoAreaCirculo(){
        double raio = 1.4;
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.println(area);
    }

    @Test
    public void exemploBoolean(){
        boolean informacao = true;
        System.out.println(informacao);

        boolean umEhMaiorQueZero = 1 > 0;
        System.out.println(umEhMaiorQueZero);
    }

    @Test
    public void exemploChar(){
        char primeiraLetraNome = 'M';
        System.out.println(primeiraLetraNome);
    }

    @Test
    public void copiaValoresEntreVariaveisPrimitivas(){
        int i = 2;
        int j = i;
        System.out.println(i);
        System.out.println(j);

        i = 3;
        System.out.println(i);
        System.out.println(j);
    }

    @Test
    public void castingVariaveisPrimitivas(){
        double pi = 3.14159;
        int piInteiro = (int) pi;
        System.out.println(pi);
        System.out.println(piInteiro);

        int variavelInteira = 4;
        double variavelFlutuante = variavelInteira;
        System.out.println(variavelInteira);
        System.out.println(variavelFlutuante);
    }

    @Test
    public void Texto(){
        System.out.println("Marlon");

        String nome = "Marlon";
        System.out.println(nome);
    }

    @Test
    public void operadoresAritmeticos(){
        System.out.println(2 + 2);

        int soma = 2 + 2;
        System.out.println("Imprimindo a soma " + soma);

        int valorA = 5;
        int valorB = 3;
        int subtracao = valorA - valorB;
        System.out.println("Imprimindo a subtração " + subtracao);

        System.out.println("Imprimindo operadores aritmeticos com inteiros");
        int a = 8;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println("Modulo:" + a % b);

        System.out.println("Imprimindo operadores aritmeticos com doubles");
        double y = 3.2;
        double x = 2.1;
        System.out.println(y + x);
        System.out.println(y - x);
        System.out.println(y * x);
        System.out.println(y / x);
        System.out.println("Modulo:" + y % x);
    }

    @Test
    public void soma(){
        // triple A -> AAA (Arrange, Act, Assert)

        //Arrange
        int valorA = 2;
        int valorB = 2;
        int resultadoEsperado = 4;

        //Act
        int soma = valorA + valorB;

        //Assert
        Assert.assertEquals(resultadoEsperado, soma);

    }

    @Test
    public void delta(){
        //Acrescenta o delta (diferença aceitável)
        //Arrange
        double valorA = 1.5;
        double valorB = 2;
        double resultadoEsperado = 3.5;

        //Act
        double soma = valorA + valorB;

        //Assert
        Assert.assertEquals(resultadoEsperado, soma, 0);
    }

    @Test
    public void testDelta(){
        //arrange
        double pi = 3.1415;
        double valorComparacao = 3.14;

        //assert
        Assert.assertEquals(pi, valorComparacao, 0.001);
    }

    @Test
    public void operadoresLogicos(){
        System.out.println(true);
        System.out.println(false);

        boolean umEhMaiorQueDois = 1 > 2;
        System.out.println(umEhMaiorQueDois);
        System.out.println(1 > 2);
        System.out.println(1 == 2);
        System.out.println(1 < 2);
    }

    @Test
    public void operadoresLogicosVerdade(){
        boolean doisEhMaiorQueZero = 2 > 0;
        boolean doisEhMaiorQueUm = 2 > 1;
        boolean doisEhMaiorQueDois = 2 > 2;
        boolean doisEhMaiorQueMenosUm = 2 > -1;

        System.out.println("TABELA VERDADE E (AND) - condiçao e condição &&");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(doisEhMaiorQueZero && doisEhMaiorQueUm && doisEhMaiorQueDois);

        System.out.println("TABELA VERDADE OU (OR) - condiçao ou condição ||");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(doisEhMaiorQueZero || doisEhMaiorQueUm || doisEhMaiorQueDois);

        System.out.println("TABELA VERDADE OU EXCLUSIVO (XOR) - condiçao xor condição ^");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(doisEhMaiorQueZero ^ doisEhMaiorQueUm ^ doisEhMaiorQueDois);

        System.out.println("TABELA VERDADE NEGAÇÃO (NOT) !");
        System.out.println(!true);
        System.out.println(!false);
        
    }
}
