package systemDesign.SolidDesignPattern.openClose;

public class CreaditCard implements  PaymentMethod{

    @Override
    public  void  pay(double amount){
        System.out.println("CREADIT card");
    }
}
