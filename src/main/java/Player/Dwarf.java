package Player;

import Interface.IWeapon;
import Weapons.Weapon;

import java.util.WeakHashMap;

public class Dwarf extends Fighter implements IWeapon {
    public Dwarf(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }
}
