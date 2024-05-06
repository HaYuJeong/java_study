package oop1;

import com.sun.jdi.Value;

/**
 * packageName : oop1
 * fileName : valueData
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
public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.value);
    }

    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
