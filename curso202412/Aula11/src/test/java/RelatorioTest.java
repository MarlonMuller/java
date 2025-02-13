import org.example.pessoa.Funcionario;
import org.example.pessoa.Gerente;
import org.example.pessoa.Vendedor;
import org.example.relatorio.Relatorio;
import org.junit.Test;

public class RelatorioTest {
    @Test
    public void exemplo(){

        Gerente ruan = new Gerente("Ruan Oliveira", "151515", "515151", "007", true);
        ruan.setSalario(1000);

        Vendedor paulo = new Vendedor("Paulo Souza", "151515", "515151", "004");
        paulo.setSalario(2000);

        Relatorio relatorio = new Relatorio();
        relatorio.imprimirDados(ruan);
        relatorio.imprimirDados(paulo);
    }
}
