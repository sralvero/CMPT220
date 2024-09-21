import java.util.Scanner;

public class LoopsDebug {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint

        int num = sc.nextInt();
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
        //hint
        String reverse = "";
        
        //e rm. use appends? 
        for (int i = 0; i < 3; i++) {

        }
    }
}
