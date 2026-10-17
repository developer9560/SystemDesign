package systemDesign.SolidDesignPattern.openClose;

public class UPI implements  PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("UPI"+ amount);
    }
}
