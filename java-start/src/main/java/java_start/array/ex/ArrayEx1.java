package java_start.array.ex;

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
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] student = new int[5];

        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        int sum = 0;

        for (int i = 0; i < student.length; i++) {
            sum = sum + student[i];
        }

        double average = (double) sum / student.length;

        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + average);
    }
}
