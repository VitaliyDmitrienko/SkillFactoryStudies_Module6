// Задание A8
public class PedigreeCat extends Cat {

    private String breed;

    public PedigreeCat (String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed=breed;
    }

    @Override
    public String toString() {
        return "The cat " + super.getName() + " is very beautiful, although she is now " + super.getAge() + ", she belongs to the breed " + breed + ", and her owner " + super.getOwner() + " is very proud of her.";
    }

//    public String getName() {
//        return super.getName();
//    }
//
//    public String getOwner() {
//        return super.getOwner();
//    }
//
//    public int getAge () {
//        return super.getAge();
//    }
    public String getBreed() {
        return breed;
    }

    public void setBreed (String breed) {
        this.breed=breed;
    }

}
