import java.util.Arrays;
import java.util.Collections;

public class pausenplays { 

    public static void main(String[] args) {

        // create 4 various types of arrays
        int[] intarray = {4, 5, 6, 7};
        String[] strarray = {"one", "two", "ate"};
        char[] charray = {'a', 'b', 'c'};
        int[] newArray;

        // create array of 3 fav foods + print index 0 
        String[] favFoods = {"hopia langka", "soup dumplings", "hot pot"};
        System.out.println(favFoods[0]);

        // print entire array 
        for (int i = 0; i < favFoods.length; i++) {
            System.out.println(favFoods[i]);
        }

        // create and print 10 slot array 
        Integer[] numArray = {90, 35, 25, 35, 120, 36, 8, 47, 23498, 238};
        for (int i=0; i<numArray.length; i++) {
            System.out.println(numArray[i]);
        }

        // print array from highest to lowest 
        Arrays.sort(numArray, Collections.reverseOrder()); // requires Integer class NOT int primitive
        System.out.println(Arrays.toString(numArray));

        // find and print smallest value in a given array 
        Integer[] sampleArray = {3, 8, 10, 6, 2};
        Arrays.sort(sampleArray);
        System.out.println("The smallest value in this array is " + sampleArray[0]);

    }

}