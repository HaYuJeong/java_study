package poly.car1;

/**
 * packageName : poly.car1
 * fileName : Model3Car
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
public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}
