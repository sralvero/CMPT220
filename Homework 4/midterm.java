// change folder at some point
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math; 


public class midterm {
    public static void main(String[] args) { 

        // instantiates scanner
        Scanner sc = new Scanner(System.in);

        // creates a list with the values of the 26 cases
        List<Integer> cases = new ArrayList<Integer>();
        cases.addAll(Arrays.asList(1, 2, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 1000000, 1500000));
        System.out.println();

        // creates a list with the numbers of the 26 cases to be displayed to the user 
        List<Integer> caseNums = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            caseNums.add(i+1);
        }
        System.out.println();

        
        System.out.println("Welcome to Deal or No Deal!");
        System.out.println("You have the opportunity to choose one of 26 cases with a random monetary value from the following list: ");
        System.out.println(cases);
        Collections.shuffle(cases); // randomizes order after displaying to the user
        System.out.println("Please choose a case by entering a number from 1 to 26.");

        // grabs user input and stores it to a variable, then removes the index with 
        // that value from the caseNums list 
        int userCase = sc.nextInt();
        caseNums.remove(caseNums.indexOf(userCase));

        // saves the value of the user's original chosen case 
        int ogValue = cases.get(userCase - 1);
        cases.remove(cases.indexOf(ogValue));        

        System.out.println();

        // first round of discarding cases
        for (int i = 6; i>0; i--) {
            if (i == 1) {
                System.out.println("Pick " + i + " case to get rid of.");
            } else {
                System.out.println("Pick " + i + " cases to get rid of.");
            }
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 

            // repeating the same code for the first selected case
            userCase = sc.nextInt();

            // displays the value of each chosen case to the user 
            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
            
            // updates both lists by removing the case value/number of the user's chosen case 
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));
            
            System.out.println();
        }

        System.out.println();
        
        // set up variables to calculate banker offer 
        // banker offer formula is apparently a root mean square 
        double offer = 0; 
        for (int i=0; i<cases.size(); i++) {
            offer += Math.pow(cases.get(i), 2);
        }
        offer = Math.ceil(Math.sqrt(offer/cases.size()));

        // this is the part where the banker makes an offer 
        System.out.println("HELLO. i am the banker. i would like to make you an offer of $" + offer + ".");
        System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

        String userChoice = sc.nextLine().toLowerCase();

        // looked up how to compare if a string does NOT equal another with the !.equals() command
        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("deal")) {
            System.out.println("Thank you for playing Deal or No Deal! You have won $" + offer + ".");
            System.out.println("The case you originally picked contained $" + ogValue + ".");
            System.exit(0); // ends game
        } else if (userChoice.equals("no deal")) {
            System.out.println("The game continues.");
        }

        // begins second round of removing cases. same code as first round but 1 less iteration 
        for (int i=5; i>0; i--) {
            if (i == 1) {
                System.out.println("Pick " + i + " case to get rid of.");
            } else {
                System.out.println("Pick " + i + " cases to get rid of.");
            }
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 

            userCase = sc.nextInt();

            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
           
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));
            
            System.out.println();
        }

        System.out.println();

        // recalculating offer 
        offer = 0;
        for (int i=0; i<cases.size(); i++) {
            offer += Math.pow(cases.get(i), 2);
        }
        offer = Math.ceil(Math.sqrt(offer/cases.size()));

        System.out.println("HELLO AGAIN. i am the banker. i would like to make you an offer of $" + offer + ".");
        System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

        userChoice = sc.nextLine().toLowerCase();

        // once again checking if the user input a valid response 
        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("deal")) {
            System.out.println("Thank you for playing Deal or No Deal! You have won $" + offer + ".");
            System.out.println("The case you originally picked contained $" + ogValue + ".");
            System.exit(0); // ends game
        } else if (userChoice.equals("no deal")) {
            System.out.println("The game continues.");
        }


        // begins third round of removing cases 
        for (int i=4; i>0; i--) {
            if (i == 1) {
                System.out.println("Pick " + i + " case to get rid of.");
            } else {
                System.out.println("Pick " + i + " cases to get rid of.");
            }
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 

            userCase = sc.nextInt();

            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
            
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));
            
            System.out.println();
        }

        System.out.println();

        // recalculating offer 
        offer = 0;
        for (int i=0; i<cases.size(); i++) {
            offer += Math.pow(cases.get(i), 2);
        }
        offer = Math.ceil(Math.sqrt(offer/cases.size()));

        System.out.println("HELLO AGAIN. i am the banker. i would like to make you an offer of $" + offer + ".");
        System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

        userChoice = sc.nextLine().toLowerCase();

        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("deal")) {
            System.out.println("Thank you for playing Deal or No Deal! You have won $" + offer + ".");
            System.out.println("The case you originally picked contained $" + ogValue + ".");
            System.exit(0); // ends game
        } else if (userChoice.equals("no deal")) {
            System.out.println("The game continues.");
        }


        // begins fourth round of removing cases 
        for (int i=3; i>0; i--) {
            if (i == 1) {
                System.out.println("Pick " + i + " case to get rid of.");
            } else {
                System.out.println("Pick " + i + " cases to get rid of.");
            }
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 

            userCase = sc.nextInt();

            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
            
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));
            
            System.out.println();
        }

        System.out.println();

        // recalculating offer 
        offer = 0;
        for (int i=0; i<cases.size(); i++) {
            offer += Math.pow(cases.get(i), 2);
        }
        offer = Math.ceil(Math.sqrt(offer/cases.size()));

        System.out.println("HELLO AGAIN. i am the banker. i would like to make you an offer of $" + offer + ".");
        System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

        userChoice = sc.nextLine().toLowerCase();

        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("deal")) {
            System.out.println("Thank you for playing Deal or No Deal! You have won $" + offer + ".");
            System.out.println("The case you originally picked contained $" + ogValue + ".");
            System.exit(0); // ends game
        } else if (userChoice.equals("no deal")) {
            System.out.println("The game continues.");
        }


        // begins fifth round of removing cases 
        for (int i=2; i>0; i--) {
            if (i == 1) {
                System.out.println("Pick " + i + " case to get rid of.");
            } else {
                System.out.println("Pick " + i + " cases to get rid of.");
            }
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 

            userCase = sc.nextInt();
            
            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
            System.out.println("TEST values " + cases);
            
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));
            
            System.out.println();
        }

        System.out.println();

        // recalculating offer 
        offer = 0;
        for (int i=0; i<cases.size(); i++) {
            offer += Math.pow(cases.get(i), 2);
        }
        offer = Math.ceil(Math.sqrt(offer/cases.size()));

        System.out.println("HELLO AGAIN. i am the banker. i would like to make you an offer of $" + offer + ".");
        System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

        userChoice = sc.nextLine().toLowerCase();

        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("deal")) {
            System.out.println("Thank you for playing Deal or No Deal! You have won $" + offer + ".");
            System.out.println("The case you originally picked contained $" + ogValue + ".");
            System.exit(0); // ends game
        } else if (userChoice.equals("no deal")) {
            System.out.println("The game continues.");
        }


        // at this point you will keep choosing one case to discard --> banker offer 
        // until you accept the offer or until 1 non-original case is left
        while (cases.size() > 1) {
            System.out.println("Pick 1 case to get rid of.");
            System.out.println("Enter ONE number still present in the following list to discard the corresponding case.");
            System.out.println(caseNums); 
    
            userCase = sc.nextInt();

            System.out.println("The value of case " + userCase + " was: $" + cases.get(caseNums.indexOf(userCase)));
            
            cases.remove(caseNums.indexOf(userCase));
            caseNums.remove(caseNums.indexOf(userCase));

            System.out.println();

            offer = 0;
            for (int i=0; i<cases.size(); i++) {
                offer += Math.pow(cases.get(i), 2);
            }
            offer = Math.ceil(Math.sqrt(offer/cases.size()));

            if (cases.size() != 1) {
                System.out.println("HELLO AGAIN. i am the banker. i would like to make you an offer of $" + offer + ".");
                System.out.println("Type DEAL to accept. Type NO DEAL to keep playing.");

                userChoice = sc.nextLine().toLowerCase();

                while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
                    System.out.println("Please enter DEAL or NO DEAL to continue.");
                    userChoice = sc.nextLine().toLowerCase();
                }

                if (userChoice.equals("deal")) {
                    System.out.println("Thank you for playing Deal or No Deal! You have won $" + offer + ".");
                    System.out.println("The case you originally picked contained $" + ogValue + ".");
                    System.exit(0); // ends game
                } else if (userChoice.equals("no deal")) {
                    System.out.println("The game continues.");
                }
            }
        }

        System.out.println();
        System.out.println("The last remaining case is " + caseNums + ".");
        System.out.println("Would you like to keep your original case or switch it?");
        System.out.println("Type DEAL to switch to the other case. Type NO DEAL to keep your original case.");

        userChoice = sc.nextLine().toLowerCase();

        while (!userChoice.equals("no deal") && !userChoice.equals("deal")) {
            System.out.println("Please enter DEAL or NO DEAL to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        if (userChoice.equals("deal")) {
            System.out.println("You have switched to case " + caseNums.get(0) + " and won $" + cases.get(0) + ".");
            System.out.println("The case you originally picked contained $" + ogValue + ".");
        } else if (userChoice.equals("no deal")) {
            System.out.println("You have kept your original case and won $" + ogValue + ".");
            System.out.println("The value of case " + caseNums.get(0) + " was $" + cases.get(0) + ".");
        }
        System.out.println("Thank you for playing Deal or No Deal.");
        System.out.println();

    }
}