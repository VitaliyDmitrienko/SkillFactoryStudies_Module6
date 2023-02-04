// Доп. Задача 2
public class Knight extends Soldier{

//    String name;
//    int price;
//    String phrase;

    public Knight(String name){
        super(name);
        this.price = 245;
        this.phrase = "Наше дело правое, а врага — найдем";
    }
    public void feed(){
        System.out.println("Кормит коня");
    }


}
