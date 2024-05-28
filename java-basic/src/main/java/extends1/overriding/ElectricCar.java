package extends1.overriding;

/**
 * packageName : extends1.ex2
 * fileName : ElectricCar
 * author : hayj6
 * date : 2024-05-28(028)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-28(028)         hayj6          최초 생성
 */
public class ElectricCar extends Car {

    @Override
    public void move(){
        System.out.println("빠르게 이동합니다.");
    }
    public void charge(){
        System.out.println("충전합니다.");
    }
}
