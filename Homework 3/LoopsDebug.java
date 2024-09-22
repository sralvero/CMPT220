import java.util.Scanner;

public class LoopsDebug {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i < 10; i++){
            // made it print i + 1 instead of i so I wouldn't have to change the  
            // for loop conditions 
            System.out.println(i + 1);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint

        int num = sc.nextInt();
        // created a variable to store the factorial 
        // starts at 1 and not 0 otherwise it will just keep multiplying to 0
        int factorial = 1; 
        for (int i = 0; i < num; i++){
            factorial = factorial * (i+1);
        }
        System.out.println(factorial);
        

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?

        int var = sc.nextInt();
        // created a variable to store the sum 
        int sum = 0;
        // the for loop starts at 1 and increases by 2 every iteration instead of 1 
        // this way, i skips every other number 
        for (int i = 1; i <= var; i+=2) {
            sum += i;
        }
        System.out.println(sum);


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }
        // this loop doesn't stop because the run condition is always set to true 
        // you can break the loop by setting run to false after the string prints once 


        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Please enter a word: "); 
        String word = sc.nextLine(); 
        /* idk why but the first scanner line just would not run and the program 
        would end without allowing for user input so I made another scanner line 
        right underneath and that one ended up working. if I take the first one 
        out it breaks again */
        String word_2 = sc.nextLine();

        //hint
        String reverse = "";
        int word_length = word_2.length();

        for (int i = word_length; i > 0; i--) {
            // accesses the character at index (i - 1) in the original string and 
            // appends it to the reverse string, starting from the last character
            // and returning to the first 
            char character = word_2.charAt(i - 1);
            reverse = reverse + character;
        }
        System.out.println(reverse);
        
        /* mini-writeup: I did the loop challenge before this and this was the way I 
        initially set up the for loop for that (because I misread the prompt lol): 
        in reverse, with i decreasing from the word_length to 0. 
        The index has to be i - 1 as i runs from word_length to 1, but the character
        indexes of the strings run from (word_length - 1) to 0. */
    }
}
