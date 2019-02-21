package Player;

import Interface.IWeapon;
import Weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {

    Weapon weapon;



    public Fighter(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint);
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return weapon;
    }


    public int makeAttack(){
        return this.weapon.getValue();

    }



}



