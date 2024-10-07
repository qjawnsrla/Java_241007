package 제네릭프린터;

// <T extends Material> Material 클래스로부터 상속받은 타입만 올수 있음
public class GenericPrinter<T extends Material> {
    private T material;     // T 타입 변수로 재료의 형태가 결정, T타입에 대한 참조변수 material

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }
    public void printing() {
//        material.toString();
        material.doPrinting();
    }
}
