package systemDesign.SolidDesignPattern.solid;

import java.security.PublicKey;

public class ShoppingInvice {
  ShoppingCart cart ;
    ShoppingInvice(ShoppingCart cart){
        this.cart = cart;
    }
    void printInvoice(){
        for(Product p : cart.getItems() ) {
            System.out.println(p.name+" -> "+p.price);
        }
        cart.calulatePrice();
    }

}
