import java.util.Scanner;

public class test {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something lol");
        String userChoice = sc.nextLine().toLowerCase();

        // had to look up how to compare if a string does NOT equal another with the !.equals() command
        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println(userChoice);
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("no deal")) {
            System.out.println("Thank you for playing Deal or No Deal! You have won $");
            System.out.println("The case you originally picked contained $.");
            System.exit(0);
        }

    }

}