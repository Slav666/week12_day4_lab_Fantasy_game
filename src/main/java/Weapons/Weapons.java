package Weapons;

public enum  Weapons {

    SWORD(25),
    AXE(45),
    CLUB(55);


    private final int value;

    Weapons(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
