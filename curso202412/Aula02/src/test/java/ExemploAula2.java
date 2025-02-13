import org.junit.Test;

public class ExemploAula2 {
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
}
