/*
This program is a Tip Calculator
It can be used to help users figure out how much tip they have to pay.
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class TipCalculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        String[] itemList = new String[100]; // array of user inputted items

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine(); // stores name of user

        System.out.println("Hello " + name + "!" + " How many people are in your group today?: ");
        int people = sc.nextInt(); // stores number of people in the group

        System.out.println("What tip percentage would you like to give? (0-100): ");
        int tip = sc.nextInt(); // stores tip

        String item;
        double costItem = 0;
        double totalCost = 0;

        // User inputs cost and item
        for (int i = 0; costItem != -1; i++) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            costItem = sc.nextDouble();
            sc.nextLine();
            if (costItem != -1) {
                totalCost += costItem;
                System.out.print("Enter the item: ");
                item = sc.nextLine();
                itemList[i] = item;
            } else {
                continue;
            }
        }

        double costAfterTip = totalCost * ((tip/100.0) + 1);
        double totalTip = costAfterTip - totalCost;
        double perCost1 = totalCost / people;
        double tipPer = totalTip / people;
        double perCost2 = costAfterTip / people;

        // Full bill information
        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + df.format(totalCost));
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip : $" + df.format(totalTip));
        System.out.println("Total bill with tip: $" + df.format(costAfterTip));
        System.out.println("Per person cost before tip: $" + df.format(perCost1));
        System.out.println("Tip per person: $" + df.format(tipPer));
        System.out.println("Total cost per person: $" + df.format(perCost2));
        System.out.println("----------------------------------");

        // Prints out all items that the user inputted
        System.out.println("Items ordered: ");
        for (String j: itemList) {
            if (j != null) {
                System.out.println(j);
            }
        }

        // Checks to see if tip is >= 15 percent. (Freestyle)
        System.out.println("----------------------------------");
        if (tip >= 15) {
            System.out.println("What a generous tip!");
            System.out.println("Have a good day " + name + "!");
        } else {
            System.out.println("What a low tip!");
            System.out.println("Never come back again " + name + "!");
        }
    }
}




