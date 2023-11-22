public class Medic extends Hero{
    Medic(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + typeOfSuperAbility);
    }

}
