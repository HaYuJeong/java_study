package oop1;

/**
 * packageName : oop1
 * fileName : MusicPlayer
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
public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
