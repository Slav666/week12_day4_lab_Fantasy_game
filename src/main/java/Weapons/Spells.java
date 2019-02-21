package Weapons;

public enum  Spells {

    FIREBALL(70),
    LIGHTNING_STRIKE(60);

    private final int value;

    Spells(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
