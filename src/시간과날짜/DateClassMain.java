package 시간과날짜;
// Date 클래스 : 자바 초기 버전부터 제공되는 클래스
// java.util 패키지에 포함되어 있음
// Date 객체는 UTC(협정 시계시) 를 기준으로 1970년 1월 1일 자정부터 경과 시간 계산 (밀리초 단위)
// 불변성 없음, 현재 실무에서 거의 사용되지 않음

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClassMain {
    public static void main(String[] args) {
        DateFunc();
    }

    static void DateFunc(){
        Date date = new Date();
        System.out.println(date);
        // 원하는 포맷으로 날짜정보 출력
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        System.out.println(sdf.format(date));
        System.out.println();

        // yyyy : 년도를 4자리로 표현, yy : 년도를 2자리로 표
        // MM : 월을 표시 (대문자임에 유의) 2자리 차지
        // HH : 24시간제를 의미, hh : 12시간제를 의미
        // mm : 분을 의미
        // ss : 초를 의미
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        int x = 0, y = 0, z = 0;
        f1 = new SimpleDateFormat("yyyy-MM-dd");    // 출력결과 : 2024-10-07
        System.out.println(f1.format(date));
        f2 = new SimpleDateFormat("yy/MM/dd");      // 출력결과 : 24/10/07
        System.out.println(f2.format(date));
        f3 = new SimpleDateFormat("yyyy년MM월dd일");  // 출력결과 : 2024년10월07일
        System.out.println(f3.format(date));
        f4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");   // 출력결과 : 2024-10-07 11:16:21
        System.out.println(f4.format(date));
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다.");  // 출력결과 : 오늘은 10월의 2번째 주, 7번째 날입니다.
        System.out.println(f5.format(date));
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");   // 출력결과 : 오늘은 2024년의 41주차 입니다.
        System.out.println(f6.format(date));
    }

    // Calendar 클래스 : Date 클래스의 단점을 보완하기 위해 도입됨
    // java.util 포함
    // Calendar는 추상클래스로, 특정 국가나 문화의 달력 시스템에 맞게 하위 클래스가 구현되어 있음
    static void CalendarFunc(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));    // 배열의 인덱스에 맞춰져 있음
    }
}
