import java.util.Scanner;

public class shorthandCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pause and play 1
        String[] Friends = {"Suhani", "Grace", "Keith", "Sophia", "Kristina", "Rina", "Matt"};

        // for loop
        for (int i=0; i < Friends.length; i++){
            System.out.println(Friends[i]);
        }

        // for-each loop 
        for (String i : Friends) {
            System.out.println(i);
        }


        // pause and play 2: switch statement 
        System.out.println("Enter a numerical grade to see its corresponding letter grade.");
        int grade = sc.nextInt();
        switch (grade) {
            case 90: 
                System.out.println("Your grade is A");
                break;
            case 80: 
                System.out.println("Your grade is B");
                break;
            case 70: 
                System.out.println("Your grade is C");
                break;
            case 60:
                System.out.println("Your grade is D");
                break;
            case 50: 
                System.out.println("Your grade is F");
        }


        // pause and play 3: switch statement with ranges 
        System.out.println("Enter your age to the lowest 10:");
        int age = sc.nextInt();
        switch (age) {
            case 0:
            case 10:
                System.out.println("You cannot drink");
                break;
            case 20: 
                System.out.println("You might be able to drink");
                break;
            case 30:
            case 40: 
            case 50:
            case 60:
            case 70: 
            case 80:
            case 90:
                System.out.println("You can drink");
                break;
            default: // pause and play 4: add default
                System.out.println("Invalid input");
        }


        // pause and play 5: shorthand math 
        int var = 100;
        var += 2;
        System.out.println(var);
        var -= 2;
        System.out.println(var);
        var *= 2;
        System.out.println(var);
        var %= 3;
        System.out.println(var);
        var /= 2;
        System.out.println(var);


        // pause and play 6: ternary 
        System.out.println("Enter your exact age, not rounded");
        int exactAge = sc.nextInt();
        String result = (exactAge >= 21) ? ("You can drink") : ("You can't drink");
        System.out.println(result);

    }
}