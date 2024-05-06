package oop1;

/**
 * packageName : oop1
 * fileName : Account
 * author : hayj6
 * date : 2024-05-06(006)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-06(006)         hayj6          최초 생성
 */
public class Account {
    int balance;
    void deposit(int amount){
        balance = balance + amount;
    }

    void withdraw(int amount){
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
