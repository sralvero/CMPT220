// change folder at some point
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math; 


public class midterm {
    public static void main(String[] args) { 

        // instantiates classes
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // creates a list with the values of the 26 cases, assigned randomly
        List<Integer> cases = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            cases.add(rand.nextInt(100000));
        } // will non-randomize this later im TIRED 
        System.out.println("TEST values " + cases);
        System.out.println();

        // creates a list with the numbers of the 26 cases to be displayed to the user 
        List<Integer> caseNums = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            caseNums.add(i+1);
        }
        System.out.println("TEST numbers " + caseNums);
        System.out.println();

        // intro text 
        System.out.println("Welcome to Deal or No Deal!");
        System.out.println("Please choose a case by entering a number from 1 to 26.");

        // grabs user input and stores it to a variable, then removes the index with 
        // that value from the caseNums list 
        int userCase = sc.nextInt();
        System.out.println("TEST choice" + userCase);
        System.out.println("TEST index" + caseNums.indexOf(userCase));
        caseNums.remove(caseNums.indexOf(userCase));

        // saves the value of the user's original chosen case 
        int ogValue = cases.get(userCase - 1);
        // System.out.println("TEST" + ogValue);
        cases.remove(cases.indexOf(ogValue));
        // System.out.println("TEST" + cases);

        
        int casesToRemove = 6;
        System.out.println();        

        for (int i = casesToRemove; i>0; i--) {
            System.out.println("Pick " + casesToRemove + " cases to get rid of.");
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 

            // repeating the same code for the first selected case
            userCase = sc.nextInt();
            System.out.println("TEST choice" + userCase);
            System.out.println("TEST index" + caseNums.indexOf(userCase));

            // displays the value of each chosen case to the user 
            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
            System.out.println("TEST values " + cases);
            
            // updates both lists by removing the case value/number of the user's chosen case 
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));

            System.out.println("TEST values " + cases);
            
            System.out.println();

            casesToRemove--;
            System.out.println("TEST remaining cases: " + casesToRemove);
            // what if we all just died 
        }

        System.out.println();
        
        // set up variables to calculate banker offer 
        // I looked up what the banker offer formula was and it was apparently a root mean square, lol, lmao 
        double offer = 0; 
        for (int i=0; i<cases.size(); i++) {
            offer += Math.pow(cases.get(i), 2);
        }
        offer = Math.sqrt(offer/cases.size());

        // this is the part where the banker makes an offer 
        System.out.println("HELLO. i am the banker. i would like to make you an offer of $" + offer);
        System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

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




        /*
         * 1. user picks one case out of 26. the monetary values are actually not 
         * random LMFAO 
         * 2. user picks 6 other cases to get rid of. as soon as a case is picked
         * the value is revealed + it is removed from the list. text then displays 
         * back to the user with pick 5 cases to get rid of etc 
         * 3. once 6 cases have been removed banker makes an offer that is probably
         * just the avg of the remaining cases. options are deal, no deal and 
         * counteroffer (???)
         * 4. if it declines your offer (or you choose no deal ig) you are then asked
         * to choose 5 cases 
         * 5. banker once again makes an offer. this time the value of the previous 
         * offer will also be displayed. funnily there was no option to counteroffer
         * 6. choose 4 cases
         * 7. if you click deal it will tell you the value of the offer you just 
         * accepted + have you view the value of the case you selected at the start
         * 8. hilariously my case was worth $1 but my offer was $100k and I apparently
         * "beat the banker"  
         * 9. if you keep clicking no deal it will go to choose one case then deal/no
         * deal. if you still click no deal it keeps making you choose one case 
         * 10. when you get down to the last 2 it gives you an option to switch your 
         * original case or not. once you make your choice it shows you what your case
         * was first then the value of the other case 
         * 11. I really dont know how they determine whether you win or not but lol
         * + closing text
         */


    }
}