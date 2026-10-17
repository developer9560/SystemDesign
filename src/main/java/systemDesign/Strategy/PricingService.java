package systemDesign.Strategy;

import java.math.BigDecimal;

public class PricingService {

    DiscountStrategyFactory factory;

    PricingService(DiscountStrategyFactory factory){
        this.factory = factory;
    }

    public BigDecimal calculateFinalPrice(DiscountType type, BigDecimal amount){
        if(amount== null || amount.signum()<0){
            throw new IllegalArgumentException("Amount must not be negative or null");
        }

        BigDecimal discount = factory.getStrategy(type).calculateDiscount(amount);
        if(discount == null || discount.signum()<0 || discount.compareTo(amount)>0){
            throw new IllegalArgumentException(" Invalid discount returned by strategy");
        }
        return amount.subtract(discount);
    }
}
