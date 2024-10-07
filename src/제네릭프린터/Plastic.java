package 제네릭프린터;

public class Plastic {
    public void doPrinting(){
        System.out.println("Plastic 재료로 출력합니다.");
    }
    // 오버라이딩을 통해 toString을 찍고 싶은 문장이 찍히도록 한 것. 만약 그렇지 않다면 객체에 대한 정보가 찍힌다
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
