package Player;

import Weapons.Defend;
import Weapons.Spells;

public abstract class Mage extends Player{

    Spells spell;
    Defend defend;

    public Mage(String name, int healthPoint, Spells spell, Defend defend) {
        super(name, healthPoint);
        this.spell = spell;
        this.defend = defend;
    }

    public Spells getSpell() {
        return spell;
    }

    public int makeSpell(){
        return this.spell.getValue();

    }

    public Defend getDefend() {
        return defend;
    }

    public int makeDefend(){
        return this.spell.getValue();

    }
}
