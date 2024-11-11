import java.util.Scanner;

public class trycatchPractice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        while(sc.hasNext()) { // maybe this would stop inputs from breaking if you ask for them too many times?
            String input = sc.nextLine();
            try {
                int val = Integer.parseInt(input);
                // bc variable was declared inside try, it only exists here (scope). will fail to print outside of try 
                System.out.println(val + " is in fact a number");
                break;
            } catch (Exception e) {
                System.out.println("please enter a number");
            }
        }

        // regex practice next: case matters
        // if you have a \ as part of the string you need to put it twice so java knows it's part of the string and 
        // not like a code quirk. whatever terminology

        String var = "melissa";
        if(var.matches("\\D*")) { // this checks that there's no digit in the string
            System.out.println("Patient name valid");
            // add to the database in the sample hospital registry example 
        } else {
            System.out.println("invalid string");
        }
        // more explanation: java only looks at data type. if it sees a variable is a string 
        // it won't check if there's a digit in the string


        String num = "2024";
        if(num.matches("\\d*")) { // checking that there are ONLY digits in the string
            System.out.println("digits only digits");
        } else {
            System.out.println("not all digits");
        }

    }
}
