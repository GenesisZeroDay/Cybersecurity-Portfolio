import java.util.Scanner;

public class ExpenseManager
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name;
        char currency = '$';
        boolean hasBudget = true;

        int reportYear = 2026;
        double monthlyIncome;
        double rent;
        double groceries;
        double transportation;
        double phone;
        double internet;
        double entertainment;
        double schoolExpenses;
        double savings;
        double clothing;
        double subscriptions;

        float savingsRate = 0.10f;
        long accountNumber = 123456789L;
        short monthNumber = 9;
        byte expenseCategories = 10;

        System.out.print("Enter your name: ");
        name = scan.nextLine();

        System.out.print("Enter your monthly income: ");
        monthlyIncome = scan.nextDouble();

        System.out.print("Enter your monthly rent: ");
        rent = scan.nextDouble();

        System.out.print("Enter your grocery expenses: ");
        groceries = scan.nextDouble();

        System.out.print("Enter your transportation expenses: ");
        transportation = scan.nextDouble();

        System.out.print("Enter your phone expenses: ");
        phone = scan.nextDouble();

        System.out.print("Enter your internet expenses: ");
        internet = scan.nextDouble();

        System.out.print("Enter your entertainment expenses: ");
        entertainment = scan.nextDouble();

        System.out.print("Enter your school expenses: ");
        schoolExpenses = scan.nextDouble();

        System.out.print("Enter your monthly savings: ");
        savings = scan.nextDouble();

        System.out.print("Enter your clothing expenses: ");
        clothing = scan.nextDouble();

        System.out.print("Enter your subscription expenses: ");
        subscriptions = scan.nextDouble();

        double totalExpenses = rent + groceries + transportation
                + phone + internet + entertainment + schoolExpenses
                + savings + clothing + subscriptions;

        double moneyRemaining = monthlyIncome - totalExpenses;

        double weeklyExpenses = totalExpenses / 4.0;

        double percentageSpent = (totalExpenses / monthlyIncome) * 100;

        int roundedExpenses = (int) totalExpenses;

        System.out.println("\n===== MONTHLY EXPENSE REPORT =====");
        System.out.println("Name:\t\t" + name);
        System.out.println("Income:\t\t" + currency + monthlyIncome);
        System.out.println("Rent:\t\t" + currency + rent);
        System.out.println("Groceries:\t" + currency + groceries);
        System.out.println("Transportation:\t" + currency + transportation);
        System.out.println("Phone:\t\t" + currency + phone);
        System.out.println("Internet:\t" + currency + internet);
        System.out.println("Entertainment:\t" + currency + entertainment);
        System.out.println("School:\t\t" + currency + schoolExpenses);
        System.out.println("Savings:\t" + currency + savings);
        System.out.println("Clothing:\t" + currency + clothing);
        System.out.println("Subscriptions:\t" + currency + subscriptions);

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Total Expenses:\t" + currency + totalExpenses);
        System.out.println("Money Remaining:\t" + currency + moneyRemaining);
        System.out.println("Weekly Expenses:\t" + currency + weeklyExpenses);
        System.out.println("Percentage Spent:\t" + percentageSpent + "%");
        System.out.println("Integer Expense Total:\t" + roundedExpenses);

        System.out.println("\nBudget Active:\t" + hasBudget);
        System.out.println("Report Year:\t" + reportYear);
        System.out.println("Savings Rate:\t" + savingsRate);
        System.out.println("Month Number:\t" + monthNumber);
        System.out.println("Expense Categories:\t" + expenseCategories);

        System.out.println("\nYou spend " + percentageSpent
                + "% of your monthly income.");

        System.out.println("===== END REPORT =====");

        scan.close();
    }
}
