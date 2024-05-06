package oop1;

/**
 * packageName : oop1
 * fileName : MusicPlayerMain1
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
public class MusicPlayerMain4 {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태
        player.showStatus();

        // 음악 플레이어 끄기
        player.off();
    }
}
