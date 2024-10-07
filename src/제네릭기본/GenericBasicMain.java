package 제네릭기본;
// 제네릭이란? 데이터 타입을 일반화한다는 의미, 데이터 타입 또는 자료구조에 상관없이 동일한 프로그래밍 가능
// 클래스나 메소드에서 사용할 내부데이터 타입을 컴파일 시 미리지정하는 방식 사용

import java.util.ArrayList;
import java.util.List;

public class GenericBasicMain {
    public static void main(String[] args) {
        genericTypeVariable();
    }

    // 제네릭 타입 제한 : 컴파일 시 타입체크 가능, 타입변환 제거
    static void genericBasicFunc(){
        List<String> list = new ArrayList<>();
        list.add("100");    // 여기서 컴파일 시 타입체크
        list.add("안녕하세요.");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
//        System.out.println((Integer) list.get(0));
    }

    static void genericTypeVariable(){
        Person<String> p1 = new Person<>("안유진");
        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
    }
}

// <T> : 타입 변수를 의미하며 관례상 매개변수가 1개인 경우에 대문자 T로 표기
class Person<T> {
    //private int info;     // 아래처럼 선언 가능
    private T info;     // 이 상태의 T는 어떤 타입이든 올 수 있는 상태
    Person(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}