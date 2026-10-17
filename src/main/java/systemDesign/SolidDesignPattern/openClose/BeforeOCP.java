package systemDesign.SolidDesignPattern.openClose;

class Payment{


    void pay(String str, double amount){
        if(str.equals("UPI")){
            System.out.println("paying "+ amount + "with UPI");
        }else if (str.equals("CARD")){
            System.out.printf("paything %s with CARD", amount);
        }
        // so on many payment method
    }
}
public class BeforeOCP {

    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay("UPI",20);
        p.pay("CARD",30);
    }

}
