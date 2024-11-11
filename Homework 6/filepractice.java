//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class filepractice {
    public static void main(String[] args){
        //do you need something to start?
        List<String> list = new ArrayList<String>();
        File inputfile = new File("/Users/sarahalvero/Downloads/practice.txt");
        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()){
                //what do we do at every line of the file?
                list.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
      //optional if you want to keep this, just to show what the indices are of the list you created
        System.out.println(list);

        List<String> honors = new ArrayList<String>();
        // traversing list to find GPAs over 3.5
        for (int i=1; i<list.size(); i+=2) {
            if (Double.parseDouble(list.get(i)) > 3.5) {
                honors.add(list.get(i-1));
            } 
        }
        System.out.println(honors);

        var num=0;
        for(int i=0; i<list.size(); i+=2) {
            num++;
        }
        System.out.println("There are " + num + " names total.");
    }
}
