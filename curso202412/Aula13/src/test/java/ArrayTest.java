import org.example.pessoa.Pessoa;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void exemploArrayChar(){
        //tipo nome = valorInicial;
        char[] nomeMarlon = new char[6];
        nomeMarlon[0] = 'M';
        nomeMarlon[1] = 'a';
        nomeMarlon[2] = 'r';
        nomeMarlon[3] = 'l';
        nomeMarlon[4] = 'o';
        nomeMarlon[5] = 'n';
        System.out.print(nomeMarlon[0]);
        System.out.print(nomeMarlon[1]);
        System.out.print(nomeMarlon[2]);
        System.out.print(nomeMarlon[3]);
        System.out.print(nomeMarlon[4]);
        System.out.print(nomeMarlon[5]);
    }

    @Test
    public void exemploArrayInt(){
        //tipo nome = valorInicial;
        int[] arrayInteiros = new int[6];
        arrayInteiros[0] = 1;
        arrayInteiros[1] = 2;
        arrayInteiros[2] = 3;
        arrayInteiros[3] = 4;
        arrayInteiros[4] = 5;
        arrayInteiros[5] = 6;
        System.out.print(arrayInteiros[0]);
        System.out.print(arrayInteiros[1]);
        System.out.print(arrayInteiros[2]);
        System.out.print(arrayInteiros[3]);
        System.out.print(arrayInteiros[4]);
        System.out.print(arrayInteiros[5]);
    }

    @Test
    public void exemploArrayString(){
        //tipo nome = valorInicial;
        String[] arrayString = new String[2];
        arrayString[0] = "Marlon";
        arrayString[1] = "Iury";

        System.out.print(arrayString[0]);
        System.out.println(" ");
        System.out.print(arrayString[1]);
    }

    @Test
    public void exemploArrayObjeto(){
        //tipo nome = valorInicial;
        Pessoa[] arrayPessoa = new Pessoa[2];
        Pessoa marlon = new Pessoa("Marlon", "505156", "513854186");
        Pessoa maria = new Pessoa("Marlon", "5032156", "51444186");

        arrayPessoa[0] = marlon;
        arrayPessoa[1] = maria;

        System.out.print(arrayPessoa[0]);
        System.out.println(" ");
        System.out.print(arrayPessoa[1]);
    }
}
