package ref;

/**
 * packageName : ref
 * fileName : VarChange2
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
public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA);       // ref.Data@214c265e
        System.out.println("dataB 참조값 = " + dataB);       // ref.Data@214c265e
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

//        dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value" + dataA.value);
        System.out.println("dataB.value" + dataB.value);
    }
}
