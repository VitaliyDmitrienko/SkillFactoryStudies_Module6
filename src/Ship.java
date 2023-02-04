// Доп. Задача 3
public class Ship {
    int yearOfManufacture;
    String name;

    public Ship(String name, int yearOfManufacture) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        String outputString = String.format("Судно \"%s\" построено в %d году.",
                name, yearOfManufacture);
        return outputString;
    }
}
