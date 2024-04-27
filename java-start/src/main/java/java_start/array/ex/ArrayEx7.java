package java_start.array.ex;

import java.util.Scanner;

/**
 * packageName : java_start.array.ex
 * fileName : ArrayEx7
 * author : hayj6
 * date : 2024-04-08(008)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-08(008)         hayj6          최초 생성
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();      // 3
        int[] arr = new int[n];
        int sum = 0;
        System.out.println(n + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // 1 2 3
            sum = sum + arr[i];
        }

        double avg = (double) sum / n;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);

    }
}
