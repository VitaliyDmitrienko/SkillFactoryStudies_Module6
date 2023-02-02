// Задача А11

public class MainA11 {
    public static void main(String[] args) {

//        Account account = new Account(150);
//        account.put(50);
//        System.out.println(account.checkBalance());

//        CheckingAccount checkingAccount = new CheckingAccount(250);
//        checkingAccount.withdraw(150);
//        System.out.println(checkingAccount.checkBalance());
//        System.out.println(checkingAccount.getDebt());


        Deposit deposit = new Deposit(1000, 15, 2.0D);
        deposit.waitDays(5);
        System.out.println(deposit.withdraw());
        System.out.println("Expired? " + deposit.isPeriodExpired());
        deposit.waitDays(10);
        System.out.println("Expired? " + deposit.isPeriodExpired());
        System.out.println(deposit.withdraw());



    }
}

