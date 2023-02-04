// Задача А11
public class Deposit extends Account{

    private int period;
    private double percent;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public double withdraw() {
        if (isPeriodExpired()) {
            double withDraw = (double) (balance * (100+percent)) / 100;
//            double res = Double.parseDouble(String.valueOf(balance * (100 + percent))) / 100;
            balance = 0;
            return withDraw;
        } else return 0;
    }

    public void waitDays(int n) {
        period -= n;
    }

    public boolean isPeriodExpired() {
        return (period <= 0);
    }
}