
import java.util.ArrayList;
import java.util.Scanner;

public class NameProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        String name = "";

        System.out.println("Welcome to the Name List Program!");

        while (!name.equalsIgnoreCase("done")) {

            System.out.print("Enter a name (type done to finish): ");
            name = input.nextLine();

            if (!name.equalsIgnoreCase("done")) {
                names.add(name);
            }
        }

        System.out.println("\nHere are the names you entered:");

        for (String n : names) {
            System.out.println(n);
        }

        System.out.println("Total names: " + names.size());

        input.close();
    }
}
