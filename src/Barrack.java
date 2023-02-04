public class Barrack {
     final static private int MAX = 3;
    private Soldier[] soldiers;
    private int n = 0;


    public Barrack() {
        soldiers = new Soldier[MAX];
    }

    void add (Soldier soldier) {
        if (n < MAX) {
            soldiers [n] = soldier;
            n++;
            System.out.println("Soldier into barrack added: " + soldier);
        }
        else {
            System.out.println("No more space! No more soldiers can be added to barrack!" );
        }
    }

    public void visit(){
        for (int i = 0; i < soldiers.length; i++) {
            if(soldiers[i] != null) soldiers[i].sound();
        }
    }

}
