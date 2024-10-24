/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This function will count the number of times a letter appears in a given word.");
        System.out.println("Please enter a word:");
        String userWord = sc.nextLine();
        System.out.println("Now please enter a character in the word you would like to be counted:");
        // why doesn't java have a nextChar() method?
        char userChar = sc.next().charAt(0);

        System.out.println("The letter " + userChar + " appears in " + userWord + " " + countCharacter(userWord, userChar) + " times.");
    }

    public static int countCharacter(String word, char input) {
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) == input) {
                count ++;
            }
        }
        return count;
    }
   
}
