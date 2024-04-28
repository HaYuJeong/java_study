package ref;

/**
 * packageName : ref
 * fileName : VarChange1
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
public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);     // 10
        System.out.println("b = " + b);     // 10

        // a 값 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 10

        // b 값 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 30
    }
}
