package 제네릭프린터;

public class Powder extends Material {
    @Override
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }
    @Override
    public String toString() {      // 만약 오버라이딩하지 않는다면 패키지.클래스이름@16진수해시코드값
        return "재료는 Powder 입니다.";
    }
}
