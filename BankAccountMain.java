package section7_access;

/**
 * 캡슐화
 */

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(10000);
        a.withdraw(1000);
        System.out.println("balance = " + a.getBalance());
    }
}
