/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    System.out.println("Enter a number you would like to find the factorial of.");
    int thirdInput = sc.nextInt();
    System.out.println(factorial(thirdInput));

    System.out.println("Enter a number, and this function will add up every other digit.");
    int fourthInput = sc.nextInt();
    System.out.println(addEveryOther(fourthInput));

    System.out.println("Enter a string you would like to be reversed."); 
    String getsIgnored = sc.nextLine(); // program will end without taking this input, but the one on the next line works
    String fifthInput = sc.nextLine();
    System.out.println(reverseString(fifthInput));
      
    }

  
    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }
  
    public static void printDog(){
        System.out.println("Dog");
    }

    // problem 2
    public static int factorial(int x) {
        int total = 1; 
        for (int i=0; i<x; i++) {
            total = total * (i+1);
        }
        return total;
    }

    // problem 3
    public static int addEveryOther(int x) {
        int sum = 0;
        for (int i=1; i<=x; i+=2) {
            sum += i;
        }
        return sum;
    }

    // problem 5 
    public static String reverseString(String x) {
        String reverse = "";
        for (int i=x.length(); i > 0; i--) {
            char character = x.charAt(i-1);
            reverse = reverse + character;
        }
        return reverse;
    }

  
}
