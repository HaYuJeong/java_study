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
public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};    // 행2개, 열3개

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();       // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
