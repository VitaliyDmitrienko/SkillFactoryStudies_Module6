// Доп. Задача 5
public class StuffControl {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Designer designer = new Designer();


        Employee employee1 = new Employee("Stiven Jobbs", 65, "CEO");
        Programmer programmer1 = new Programmer("James Gosling", "Head of Programmers", 50, 68, 150000, "JAVA");
        Driver driver = new Driver("Mikhael Schumaher", 50, "Driver", "Head Driver");

         Employee empProg = new Programmer("Meow Moore", "Программист", 30, 5,
                100_000, "Java");
        Employee empDes = new Designer("Super Mors", "Дизайнер", 25, 3,
                70_000, "Adobe Illustrator");

        employee1.getTextInfo();
        System.out.println();

        programmer1.getTextInfo();
        System.out.println();

        driver.getTextInfo();
        System.out.println();

        empProg.getTextInfo();
        System.out.println();

        empDes.getTextInfo();
        employee.getCountOfEmp();

    }
}
