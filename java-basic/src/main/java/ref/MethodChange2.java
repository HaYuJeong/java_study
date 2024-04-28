package ref;

/**
 * packageName : ref
 * fileName : MethodChange2
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
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);  // 10
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);  // 20
    }

    static void changeReference(Data dataX){
        dataX.value = 20;
    }
}
