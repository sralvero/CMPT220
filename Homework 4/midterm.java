// change folder at some point
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class midterm {
    public static void main(String[] args) { 

        // instantiates classes
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // creates a list with the values of the 26 cases, assigned randomly
        List<Integer> cases = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            cases.add(rand.nextInt(100000));
        }
        System.out.println("TEST" + cases);
        System.out.println();

        // creates a list with the numbers of the 26 cases to be displayed to the user 
        List<Integer> caseNums = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            caseNums.add(i+1);
        }
        System.out.println("TEST" + caseNums);

        // intro text 
        System.out.println("Welcome to Deal or No Deal!");
        System.out.println("Please choose a case by entering a number from 1 to 26.");

        int userCase = cases.get((sc.nextInt()-1));
        System.out.println("TEST" + userCase);


        /*
         * 1. user picks one case out of 26. the monetary values are actually not 
         * random LMFAO 
         * 2. user picks 6 other cases to get rid of. as soon as a case is picked
         * the value is revealed + it is removed from the list. text then displays 
         * back to the user with pick 5 cases to get rid of etc 
         * (thinking I should make a list that is literally just the numbers 1-26)
         * 3. once 6 cases have been removed banker makes an offer that is probably
         * just the avg of the remaining cases. options are deal, no deal and 
         * counteroffer (??? not doing that)
         * 4. if it declines your offer (or you choose no deal ig) you are then asked
         * to choose 5 cases 
         * 5. banker once again makes an offer. this time the value of the previous 
         * offer will also be displayed. funnily there was no option to counteroffer
         * 6. choose 4 cases
         * 7. if you click deal it will tell you the value of the offer you just 
         * accepted + have you view the value of the case you selected at the start
         * 8. hilariously my case was worth $1 but my offer was $100k and I apparently
         * "beat the banker". I have no idea what that means or how that happens 
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