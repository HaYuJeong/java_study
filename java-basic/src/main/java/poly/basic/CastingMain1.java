package poly.basic;

/**
 * packageName : poly.basic
 * fileName : CastingMain1
 * author : hayj6
 * date : 2024-05-31(031)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-31(031)         hayj6          최초 생성
 */
public class CastingMain1 {
    public static void main(String[] args) {
//        부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
//        단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
//        poly.childMethod();

//        다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // x001
        child.childMethod();
    }
}
