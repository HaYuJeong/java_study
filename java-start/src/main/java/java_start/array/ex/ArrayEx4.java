package java_start.array.ex;

import java.util.Scanner;

/**
 * packageName : java_start.array.ex
 * fileName : ArrayEx4
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
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            System.out.println(arr[i]);
        }

        System.out.print("입력한 정수의 합계 : ");
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        double avg = (double) sum / arr.length;
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
