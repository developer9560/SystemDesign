package systemDesign.SolidDesignPattern.openClose;

public class PaymentService {

    void pay(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
