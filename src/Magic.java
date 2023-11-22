public class Magic extends Hero {
    Magic(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);}
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + typeOfSuperAbility);
    }
}
