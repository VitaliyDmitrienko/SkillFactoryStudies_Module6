// Доп. Задача 4
public class EpicFight {

    public static void main(String[] args) {

        Ork ork = new Ork("Groot", 200, 17);
        Elf elf = new Elf("Ealendil", 150, 25);

        fight(ork, elf);

    }

    private static void fight(Creature firstFighter, Creature secondFighter) {


        while (secondFighter.getIsAlive() && firstFighter.getIsAlive()) {
            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }

        if (firstFighter.getIsAlive()) {
            System.out.printf("%s with name %s is dead\n", secondFighter.getClass().getSimpleName(), secondFighter.getName());
            System.out.printf("%s with name %s win with %s health.", firstFighter.getClass().getSimpleName(), firstFighter.getName(), firstFighter.health);

        } else if (secondFighter.getIsAlive()) {
            System.out.printf("%s with name %s is dead\n", firstFighter.getClass().getSimpleName(), firstFighter.getName());
            System.out.printf("%s with name %s win with %s health.", secondFighter.getClass().getSimpleName(), secondFighter.getName(), secondFighter.health);
        } else {
            System.out.println("All are dead...");
        }
    }

}
