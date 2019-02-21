package Player;

import Interface.IDefend;
import Interface.ISpell;

import Weapons.Defend;
import Weapons.Spells;

public class Wizard extends Mage implements ISpell, IDefend {
    public Wizard(String name, int healthPoint, Spells spell, Defend defend) {
        super(name, healthPoint, spell, defend);
    }
}
