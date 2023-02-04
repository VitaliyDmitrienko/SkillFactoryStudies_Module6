// Доп. Задача 2
public class Rifleman extends Soldier{

//    String name;
//    int price;
//    String phrase;

    public Rifleman(String name){
        super(name);
        this.price = 135;
        this.phrase = "Мушкет и жену не дам никому";
    }

    public void attack() {
        System.out.println(this.name + " стреляет издалека! Редко, но метко!");
    }


}
