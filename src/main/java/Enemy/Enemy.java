package Enemy;

public abstract class Enemy {

    int healthPoint;
    int damageValue;




    public Enemy(int healthPoint, int damageValue){
        this.healthPoint = healthPoint;
        this.damageValue = damageValue;

    }

    public int getHealthPoint() {
        return healthPoint;
    }

//    public void setDamageValue(int damageValue) {
//        this.damageValue = damageValue;
//    }


//    public void isAttacked(int damage){
//        this.healthPoint -= damage;
//    }
    public int getDamageValue() {
    return damageValue;
    }
}
