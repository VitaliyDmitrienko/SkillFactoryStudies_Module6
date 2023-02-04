// Доп. Задача 5
public class Driver extends Employee {
//    String name;
//    int age;
//    String position;
//    int employeeCounter;
    String subPosition;
    String carModel;

    public Driver(String  name, int age, String position, String subPosition) {
        super(name, age, position);
        this.subPosition = subPosition;
        this.carModel = "Mercedes";
    }
}
