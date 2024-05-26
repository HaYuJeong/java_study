package access.b;

/**
 * packageName : access.b
 * fileName : BankAccount
 * author : hayj6
 * date : 2024-05-26(026)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-26(026)         hayj6          최초 생성
 */
public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount){
        balance += amount;
    }

    private boolean isAmountValid(int amount){
//        금액이 0보다 커야함
        return amount > 0;
    }
}
