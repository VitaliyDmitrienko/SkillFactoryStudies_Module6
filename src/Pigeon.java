// Задание A10
public class Pigeon extends Bird {
//    private String type;
//    private String[] continents;
//    private int population;
    private int hunger;

    public Pigeon(String[] continents, int population, int hunger) {
//        this.type = type;
//        this.continents = continents;
//        this.population = population;
        super("pigeon", continents, population);
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void sleep() {
        hunger = hunger + 3;
    }

    public void askForSeeds() {
        if (hunger < 7) {
            hunger = 0;
        } else {
            hunger = hunger -7;
        }
    }
}
