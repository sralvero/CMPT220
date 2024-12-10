public class enemy {
    String name;
    String desc;

    int atk;
    int def;
    int hp;

    public enemy(String n) {
        name = n;
        if (name.equals("duende")) {
            desc = "A goblin dwelling in dark places like caves and burrows. They can bring you good or bad luck, depending on if you have angered one. Take care not to step on one, or it will curse you.";
            atk = 10;
            def = 5;
            hp = 75; 
        } else if (name.equals("manananggal")) {
            desc = " ";
            atk = 18;
            def = 8;
            hp = 75; 
        } else if (name.equals("aswang")) {
            desc = " ";
            atk = 18;
            def = 10;
            hp = 75;
        } else if (name.equals("bal-bal")) {
            desc = " ";
            atk = 20;
            def = 10;
            hp = 80;
        } else if (name.equals("White Lady")) { 
            desc = " ";
            atk = 22;
            def = 13;
            hp = 90;
        }
    }

    int attackPC(int pcDef) {
        if (pcDef >= this.atk) {
            return 3;
            // minimum amt of dmg dealt to player if their def exceeds enemy atk 
        } else {
            return this.atk - pcDef;
        }
    }
}
