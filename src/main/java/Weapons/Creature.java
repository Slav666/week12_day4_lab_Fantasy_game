package Weapons;

public enum  Creature {

    OGRE(90),
    DRAGON(150);

    private final int value;

    Creature(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
