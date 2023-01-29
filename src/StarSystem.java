// Задание A9
public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private int age; // in a Billion years

    public StarSystem (String starName, int quantityOfPlanets, int age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public String getInfo() {
        return "{ " + getStarName() + " " + getQuantityOfPlanets() + " " + getAge() + " }";
    }

    public String getStarName () {
        return starName;
    }

    public int getQuantityOfPlanets () {
        return quantityOfPlanets;
    }

    public int getAge () {
        return age;
    }

    public void setStarName () {
        this.starName = starName;
    }

    public void setQuantityOfPlanets () {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public void setAge () {
        this.age = age;
    }

}
