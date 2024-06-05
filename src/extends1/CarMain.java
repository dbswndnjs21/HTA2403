package extends1;

public class CarMain {
    public static void main(String[] args) {
        GasCar a = new GasCar();
        Car b = new GasCar(); // 다형성 참조
        Car c = new Car();

        a.chage();  // 부모에도 있지만 호출하는 변수의 타입이 자식이기때문에 자식 클래스의 chage호출
        b.chage();  // 부모 타입으로 호출을 했지만 메서드 오버라이딩을 통해 자식 chage 호출
        c.chage();   // 부모 클래스는 자식 클래스에 뭐가있는지 모름
    }
}
