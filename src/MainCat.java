// Задание A7
// Задание A8
public class MainCat {

    public static void main(String[] args) {

//        Cat cat = new Cat("Meow", 15, "Mickle");
        PedigreeCat pedigreeCat = new PedigreeCat("Murr-Meow", 10 , "John", "Russ");
//        System.out.println(cat.toString());
        System.out.println(pedigreeCat.toString());
        pedigreeCat.setName("Mrrrrr");
        System.out.println(pedigreeCat.toString());
    }
}
