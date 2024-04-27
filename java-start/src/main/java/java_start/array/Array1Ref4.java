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
public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};     // 배열 생성과 초기화 간략하게 생성

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
