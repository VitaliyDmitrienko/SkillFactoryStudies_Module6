// Задача А11
public class CheckingAccount extends Account {
//    int balance=0;

    public CheckingAccount (int balance) {
        super(balance);
    }

    public void withdraw(int n) {
        balance = balance - n;
    }

    public void put(int n) {
        balance = balance + n;
    }

    public int checkBalance() {
        return balance;
    }

    public int getDebt() {
        if (balance < 0) return balance;
        else return 0;
    }

}
