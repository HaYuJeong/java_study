package poly.basic;

import javax.management.openmbean.CompositeDataInvocationHandler;

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
public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
