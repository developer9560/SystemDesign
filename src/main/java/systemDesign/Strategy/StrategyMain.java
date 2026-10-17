
package systemDesign.Strategy;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StrategyMain {

    static void display() {
        System.out.println("\n--- Choose Option ---");
        System.out.println("1 for Regular Discount");
        System.out.println("2 for Premium Discount");
        System.out.println("3 for Festival Discount");
        System.out.println("4 for Student Discount");
        System.out.println("5 to Exit");
    }

    public static void main(String[] args) {

        DiscountStrategyFactory factory =
                new DiscountStrategyFactory();

        PricingService service = new PricingService(factory);

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                BigDecimal amount = null;

                // Get and validate the amount
                while (amount == null) {
                    System.out.print("Enter the amount: ");

                    try {
                        BigDecimal input = sc.nextBigDecimal();

                        if (input.signum() < 0) {
                            System.out.println(
                                    "Error: Amount cannot be negative."
                            );
                            continue;
                        }

                        amount = input;

                    } catch (InputMismatchException e) {
                        System.out.println(
                                "Error: Please enter a valid numeric amount."
                        );
                        sc.next(); // Consume invalid input
                    }
                }

                //  Get and validate the choice
                int choice = 0;
                boolean validChoice = false;

                while (!validChoice) {
                    display();
                    System.out.print("Your choice: ");

                    try {
                        choice = sc.nextInt();

                        if (choice >= 1 && choice <= 5) {
                            validChoice = true;
                        } else {
                            System.out.println(
                                    "Error: Select an option between 1 and 5."
                            );
                        }

                    } catch (InputMismatchException e) {
                        System.out.println(
                                "Error: Please enter a valid integer."
                        );
                        sc.next(); // Consume invalid input
                    }
                }

                // Process the choice
                if (choice == 5) {
                    System.out.println("Exiting system. Goodbye!");
                    return;
                }

                DiscountType type = switch (choice) {
                    case 1 -> DiscountType.REGULAR;
                    case 2 -> DiscountType.PREMIUM;
                    case 3 -> DiscountType.FESTIVAL;
                    case 4 -> DiscountType.STUDENT;
                    default -> throw new IllegalStateException(
                            "Unexpected choice: " + choice
                    );
                };

                BigDecimal finalPrice =
                        service.calculateFinalPrice(type, amount);

                System.out.println("Final Price: " + finalPrice);
            }
        }
    }
}
