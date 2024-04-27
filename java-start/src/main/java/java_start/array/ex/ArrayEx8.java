package java_start.array.ex;

import java.util.Scanner;

/**
 * packageName : java_start.array.ex
 * fileName : ArrayEx8
 * author : hayj6
 * date : 2024-04-09(009)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09(009)         hayj6          최초 생성
 */
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 :");
            for (int j = 0; j < 3; j++) {
                System.out.println(subjects[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total = total + scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점 : " + total + "평균 : " + average);
        }
//        int sum[0] = arr[0][0] + arr[0][1] + arr[0][2];
//        int avg[0] = sum / 3;
    }
}
