package ref;

/**
 * packageName : ref
 * fileName : NullMain2
 * author : hayj6
 * date : 2024-05-01(001)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-01(001)         hayj6          최초 생성
 */
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;    // NullPointException 예외 발생
        System.out.println("data " + data.value);
    }
}
