package extends1.ex3;


import org.w3c.dom.html.HTMLHeadElement;

/**
 * packageName : extends1.ex2
 * fileName : CarMain
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
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
    }
}
