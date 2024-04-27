package java_start.array;

/**
 * packageName : java_start
 * fileName : Array1
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
public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};


//        일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

//        향상된 for문, for-each 문
        for (int number : numbers){
            System.out.println(number);
        }

//        향상된 for문을 못쓰는 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는" + numbers[i]);

        }
    }
}
