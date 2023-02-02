// Задача А12

public class MainA13 {
    public static void main(String[] args) {

//        Aircraft aircraft = new Aircraft();
        Helicopter helicopter = new Helicopter(1947687,200,6,1400);
        System.out.println(helicopter.flight(1500));

        Aeroplane aeroplane = new Aeroplane(7859945,400,35);
        System.out.println(aeroplane.flight(2500));

        Aircraft aircraft = new Aircraft(00000001,950);
        System.out.println(aircraft.flight(12500));

    }
}

