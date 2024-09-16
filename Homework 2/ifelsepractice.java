//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // resets score every time program runs
        Integer score = 0;

        // these blank lines and any following ones are just for spacing since the 
        // terminal gets super cluttered otherwise
        System.out.println();
        System.out.println();

        System.out.println("welcome to my Filipino mythology quiz!");
        System.out.println("there's a ton of different indigenous tribes with their own creation/spiritual myths.");
        System.out.println("these are only a few of them but I hope you enjoy!");

        System.out.println();

        System.out.println("are you ready? here's the first question!");
        System.out.println("1. what is the word for ancestor spirits in pre-colonial Philippine religion?");
        // uses the scanner to capture user input on next line 
        String answer_1 = sc.nextLine();
        // this if statement checks if the user's answer is the same as the actual answer 
        // NOT case sensitive! 
        if (answer_1.equalsIgnoreCase("anito")) {
            score = score + 1; // only increases if answer is correct 
            System.out.println("good job!!");
        } else {
            System.out.println("wrong :(");
        }

        System.out.println();

        System.out.println("next question!");
        System.out.println("2. what is the name of the serpent deity said to be the cause of lunar eclipses?");
        String answer_2 = sc.nextLine();
        // same as last time: checks if user answer matches the actual answer
        if (answer_2.equalsIgnoreCase("bakunawa")) {
            score = score + 1;
            System.out.println("correct!!");
        } else {
            System.out.println("keep trying! :') ");
        }

        System.out.println();

        System.out.println("last question!"); 
        System.out.println("3. what is the name of the Gaddang epic hero who possessed two magic musical instruments?");
        String answer_3 = sc.nextLine();
        if (answer_3.equalsIgnoreCase("lumalindaw")) {
            score = score + 1;
            System.out.println("you got it!!");
        } else {
            System.out.println("not quite!");
        }

        System.out.println();

        // prints point (singular) if one point was earned and points (plural) otherwise 
        // bc I'm a grammar stickler... 
        if (score == 1) {
            System.out.println("you've finished the quiz with a score of " + score + " point!");
        } else {
            System.out.println("you've finished the quiz with a score of " + score + " points!");
        }
        System.out.println("feel free to look up the answers to learn more, and thanks for playing <3");

        System.out.println();
        System.out.println();


        /* in-class pause & plays 
        Integer number = 4; 
        if (number > 5) {
            System.out.println("Too big!");
        } else if (number > 0 && number < 5) {
            System.out.println("Just right!");
        } else {
            System.out.println("Too small!");
        }

        System.out.println("How old are you?");
        Integer age = sc.nextInt();
        if (age >= 25) {
            System.out.println("You can drink AND rent a car");
        } else if (age >= 21 && age < 25) {
            System.out.println("You can drink and get an uber");
        } else if (age >= 18 && age < 21) {
            System.out.println("you COULD have smoked but not anymore :(");
        } else {
            System.out.println("here's a soda pop");
        }  */

    }
}


