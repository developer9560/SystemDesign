package systemDesign.Strategy;

import java.math.BigDecimal;

public class RegularDiscount implements DiscountStrategy{

    public static  final BigDecimal RATE = new BigDecimal("0.05");

    @Override
    public BigDecimal calculateDiscount(BigDecimal amount){
        return amount.multiply(RATE);
    }
}
