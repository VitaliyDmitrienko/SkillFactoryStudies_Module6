// Задача А11
public class Deposit extends Account {

    private int period;
    private int daysToClose;
    private double percent;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
        daysToClose = period;
    }

//    @Override
    public double withdraw() {
        if (isPeriodExpired()) {
            double withDraw = (double) balance * (1 + percent*period);
            balance = 0;
            return withDraw;
        } else return 0;
    }
    public void waitDays(int n) {
        daysToClose = daysToClose - n;
    }

    public boolean isPeriodExpired() {
        return (daysToClose < 0);
    }
}