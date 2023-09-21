import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class TipCalculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {


        String[] itemList = new String[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!" + " How many people are in your group today?: ");
        int people = sc.nextInt();

        System.out.println("What tip percentage would you like to give? (0-100): ");
        int tip = sc.nextInt();

        String item;
        double costItem = 0;
        double totalCost = 0;

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

    }
}




