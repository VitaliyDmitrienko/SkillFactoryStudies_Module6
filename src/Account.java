// Задача А11

public class Account {
    int balance;

    public Account (int balance) {
        this.balance = balance;
    }

    public void withdraw(int n) {
        balance = balance - n;
        if (balance < 0) balance = 0;
    }

    public void put(int n) {
        balance = balance + n;
    }

    public int checkBalance() {
        return balance;
    }

}