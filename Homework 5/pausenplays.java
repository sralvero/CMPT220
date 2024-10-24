public class pausenplays {

    public static void main(String[] args) {
        printName();

        printString("one");
        printString("2");
        printString("thr33");

        printExclamation("oops");

        printHometown();

        bestFriends("Sarah", "Suhani");

        favFood();

        favCombo("peach tea", "soup dumplings from Ichiddo");
        // i have never spelled mozzarella right in my life 

        System.out.println(multiplyNums(4, 5, 9));
    }

    public static void printName(){
        System.out.println("Sarah");
    }

    public static void printString(String x) {
        System.out.println(x);
    }

    public static void printExclamation(String x) {
        System.out.println(x + "!");
    }

    public static void printHometown() {
        System.out.println("Bethel, CT");
    }

    public static void bestFriends(String you, String bff) {
        System.out.println("My name is " + you + " and my best friend's name is " + bff + ".");
    }

    public static void favFood() {
        System.out.println("jackfruit");
    }

    public static void favCombo(String drink, String appetizer) {
        System.out.println("My favorite drink is " + drink + " and my favorite appetizer is " + appetizer + ".");
    }

    public static int multiplyNums(int x, int y, int z) {
        return x * y * z;
    }

    // think of a use case and create a function for it: half my midterm could have been a function T_T 
    
}
