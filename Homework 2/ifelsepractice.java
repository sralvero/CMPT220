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

        // in-class pause & plays 
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
            System.out.println("You can drink AND rent a car omg");
        } else if (age >= 21 && age < 25) {
            System.out.println("You can drink and get an uber");
        } else if (age >= 18 && age < 21) {
            System.out.println("you COULD have smoked but not anymore lmfao");
        } else {
            System.out.println("heres a soda pop");
        }

    }
}


