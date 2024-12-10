import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String[] locations = {"cave", "forest", "village"};
        LinkedList<String> enemyList = new LinkedList<String>();
        File inputfile = new File("enemy.txt"); // in finalproject folder
        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()) {
                enemyList.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } 
        // enemyList should now contain the following items: "duende", "manananggal", 
        // "aswang", "bal-bal", "White Lady"


        // intro text  
        System.out.println();
        System.out.println("Welcome to this short Pinoy RPG!");
        System.out.println("To get started, choose one of these heroes whose journey you would like to follow.");
        System.out.println();


        // creating example objects to display to user; the player's chosen character 
        // will be created later
        playerChar ex = new playerChar("urduja");
        System.out.println("1: URDUJA, THE WARRIOR. The legendary warrior princess and matriarch of Tawalisi. The leader of famed female warriors known as the Kinalakian, she never married, as she never met a man who could best her in a fight.");
        System.out.println("STYLE: Well-rounded. Trained in strategy. Equal on offense and defense.");
        System.out.print("STATS: " + ex.atk);
        getUnicode("2694");
        System.out.print(" "+ex.def);
        getUnicode("26E8");
        System.out.print(" "+ex.hp);
        getUnicode("2661");
        System.out.println();
        System.out.println();




        playerChar ex2 = new playerChar("lam-ang");
        System.out.println("2: LAM-ANG, THE BLESSED.");
        System.out.println("STYLE: ");
        System.out.print("STATS: " + ex2.atk);
        getUnicode("2694");
        System.out.print(" "+ex2.def);
        getUnicode("26E8");
        System.out.print(" "+ex2.hp);
        getUnicode("2661");
        System.out.println();
        System.out.println();



        playerChar ex3 = new playerChar("bernardo");
        System.out.println("3: BERNARDO, THE STRONGMAN.");
        System.out.println("STYLE: ");
        System.out.print("STATS: " + ex3.atk);
        getUnicode("2694");
        System.out.print(" "+ex3.def);
        getUnicode("26E8");
        System.out.print(" "+ex3.hp);
        getUnicode("2661");
        System.out.println();
        System.out.println();


        System.out.println("Choose either Urduja, Lam-ang, or Bernardo by entering their NAME below.");
        // input sanitizing
        String userChoice = sc.nextLine().toLowerCase();
        while (!userChoice.equals("urduja") && !userChoice.equals("lam-ang") && !userChoice.equals("bernardo")) {
            System.out.println("Please enter either Urduja, Lam-ang, or Bernardo's name to continue.");
            userChoice = sc.nextLine().toLowerCase();
        }

        playerChar pc = new playerChar(userChoice);
        System.out.println();


        System.out.println("Good choice!"); 
        String location1 = locations[main.nextLocation()].toUpperCase();
        System.out.println("The first location you travel to is a " + location1 + ".");
        enemy enm1 = new enemy(enemyList.get(main.nextEnemy(location1)));
        System.out.println("You notice an enemy has appeared. It's a " + enm1.name + "!");


        while (enm1.hp > 0 ) {
            System.out.println("Type ATTACK to attack the enemy. Type DEFEND to raise your defense. Type HEAL to increase your health. Type SCOUT to view the enemy's info.");
            userChoice = sc.nextLine().toLowerCase();
            System.out.println();
            while (!userChoice.equals("attack") && !userChoice.equals("defend") && !userChoice.equals("scout") && !userChoice.equals("heal")) {
                System.out.println("Please enter ATTACK, DEFEND, HEAL, or SCOUT to continue.");
                userChoice = sc.nextLine().toLowerCase();
                System.out.println();
            } 
            if (userChoice.equals("attack")) {
                int pcDmg = pc.attackEnemy(enm1.def);
                enm1.hp -= pcDmg;
                if (enm1.hp > 0) {
                    System.out.println("You strike the " + enm1.name + " for " + pcDmg + " damage. It now has " + enm1.hp + " health left.");
                } else if (enm1.hp <= 0) {
                    enm1.hp = 0;
                    System.out.println("You strike the " + enm1.name + " for " + pcDmg + " damage, defeating it!");
                    break;
                }
            } else if (userChoice.equals("defend")) {
                System.out.println("You raise your defense to " + pc.defUp() + ".");
            } else if (userChoice.equals("heal")) {
                pc.hp += pc.healUp();
            } else if (userChoice.equals("scout")) {
                System.out.println("You consult your handbook and find this information on the " + enm1.name + ":");
                main.scout(enm1);
            }

            if (userChoice.equals("defend")) {
                pc.hp -= enm1.attackPC(pc.defUp());
                System.out.println("The " + enm1.name + " strikes you for " + enm1.attackPC(pc.defUp()) + " damage.");
            } else {
                pc.hp -= enm1.attackPC(pc.def);
                System.out.println("The " + enm1.name + " strikes you for " + enm1.attackPC(pc.def) + " damage.");
            }

            System.out.println("You now have " + pc.hp + " health.");

            if (pc.hp <= 0) {
                System.out.println("You have been defeated.");
                break;
            }
            System.out.println();
        }
    

        
    }



    // simplest way I could find to print unicode characters in java 
    public static void getUnicode(String hex) {
        // ripped from https://stackoverflow.com/a/45273638
        String encoding=hex;
        int hexNum=Integer.parseInt(encoding,16);//convert str into hex number
        char unicode[]=Character.toChars(hexNum);
        System.out.print(unicode);
    }

    public static int nextLocation() {
        // first: generate a random number from 1-100
        Random rand = new Random();
        int randInt = rand.nextInt(101);
        // then: find the highest number from 1-3 that it's divisible by 
        // and return that number, making village (which has the hardest enemies) rarer
        if (randInt%3 == 0) {
            return 2;
        } else if (randInt%2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int nextEnemy(String location) {
        Random rand = new Random();
        int randInt = rand.nextInt(101);
        if (location.equals("FOREST")) {
            if (randInt%2 == 0) {
                return 2;
            } else {
                return 1;
            }
        } else if (location.equals("VILLAGE")) {
            if (randInt%10 == 0) {
                return 4;
            } else {
                return 3;
            }
        } else {
            return 0;
        }
    }

    public static void scout(enemy e) {
        System.out.println();
        System.out.println(e.desc);
        System.out.print("STATS: " + e.atk);
        getUnicode("2694");
        System.out.print(" "+e.def);
        getUnicode("26E8");
        System.out.print(" "+e.hp);
        getUnicode("2661");
        System.out.println();
        System.out.println();
    }
    
}
