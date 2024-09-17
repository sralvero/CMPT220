// class on 9/17 
import java.util.Scanner;

public class pauseplay {
    

    public static void main(String[] args) {
        /* 
        for (int i = 0; i < 20; i++) {
            System.out.println("Sarah");
        } */

        /* 
        int n = 0;
        while (n < 10) {
            System.out.println(n+1);
            n++;
        } */

        /* 
        String p = "Sarah";
        int m = 0; 
        while (m < 4) {
            System.out.println(p);
            m++; // commenting this line out makes an infinite loop
        } */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int input = sc.nextInt();
        int k = 0;
        for (int j = 1; j <= input; j++) {
            k += j;
        }
        System.out.println(k);

        /* while loop version: 
         * int i = 0;
         * while (i <= input) {
         *      k = k + i;
         *      i++;
         * }
         * System.out.println(k);
         */


    }

}
