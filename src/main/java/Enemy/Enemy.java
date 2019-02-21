package Enemy;

public abstract class Enemy {

    int healthPoint;
    int damageValue;



    public Enemy(int healthPoint){
        this.healthPoint = healthPoint;
        this.damageValue = -5;

    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int takeDamage(){
        return healthPoint + damageValue;

    }
}
