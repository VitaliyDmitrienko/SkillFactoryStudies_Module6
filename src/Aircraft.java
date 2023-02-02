public class Aircraft {
    int number;
    int speed;

    public Aircraft (int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double flight(int n) {
        return (double) n/speed;
        }
}
