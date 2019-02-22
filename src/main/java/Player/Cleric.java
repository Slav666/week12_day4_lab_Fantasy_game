package Player;

import Interface.IHeal;
import Weapons.Heals;

public class Cleric extends Player implements IHeal {

    Heals heal;

    public Cleric(String name, int healthPoint, Heals heal) {
        super(name, healthPoint);
        this.heal = heal;
    }

    public Heals getHeals(){
        return heal;
    }


    public int makeHeal(){
        return this.heal.getValue();

    }
}
