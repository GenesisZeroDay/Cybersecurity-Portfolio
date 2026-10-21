
import java.util.Scanner;

public class HolidayBudget
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double budget;
        double totalExpenses = 0;
        int choice = 0;

        System.out.println("===== HOLIDAY BUDGET =====");
        System.out.print("Enter your holiday budget: $");
        budget = input.nextDouble();

        // While loop keeps the program running
        while (choice != 3)
        {
            System.out.println("\n1. Add holiday expenses");
            System.out.println("2. View budget summary");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            // If-else statements check the user's choice
            if (choice == 1)
            {
                System.out.print("How many expense categories? ");
                int categories = input.nextInt();

                // Outer loop goes through each category
                for (int i = 1; i <= categories; i++)
                {
                    System.out.println("\nExpense category " + i);

                    System.out.print("How many expenses in this category? ");
                    int numberOfExpenses = input.nextInt();

                    // Nested loop enters expenses in each category
                    for (int j = 1; j <= numberOfExpenses; j++)
                    {
                        System.out.print("Enter expense " + j + ": $");
                        double expense = input.nextDouble();

                        if (expense >= 0)
                        {
                            totalExpenses = totalExpenses + expense;
                        }
                        else
                        {
                            System.out.println("Invalid amount. Expense not added.");
                        }
                    }
                }
            }
            else if (choice == 2)
            {
                double moneyLeft = budget - totalExpenses;

                System.out.println("\n===== BUDGET SUMMARY =====");
                System.out.printf("Starting budget: $%.2f%n", budget);
                System.out.printf("Total expenses:  $%.2f%n", totalExpenses);
                System.out.printf("Money remaining: $%.2f%n", moneyLeft);

                if (moneyLeft >= 0)
                {
                    System.out.println("You are within your holiday budget.");
                }
                else
                {
                    System.out.println("You are over your holiday budget.");
                }
            }
            else if (choice == 3)
            {
                System.out.println("Thank you for using Holiday Budget!");
            }
            else
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}

