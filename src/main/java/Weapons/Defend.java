package Weapons;

public enum Defend {

    OGRE(90),
    DRAGON(150);

    private final int value;

    Defend(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
