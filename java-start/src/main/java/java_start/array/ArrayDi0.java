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
public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];    // 행2개, 열3개

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println(arr[0][0] + " ");
        System.out.println(arr[0][1] + " ");
        System.out.println(arr[0][2] + " ");
        System.out.println();       // 한 행이 끝나면 라인을 변경한다.

        System.out.println(arr[1][0] + " ");
        System.out.println(arr[1][1] + " ");
        System.out.println(arr[1][2] + " ");
        System.out.println();       // 한 행이 끝나면 라인을 변경한다.
    }
}
