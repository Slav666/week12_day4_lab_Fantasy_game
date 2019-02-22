package Player;

import Interface.IWeapon;
import Weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {

    Weapon weapon;


    public Fighter(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }



    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int makeAttack() {
        return this.weapon.getValue();

    }

//    public TakeHealthFromCleric(){
//
//    }
    public void isAttacked(int damage){

        this.healthPoint -= damage;
    }

    public void isHealed(int gethealth){
        this.healthPoint += gethealth;

    }

}



