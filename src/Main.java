public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "FIRE"),
                new Medic(120, 15, "UPPER HEALTH"),
                new Warrior(150, 25, "CRITICAL DAMAGE")
        };

        // Применение суперспособности каждого героя через цикл
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }

}