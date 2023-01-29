// Задание A9
public class SunSystem extends StarSystem {
    //    private String starName;
    //    private int quantityOfPlanets;
    //    private int age; // in a Billion years
//    private String starName = "Sun";
    private long population;

    public SunSystem(int quantityOfPlanets, int age, long population) {
//        this.starName = starName;
//        this.quantityOfPlanets = quantityOfPlanets;
//        this.age = age;
        super("Sun", quantityOfPlanets, age);
        this.population = population;
    }

    public long getPopulation () {
        return population;
    }

    public void setPopulation () {
        this.population = population;
    }

    public String getInfo() {
        return "This is the most densely populated star system in the universe(probably).";
//        return "{ " + starName + " " + quantityOfPlanets + " " + age + " }";
    }
}
