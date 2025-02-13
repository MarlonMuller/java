import org.junit.Assert;
import org.junit.Test;

public class OlaMundoTest {

    @Test
    public void deveDizerOlaQuandoNomeForInformado() {
        OlaMundo olaMundo = new OlaMundo();

        String resposta = olaMundo.dizerOla("Marlon");

        Assert.assertEquals("Olá Marlon!", resposta);
    }
}
