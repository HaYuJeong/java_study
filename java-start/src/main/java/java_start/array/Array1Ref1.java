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
public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students = new int[5];     // 배열 변수 선언

        System.out.println(students);

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생 1 점수 : " + students[0]);
        System.out.println("학생 1 점수 : " + students[1]);
        System.out.println("학생 1 점수 : " + students[2]);
        System.out.println("학생 1 점수 : " + students[3]);
        System.out.println("학생 1 점수 : " + students[4]);

        System.out.println("학생 1 점수 : " + students[0]);

    }
}
