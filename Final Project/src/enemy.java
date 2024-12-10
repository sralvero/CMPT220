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
            desc = "A vampire able to separate its torso from the lower half of its body. At night, it flies in search of sleeping, newlywed women to satisfy its appetite.";
            atk = 18;
            def = 8;
            hp = 75; 
        } else if (name.equals("aswang")) {
            desc = "A shapeshifting monster found in cemeteries and woods on the outskirts of human villages. They favor raw human meat and will often prey on the dead. Much weaker during the daytime, or when exposed to noise.";
            atk = 18;
            def = 10;
            hp = 75;
        } else if (name.equals("bal-bal")) {
            desc = "An undead monster known to steal corpses and devour them. A flesh eater with terrifying claws and a foul smell.";
            atk = 20;
            def = 10;
            hp = 80;
        } else if (name.equals("White Lady")) { 
            desc = "Also known as the kaperosa. A vengeful ghost that roams the earth seeking justice for her death. Not much is known about her. Take care.";
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
