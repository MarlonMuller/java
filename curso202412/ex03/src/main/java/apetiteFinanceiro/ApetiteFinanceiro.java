package apetiteFinanceiro;

import java.math.BigDecimal;

public interface ApetiteFinanceiro {
    boolean aceitarProposta(BigDecimal preco, BigDecimal oferta);

    default BigDecimal calcularMultiplicador() {
        return BigDecimal.ONE;
    }
}
