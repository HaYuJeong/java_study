package poly.basic;

/**
 * packageName : poly.basic
 * fileName : CastingMain4
 * author : hayj6
 * date : 2024-06-01(001)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-01(001)         hayj6          최초 생성
 */
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
        child2.childMethod();   // 실행 불가
    }
}
