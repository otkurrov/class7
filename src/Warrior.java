public class Warrior extends Hero{
    Warrior(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + typeOfSuperAbility);
    }
}
