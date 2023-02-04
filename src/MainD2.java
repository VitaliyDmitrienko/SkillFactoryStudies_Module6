// Доп. Задача 2

public class MainD2 {
    public static void main(String[] args) {
        Barrack barrack = new Barrack();
        barrack.add(new Soldier("Soldier"));
        barrack.add(new Knight("Sir Lancelot"));
        barrack.add(new Rifleman("Sniper"));
        barrack.add(new Rifleman("Rambo"));
        barrack.add(new Rifleman("Sniper2"));

        barrack.visit();
    }
}
