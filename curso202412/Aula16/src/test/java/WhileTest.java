import org.junit.Test;

public class WhileTest {

    @Test
    public void exemploWhileDeterminado(){
        char[] nomeMarlon = new char[6];
        nomeMarlon[0] = 'M';
        nomeMarlon[1] = 'a';
        nomeMarlon[2] = 'r';
        nomeMarlon[3] = 'l';
        nomeMarlon[4] = 'o';
        nomeMarlon[5] = 'n';
        System.out.println("Tamanho Array: " + nomeMarlon.length);

        System.out.println("Imprimindo com while");
        int i = 0;
        while(i < 5){
            System.out.println(nomeMarlon[i]);
            i++;
        }

        System.out.println("Imprimindo com for");
        for (int indice = 0; indice < nomeMarlon.length; indice++){
            System.out.print(nomeMarlon[indice]);
        }
    }

    @Test
    public void exemploWhileIndeterminado(){
        //Sequencia fibonacci
        int valorMaximoSequencia = 100;
        int ant1 = 0;
        int ant2 = 1;
        int prox = 0;

        System.out.print(ant1);
        while(prox < valorMaximoSequencia){
            System.out.print(" - " + ant2);
            prox = ant1 + ant2;
            ant1 = ant2;
            ant2 = prox;
        }
    }
}
