package oop1;

/**
 * packageName : oop1
 * fileName : RectangleOopMain
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
public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square);
    }
}
