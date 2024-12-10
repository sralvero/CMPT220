public class playerChar {

    String name;

    int atk;
    int def;
    int hp;

    public playerChar(String n) {
        name = n;
        if (name.equals("urduja")) {
            atk = 15;
            def = 15;
            hp = 50;
        } else if (name.equals("lam-ang")) {
            atk = 20;
            def = 10;
            hp = 40;
        } else if (name.equals("bernardo")) {
            atk = 13;
            def = 15;
            hp = 60;
        }
    }

    int attackEnemy(int enemyDef){
        if (enemyDef >= this.atk) {
            return 3;
            // minimum amt of dmg dealt to enemy if their def exceeds player atk
        } else {
            return this.atk - enemyDef;
        }
    }

    int defUp(){
        return (int)Math.ceil(this.def * 1.3); 
    }

    int healUp() {
        return (int)Math.ceil(this.hp * 0.2);
    }
    
}
