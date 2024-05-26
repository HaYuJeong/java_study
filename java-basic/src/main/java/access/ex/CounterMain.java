package access.ex;

import javax.crypto.Mac;

/**
 * packageName : access.ex
 * fileName : CounterMain
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
public class CounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(3);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        int count = maxCounter.getCount();
        System.out.println(count);
    }
}
