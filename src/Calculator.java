import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static final int DECIMALS = 3;
    public static final double DECIMALROUNDER = Math.pow(10.0, DECIMALS);

    public static void main(String[] args) {
        System.out.println("Welcome to the CASHAPP savings calculator!");
        System.out.println("\tThis calculator is made to calculate your approximate savings" +
                "\n\tfrom using CashApp's boosts." +
                "\n\tPlease only use this as advisory information.");
        System.out.println();

        Scanner input = new Scanner(System.in);

        // price
        System.out.print("What's the total price of your product?\n$");
        double price = input.nextDouble();

        // boost
        System.out.print("\nWhat's the boost amount? (in percent)\n");
        double boost = input.nextDouble();

        // tax
        System.out.print("\nWhat's the tax amount? (in percent)\n");
        double tax = input.nextDouble();

        double savings = ((1 + (tax/100)) * price) * (1 - (1 - (boost/100))); // =((1 + tax/100) * price) * (1 - (1 - boost/100))
        double roundedSavings = Math.round(savings * DECIMALROUNDER) / DECIMALROUNDER;
        System.out.println("\nSavings: $" + roundedSavings);



    }
}
