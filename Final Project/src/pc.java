public class pc {

    String name;

    int atk;
    int def;
    int hp;

    public pc(String n) {
        name = n;
        if (name=="Urduja") { // I have to check how to check string equivalency AGAIN 
            atk = 10;
            def = 10;
            hp = 20;
        } else if (name=="Lam-ang") {
            atk = 13;
            def = 8;
            hp = 15;
        } else if (name=="Bernardo Carpio") {
            atk = 8;
            def = 8;
            hp = 25;
        }
    }

    void descText(){
        if (this.name == "Urduja") {
        }
    }
    
}
