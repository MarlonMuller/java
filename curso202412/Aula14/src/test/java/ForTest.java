import org.junit.Test;

public class ForTest {
    @Test
    public void exemploForBasico() {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }

    @Test
    public void exemploForPercorrendoArrayChar(){

        char[] nomeMarlon = new char[6];
        nomeMarlon[0] = 'M';
        nomeMarlon[1] = 'a';
        nomeMarlon[2] = 'r';
        nomeMarlon[3] = 'l';
        nomeMarlon[4] = 'o';
        nomeMarlon[5] = 'n';

        for (int i = 0; i <= 5; i++){
            System.out.print(nomeMarlon[i]);
        }

        for (int i = 0; i < nomeMarlon.length; i++){
            System.out.print(nomeMarlon[i]);
        }
    }
}
