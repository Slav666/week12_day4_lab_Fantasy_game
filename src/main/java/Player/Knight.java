package Player;

import Interface.IWeapon;
import Weapons.Weapon;

public class Knight  extends Fighter implements IWeapon {
    public Knight(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }


}
