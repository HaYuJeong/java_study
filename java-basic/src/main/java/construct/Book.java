package construct;

/**
 * packageName : construct
 * fileName : Book
 * author : hayj6
 * date : 2024-05-13(013)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-13(013)         hayj6          최초 생성
 */
public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("", "", 0);
    }
    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목 : " + title + " 저자 :" + author + " 페이지 : " + page);
    }
}
