package Wrapper클래스;
// Wrapper 클래스란? 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해주는 클래스

public class WrapClassEx {
    public static void main(String[] args) {
        // Boxing : 기본 타입을 참조 타입 내에 넣는 것 ( 객체에 기본 타입을 집어넣는 것 )
        Integer x = 100;    // Auto Boxing
        int xx = x;     // Auto Unboxing

//        IntegerEx integerEx = new IntegerEx();
//        integerEx.x = 100;
//        System.out.println(integerEx.x);
    }
}

class IntegerEx {
    int x;
    IntegerEx(int x) {
        this.x = x;
    }
}