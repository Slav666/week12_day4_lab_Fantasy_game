package Weapons;

public enum  Heals {

    POTION(25),
    HERBS(15);

    private final int value;

    Heals(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
