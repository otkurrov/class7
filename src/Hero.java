public abstract class Hero implements havingSuperAbility {
    public int health;
    public int damage;
    public String typeOfSuperAbility;
    Hero(int health, int damage, String typeOfSuperAbility) {
        this.health = health;
        this.damage = damage;
        this.typeOfSuperAbility = typeOfSuperAbility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public java.lang.String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }

    public void setTypeOfSuperAbility(java.lang.String typeOfSuperAbility) {
        this.typeOfSuperAbility = typeOfSuperAbility;
    }
}
