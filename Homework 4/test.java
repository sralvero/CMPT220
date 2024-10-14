import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.Collections;

public class test {
    public static void main(String[] args) { 
        List<Integer> cases = new ArrayList<Integer>();
        cases.addAll(Arrays.asList(1, 2, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 1000000, 1500000));
        Collections.shuffle(cases);
        System.out.println("test " + cases);






        /* Scanner sc = new Scanner(System.in);
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
        } */

    }

}