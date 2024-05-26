package access.ex;

/**
 * packageName : access.ex
 * fileName : MaxCounter
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
public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
