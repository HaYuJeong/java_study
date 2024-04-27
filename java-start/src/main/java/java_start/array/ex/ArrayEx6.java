package java_start.array.ex;

import java.util.Scanner;

/**
 * packageName : java_start.array.ex
 * fileName : ArrayEx6
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
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();  // 3

        int[] arr = new int[n];     // 3개짜리 배열 arr
        int min = 100;
        int max = -100;
        System.out.println(n + "개의 정수를 입력하세요");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // 입력하는 숫자를 배열에 담음
//            arr[0] = 1
            if(min > arr[i]){
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);






    }
}
