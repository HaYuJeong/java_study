package poly.ex4;

/**
 * packageName : poly.ex4
 * fileName : AbstractMain
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
public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(cow);
    }

    private static void moveAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 이동 테스트 시작");
        abstractAnimal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
