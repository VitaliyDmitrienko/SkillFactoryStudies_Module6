// Доп. Задача 5
public class Employee {
    protected String name;
    protected String position;
    protected int age;
    protected int experience;
    protected int salary;
    private static int employeeCounter = 0;

    public Employee() {
        employeeCounter++;
    }


    public Employee (String  name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        employeeCounter++;
    }

    public Employee(String name, String position, int age, int experience, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        employeeCounter++;
   }


    public void getTextInfo() {
        System.out.println("Сотрудник компании: " + name
                + "\nВозраст: " + age
                + "\nДолжность: " + position
                + "\nСтаж в компании: " + experience
                + "\nЗарплата: " + salary);
    }

    public void getCountOfEmp() {
        System.out.println("The company has " + employeeCounter + " employees");
    }


    //getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
