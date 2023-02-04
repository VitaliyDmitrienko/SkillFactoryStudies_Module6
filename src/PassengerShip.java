// Доп. Задача 3
public class PassengerShip extends Ship {
//    int year;
//    String name;
    int maxNumberOfPassengers;

    public PassengerShip(String name, int yearOfManufacture, int maxNumberOfPassengers) {
        super(name, yearOfManufacture);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public String toString() {
//Код для определения нужного окончания слова при согласовании с

        int lastDigit;
        if (maxNumberOfPassengers < 10)
            lastDigit = maxNumberOfPassengers;
        else
            lastDigit = maxNumberOfPassengers % 10;
        String ending;

        if(lastDigit>=1 && lastDigit<=4){
            ending = "а";
        }else {
            ending = "ов";
        }

        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно принять на борт %d пассажир%s.", maxNumberOfPassengers, ending);
        return output;
    }
}
