package Math클래스;
// 클래스 메소드 : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
// 모든 메소드는 클래스 메소드이므로 객체 생성없이 바로 사용
// java.lang 에 포함되어 있어 별도의 import가 필요없음

import java.math.BigDecimal;

public class MathClassEx {
    public static void main(String[] args) {
        randomFunc();
        System.out.println();
        MathMethodFunc();
    }
    // random() 메소드 0.0 이상에서 1.0 미만의범위에서 임의의 double형 값 1개를 반환
    // 1 ~ 100 사이의 임의의 수를 만들기 위해서 * 100

    static void randomFunc() {
        for (int i=0; i<50; i++){
            System.out.print((int)(Math.random() * 100) + " ");     // 1 ~ 100 사이의 임의의 수
        }
    }

    // abs() 메소드 : 절대값 구하는 메소드
    // floor : 주어진 숫자를 내림한 결과를 반한
    // ceil() : 주어진 숫자를 올림한 결과를 반환
    // round() : 소숫점 첫째 자리에서 반올림한 결과를 반환
    // BigDecimal() : 메소드를 import해서 사용하는 방법이 권장되는 방식
    static void MathMethodFunc(){
        System.out.println(Math.abs(-10));  // 출력결과 : 10
        System.out.println(Math.abs(10));   // 출력결과 : 10
        // floor()
        System.out.println(Math.floor(10.999999999));   // 출력결과 : 10.0
        // ceil()
        System.out.println(Math.ceil(10.000000001));    // 출력결과 : 11.0
        // roung()
        System.out.println(Math.round(10.499999999));   // 출력결과 : 10, 소숫점 첫쨰 자리를 반올림
        System.out.println(Math.round(10.599999999));   // 출력결과 : 11
        // min() & max()
        System.out.println(Math.min(20, 30));   // 출력결과 : 20
        System.out.println(Math.max(20, 30));   // 출력결과 : 30
        BigDecimal number = new BigDecimal("10.345");
        System.out.println(number.setScale(2, BigDecimal.ROUND_HALF_UP));     // 출력결과 : 10.35



    }
}
