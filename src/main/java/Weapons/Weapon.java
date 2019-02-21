package Weapons;

import Interface.IWeapon;

public enum Weapon  {

    SWORD(25),
    AXE(45),
    CLUB(55);


    private final int value;

    Weapon(int value){
        this.value = value;
    }



    public int getValue() {
        return value;
    }




}
