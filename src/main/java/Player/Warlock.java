package Player;

;
import Interface.IDefend;
import Interface.ISpell;
import Weapons.Defend;
import Weapons.Spells;


public class Warlock extends Mage implements ISpell, IDefend {
    public Warlock(String name, int healthPoint, Spells spell, Defend defend) {
        super(name, healthPoint, spell, defend);
    }
}
