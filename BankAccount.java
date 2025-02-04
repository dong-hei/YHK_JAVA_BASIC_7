package section7_access;

/**
 * 캡슐화 - 데이터는 모두 숨기고 기능은 꼭 필요한 기능만 열자.
 */
public class BankAccount {

    private int balance; // 데이터는 모두 숨기고

    public BankAccount() {
        balance = 0;
    }

    // public 메소드: deposit / 외부에 오픈해야 하는 기능
    public void deposit(int amount){
        if (isAmountValid(amount)){
            balance += amount;
        } else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메소드 : withdraw / 외부에 오픈해야 하는 기능
    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메소드 : getBalance
    public int getBalance(){
        return balance;
    }

    // private 메소드 : isAmountValid / 외부에서 쓸일이 없는 기능
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }
}
