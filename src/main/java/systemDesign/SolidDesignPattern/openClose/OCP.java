package systemDesign.SolidDesignPattern.openClose;



public class OCP {

    public static void main(String[] args) {
        PaymentMethod upi = new UPI();
        upi.pay(20);

        PaymentMethod creadit = new CreaditCard();
        creadit.pay(30);

        PaymentService service = new PaymentService();

        service.pay(new UPI(), 50);
        service.pay(new CreaditCard(),80);

    }
}
