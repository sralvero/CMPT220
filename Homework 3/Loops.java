/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        int word_length = word.length();

        for (int i = 0; i < word_length; i++) {
            System.out.println(word.charAt(i));
        }

        /* This challenge starts with importing a scanner (of course) and getting a 
        word from the user by saving their input to a variable. 
        Then you can use .length() to find the length of that word, and save that to 
        a new variable.
        I set up the for loop with int i starting at 0 as normal, and then increasing 
        until it equals word_length, at which point the for loop will stop.
        I had to look up how to print a single character from the string, which Google 
        told me could be done with the .charAt(index) command. 
        In a string, the first index is 0 and the last index is word_length - 1 
        and as the loop will run from i = 0 to i = word_length - 1, you can just print
        word.charAt(i) in each iteration of the loop.
         */


    }
}
