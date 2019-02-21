package Enemy;

public abstract class Enemy {

    int healthPoint;


    public Enemy(int healthPoint){
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
//
//    public int takeDamage(int damage){
//        damage = healthPoint ;
//        return damage;
//    }
}
