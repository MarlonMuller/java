import org.junit.Test;

public class ExemploAula3 {
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
}
