package java_start;

/**
 * packageName : java_start
 * fileName : While
 * author : hayj6
 * date : 2024-04-07(007)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-07(007)         hayj6          최초 생성
 */
public class For {
    public static void main(String[] args) {

//        int count = 1;
//        while(count <= 10){
//            System.out.println(count);  // count = 1부터 출력
//            count++;                    // 1++ 해서 2
//        }

        int num = 2;
        int count = 1;

        while(count <= 10){
            System.out.println(num);
            num = num + 2;
            count++;
        }
    }
}
