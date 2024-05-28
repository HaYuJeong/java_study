package final1;

/**
 * packageName : final1
 * fileName : FinalLocalMain
 * author : hayj6
 * date : 2024-05-28(028)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-28(028)         hayj6          최초 생성
 */
public class FinalLocalMain {
    public static void main(String[] args) {
//        final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 오류

//        final 지역 변수2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류

//        method(10);
    }
//    static void method(final int parameter){
//        parameter = 20;
//    }
}
