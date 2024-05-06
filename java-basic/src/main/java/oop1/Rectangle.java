package oop1;

/**
 * packageName : oop1
 * fileName : Rectangle
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
public class Rectangle {
    int width ;
    int height;

     int calculateArea() {
        return width * height;
    }
     int calculatePerimeter() {
        return 2 * (width + height);
    }
     boolean isSquare() {
        return width == height;
    }
}
