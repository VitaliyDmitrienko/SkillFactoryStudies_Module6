// Задание A9

import java.util.Arrays;

public class MainA10 {
    public static String[] continents = new String[] {"Asia", "America", "Europa"};
//    String[] continents = {"Asia", "America", "Europa"};

    public static void main(String[] args) {



    Bird bird = new Bird("duck", continents, 1500000);
    Pigeon pigeon = new Pigeon(continents, 2000000, 15);
        System.out.println(pigeon.getHunger());
        pigeon.sleep();
        System.out.println(pigeon.getHunger());
        pigeon.askForSeeds();
        System.out.println(pigeon.getHunger());

    }
}
