package systemDesign.Strategy;

import java.math.BigDecimal;

public class StudentDiscount implements DiscountStrategy{

    private static final BigDecimal RATE= new BigDecimal("0.15");

    @Override
    public BigDecimal calculateDiscount(BigDecimal amount) {
        return amount.multiply(RATE);
    }
}
