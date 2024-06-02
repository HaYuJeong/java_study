package poly.car1;

/**
 * packageName : poly.car1
 * fileName : Driver
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
public class Driver {
    private Car car;

    // 멤버 변수에 자동차를 설정한다. 외부에서 누군가 이 메서드를 호출해주어야
    // Driver는 새로운 자동차를 참조하거나 변경할 수 있다.
    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
