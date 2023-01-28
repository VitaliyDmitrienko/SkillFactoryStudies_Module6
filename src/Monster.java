public class Monster {

    private String name; int attack;

    public Monster(String name, int attack) {
        this.name = name;
        this.attack = attack;
        System.out.println("Monster " + name + " was created");
    }

    public void growl(){
        System.out.println(name + " growled");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage " + attack);
    }
}
