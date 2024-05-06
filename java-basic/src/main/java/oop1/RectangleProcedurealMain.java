package oop1;

/**
 * packageName : oop1
 * fileName : RectangleProcedurealMain
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
public class RectangleProcedurealMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("넓이 : " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }
    static int calculateArea(int width, int height) {
        return width * height;
    }
    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
