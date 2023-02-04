// Доп. Задача 4
public class Creature {
    private String name;
    protected int health;
    private int damage;
    private boolean isAlive = true;

    public Creature() {
        this("some creature", 100, 0);
    }

    public Creature(int health, int damage) {
        this("some creature", health, damage);
    }

    public Creature(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName () {return name;}
    public int getDamage () {return damage;}
    public boolean getIsAlive () {return isAlive;}


    public void battleCry () {
        System.out.println("Chaaaaarge !!!!!!");
    }

    public void attack (Creature creature) {
        this.battleCry();
        creature.health -= this.damage;
        if (creature.health < 0) {
            creature.isAlive = false;
        }
    }

}
