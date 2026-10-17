package systemDesign.Strategy;

import java.math.BigDecimal;

public class PremiumDiscount implements DiscountStrategy{

    public  static  final BigDecimal rate = new BigDecimal("0.10");

    @Override
    public BigDecimal calculateDiscount(BigDecimal amount){
        return amount.multiply(rate);
    }
}
