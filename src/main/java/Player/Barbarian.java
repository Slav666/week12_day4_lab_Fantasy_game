package Player;

import Interface.IWeapon;
import Weapons.Weapon;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }
}
