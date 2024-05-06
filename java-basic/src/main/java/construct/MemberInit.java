package construct;

/**
 * packageName : construct
 * fileName : MemberInit
 * author : hayj6
 * date : 2024-05-06(006)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-06(006)         hayj6          최초 생성
 */
public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
