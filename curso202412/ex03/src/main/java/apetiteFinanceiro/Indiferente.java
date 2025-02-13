package apetiteFinanceiro;

import java.math.BigDecimal;

public class Indiferente implements ApetiteFinanceiro{
    @Override
    public boolean aceitarProposta(BigDecimal preco, BigDecimal oferta){
        return oferta.compareTo(preco) >= 0;
    }
    @Override
    public BigDecimal calcularMultiplicador() {
        return BigDecimal.ONE;
    }
}
