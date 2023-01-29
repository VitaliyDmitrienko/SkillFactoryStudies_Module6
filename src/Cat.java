// Задание A7
// Write your code

// Задание A6 начало + далее доп для А7
public class Cat {
    // Write your code

    private String name;
    private int age;
    private String owner;

    public Cat (String name, int age, String owner) {
        this.name=name;
        this.age=age;
        this.owner=owner;
//        System.out.println("Cat " + name + age + owner + " was created");
    }

    @Override
    public String toString() {
        return "The cat " + name + " is already " + age + ". Her master " + owner +" takes care of her.";
    }

    void eat() {}

    void run() {}

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge () {
        return age;
    }

    public void setName (String name) {
        this.name=name;
    }

    public void setOwner (String owner) {
        this.owner=owner;
    }

    public void setAge (int age) {
        this.age=age;
    }

}
