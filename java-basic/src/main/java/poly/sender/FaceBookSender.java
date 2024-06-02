package poly.sender;

/**
 * packageName : poly.sender
 * fileName : FaceBookSender
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
public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다 : " + message);
    }
}
