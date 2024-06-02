package poly.ex6;

/**
 * packageName : poly.ex6
 * fileName : AbstractAnimal
 * author : hayj6
 * date : 2024-06-02(002)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-02(002)         hayj6          최초 생성
 */
public abstract class AbstractAnimal {
    public abstract void sound();
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
