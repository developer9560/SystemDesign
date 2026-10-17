package systemDesign.Strategy;

public class DiscountStrategyFactory {

    public DiscountStrategy getStrategy(DiscountType type){
        return switch (type){
            case PREMIUM -> new PremiumDiscount();
            case REGULAR -> new RegularDiscount();
            case FESTIVAL -> new FestivalDiscount();
            case STUDENT -> new StudentDiscount();
        };
    }
}
