package apetiteFinanceiro;

import java.math.BigDecimal;

public class Mercenario implements ApetiteFinanceiro {
    @Override
    public boolean aceitarProposta(BigDecimal preco, BigDecimal oferta){
        BigDecimal minimoAceitavel = preco.multiply(BigDecimal.valueOf(1.8));
        return oferta.compareTo(minimoAceitavel) >= 0;
    }

    @Override
    public BigDecimal calcularMultiplicador() {
        return BigDecimal.valueOf(1.8);
    }

}
