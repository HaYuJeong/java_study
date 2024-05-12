package construct;

import java.lang.reflect.Member;

/**
 * packageName : construct
 * fileName : MemberConstruct
 * author : hayj6
 * date : 2024-05-07(007)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-07(007)         hayj6          최초 생성
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

//    추가
    MemberConstruct(String name, int age){
        this(name, age, 50);        // 변경
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
