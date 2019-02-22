package Player;

public abstract class Player {

    String name;
    int healthPoint;

    public Player(String name, int healthPoint){
        this.name = name;
        this.healthPoint = healthPoint;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }


}
