package poly.basic;

/**
 * packageName : poly.basic
 * fileName : CastingMain5
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
public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출 ");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();

        if(parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else{
            System.out.println("Child 인스턴스 아님");
        }

    }
}
