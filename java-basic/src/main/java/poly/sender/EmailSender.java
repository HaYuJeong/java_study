package poly.sender;

/**
 * packageName : poly.sender
 * fileName : EmailSender
 * author : hayj6
 * date : 2024-06-03(003)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-03(003)         hayj6          최초 생성
 */
public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다 : " + message);
    }
}
