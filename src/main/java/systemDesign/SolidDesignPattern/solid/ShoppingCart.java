package systemDesign.SolidDesignPattern.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
   public List<Product> items;
   public ShoppingCart(){
        items = new ArrayList<>();
    }

   public void addItems(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product name : ");
        String name = sc.nextLine();
        System.out.println("Enter Product Price : ");
        int price = sc.nextInt();
        items.add(new Product(name, price));
        System.out.println("done");
    }
   public void calulatePrice(){
        int totalPrice = 0;
        for(Product p  : items){
            totalPrice += p.price;
        }
        System.out.println("Total Price : "+ totalPrice);
    }

    List<Product> getItems(){
       return items;
    }


}
