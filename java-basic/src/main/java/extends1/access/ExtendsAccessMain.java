package extends1.access;

import extends1.access.child.Child;

/**
 * packageName : extends1.access
 * fileName : ExtendsAccessMain
 * author : hayj6
 * date : 2024-05-29(029)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-29(029)         hayj6          최초 생성
 */
public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
