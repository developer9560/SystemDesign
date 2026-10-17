package systemDesign.SolidDesignPattern.solid;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        ShoppingInvice invoice = new ShoppingInvice(cart);

        while (true) {
            System.out.println("1. Add Item \n2. Print Invoice \n3. Stop");
            int choice = sc.nextInt();

            if (choice > 3 || choice < 1) {
                System.out.println("Choose again");
                continue;
            }

            switch (choice) {
                case 1:
                    while (true) {
                        cart.addItems(); // Ensure input gathering happens outside or cleanly separated
                        System.out.println("Do you want to stop? Press 1");
                        int ch = sc.nextInt();
                        if (ch == 1) {
                            break;
                        }
                    }
                    break; // <-- CRITICAL: Prevents falling through to printing the invoice

                case 2:
                    invoice.printInvoice();
                    break; // <-- CRITICAL: Prevents falling through to stopping the app

                case 3:
                    System.out.println("Exiting application...");
                    break;
            }

            // Break the outer while(true) loop if choice was 3
            if (choice == 3) {
                break;
            }
        }


    }
}
