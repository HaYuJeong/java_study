package poly.car0;

/**
 * packageName : poly.car0
 * fileName : CarMain0
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
public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

//        추가
        Model3Car model3Car  = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
