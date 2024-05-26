package memory;


/**
 * packageName : memory
 * fileName : JavaMemoryMain2
 * author : hayj6
 * date : 2024-05-26(026)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-26(026)         hayj6          최초 생성
 */
public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1(){
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2){
        System.out.println("method2 start");
        System.out.println("data.value= " + data2.getValue());
        System.out.println("method2 end");
    }
}
