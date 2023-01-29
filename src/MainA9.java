// Задание A9

public class MainA9 {

    public static void main(String[] args) {

        StarSystem starSystem = new StarSystem("Alpha Centauri", 15, 6);
        System.out.println(starSystem.getInfo());
        SunSystem sunSystem = new SunSystem(9, 6, 6500000000L);
        System.out.println(sunSystem.getInfo());
    }
}
