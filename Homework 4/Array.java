
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(


        int num; // comparison value 
        int total = 0; // counter

        
        for (int i=0; i<myArray.length; i++) {
            num = myArray[i];
            for (int j=0; j<myArray.length; j++) {
                if (num == myArray[j]) {
                    // adds 1 to the counter if a duplicate is found
                    total++;
                }
            }
            if (total > 1) {
                // only prints if there is more than one of the number
                System.out.println(myArray[i] + " is a duplicate number that appears " + total + " times.");
            }
            // resets total for the next index in the array
            total = 0;

        }
    }

}
