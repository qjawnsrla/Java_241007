package String토커나이즈;
// 문자열을 특정 구분자 기준으로 쪼개서부분 문자열로 만드는 것
// String.split() 을 사용하는 방법 더 좋음
// countTokens() : 꺼내지 않고 남은 토큰의 수
// hasMoreTokens() : 남아있는 토큰이 있는지 여부 확인
// nextToken() : 토큰을 하나씩 빼옴

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        tokenFunc();    // 스트링 토커나이즈를 이용하는 방식 (옛날 방식)
        splitFunc();    // 문자열의 split() 메소드를 이용하는 방식
        classFunc();
    }

    static void tokenFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 / 기준으로 입력하세요 : ");
        String name = sc.nextLine();
        StringTokenizer st = new StringTokenizer(name, "/");    // delim 에는 구분자만 넣을 수 있다
        String[] nameSub = new String[st.countTokens()];    // 문자열 배열의 크기를 정함
        int idx = 0;
        while (st.hasMoreTokens()) {    // 조건문의 반복 여부를 hasMoreTokens() 반환값으로 결정
            nameSub[idx++] = st.nextToken();
        }
        System.out.println(Arrays.toString(nameSub));
    }

    static void splitFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 / 기준으로 입력하세요 : ");
        String name = sc.nextLine();
        String[] nameSub = name.split("[/,;]");     // regex(레귤러익스프레션, 정규표현식) 3개중에 아무거나 와도 구분 가능
        System.out.println(Arrays.toString(nameSub));
    }

    static void classFunc() {
        Studnet studnet = new Studnet();
        System.out.println(studnet.getClass());
        Scanner sc = new Scanner(System.in);
    }
}

class Studnet{
    String name = "범준";
}