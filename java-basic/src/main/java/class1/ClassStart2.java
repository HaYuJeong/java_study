package class1;

/**
 * packageName : class1
 * fileName : ClassStart1
 * author : hayj6
 * date : 2024-04-27(027)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-27(027)         hayj6          최초 생성
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 :" + studentAges[i] + " 성적 : " + studentGrades[i]);
        }
    }
}
