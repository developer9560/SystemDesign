package systemDesign.Strategy;

import java.math.BigDecimal;

public interface DiscountStrategy {

    BigDecimal calculateDiscount(BigDecimal amount);
}
