import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // variáveis
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Marlon";
        boolean bool = true;

        //condicionais
        if(bool){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // vetor array simples
        int[] numeros = {1,2,3,4};

        numeros[3] = 10;


        // array list
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Marlon");
        nomes.add("Iury");
        nomes.add("Oliveira");
        nomes.add("Muller");

       /* System.out.println(nomes.get(0));
        nomes.remove(0);
        System.out.println(nomes.get(0));
        nomes.remove("Iury");
        System.out.println(nomes.get(0));
       */

        // Loops
        // for
        for(int in = 0; in < nomes.size(); in++){
            System.out.println(nomes.get(in));
        }

        for(int in = 0; in < numeros.length; in++){
            System.out.println(numeros[in]);
        }

        System.out.println("-----------");

        // for each
        for(int numero : numeros){
            System.out.println(numero);
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-----------");

        int counter = 0;
        // while
        while(counter < 10){
            System.out.println("Contando: " + counter);
            counter++;
        }

        // casting
        double resultado = 1.0;
        int resultadoInt = (int)resultado;

        int meuInt = 10;
        double meuDoble = meuInt;


    }
}
 