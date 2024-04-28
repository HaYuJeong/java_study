package ref;

/**
 * packageName : ref
 * fileName : MethodChange1
 * author : hayj6
 * date : 2024-04-28(028)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-28(028)         hayj6          최초 생성
 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a);
    }

    static void changePrimitive(int x){
        x = 20;
    }
}
